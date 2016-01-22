package quiz.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import quiz.exception.AuthenticationException;
import quiz.service.AuthenticationService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created by Reshetnyak Viktor on 21.01.2016.
 * Package quiz.controller
 */
@Controller
public class DashboardController {
    public static final Logger log = Logger.getLogger(DashboardController.class);

    @Autowired(required = true)
    private AuthenticationService authService;

    public DashboardController() {
    }

    @RequestMapping(value = "/dashboard", method = {RequestMethod.GET, RequestMethod.HEAD})
    public String logout(HttpServletRequest request) {
        try {
            if (!authService.authenticate((String)request.getAttribute("login"))){
                return "index";
            }
        } catch (AuthenticationException e) {
            e.printStackTrace();
        }
        return "/dashboard";
    }
}
