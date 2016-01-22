package quiz.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import quiz.exception.AuthenticationException;
import quiz.service.AuthenticationService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by Reshetnyak Viktor on 18.01.2016.
 * Package quiz.controller
 */
@Controller
public class AuthenticationController {
    public static final Logger log = Logger.getLogger(AuthenticationController.class);
/*
    @Autowired(required = true)
    @Value( "${nameApp}" )
    private String contextPath;
*/
    @Autowired(required = true)
    private AuthenticationService authService;

    public AuthenticationController() {
    }

    @RequestMapping(value = "/auth", method = RequestMethod.POST)
    public
    String auth(@RequestParam("login") String login,
              Model model, HttpServletResponse response) {
        String error_message = null;
        model.addAttribute("login", login);
        try {
            if (authService.authenticate(login)){
                response.sendRedirect(response.encodeRedirectURL(/*contextPath + "/" + */"dashboard"));
                return "/dashboard";
            }
        } catch (AuthenticationException er) {
            log.info("AuthenticationException " + er.getMessage());
            er.printStackTrace();
            error_message = er.getMessage();
        } catch (IOException e) {
            e.printStackTrace();
        }
        model.addAttribute("error_auth", true);
        model.addAttribute("error_message", error_message);
        return "index";
    }

    @RequestMapping(value = "/logout", method = {RequestMethod.GET, RequestMethod.HEAD})
    public String logout(Model model, HttpServletRequest request) {
        HttpSession session = request.getSession(true);
        log.info("/logout");
        session.invalidate();
        return "/index";
    }

    @RequestMapping(value = "/", method = {RequestMethod.GET, RequestMethod.HEAD})
    public String index(Model model) {
        log.info("index(Model model)");
        return "/index";
    }


    @RequestMapping(value = "test2", method = {RequestMethod.GET})
    public String test(){
        log.info("test2(Model model)");
        try {
            System.out.println(this.getClass().getCanonicalName() + ".test2(Model model)");
            authService.fill();
        } catch (Exception exception){
            exception.printStackTrace();
            System.out.println("Error execute test2()" + exception.getMessage());
        }
        return "/index";
    }
}