package web.controller;

import java.util.Locale;
import com.sun.deploy.net.HttpResponse;
import org.apache.log4j.Logger;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Reshetnyak Viktor on 11.01.2016.
 * Project proff29
 * Package web.web.controller
 */

@Controller
public class MyServlet extends HttpServlet {
    public static final Logger log = Logger.getLogger(MyServlet.class);

//    @Value( "${nameApp}" )
    private final String NAME_APP = "'null'";

//    @Value( "${msg_err_login}" )
    private final String MSG_ERR_LOGIN = "'null'";


    public MyServlet() {
    }

    @RequestMapping(value = "/index", method = {RequestMethod.GET, RequestMethod.HEAD})
    public String index_index(Model model) {
        log.info(NAME_APP + ".index_index()");
        return "/index";
    }

    @RequestMapping(value = "/j_auth", method = {RequestMethod.POST})
    public String j_auth(Model model,
                         HttpServletRequest request, HttpResponse response) {
        log.info(NAME_APP + ".j_auth()");
        HttpSession session = request.getSession(true);
        String username = request.getParameter("j_username");

        if (username == null || username.isEmpty()){
            session.setAttribute(SessionCheckFilter.C_ERROR_MESSAGE, "");
        } else {
            session.setAttribute(SessionCheckFilter.C_LOGIN_USER, username);
        }
        return "/index";
    }


    @RequestMapping(value = "/", method = {RequestMethod.GET, RequestMethod.HEAD})
    public String index(Locale locale) {
//        log.info(NAME_APP + ".index()");
        log.info(NAME_APP + "/Welcome home! The client locale is " + locale.getLanguage());

        return "/index";
    }
}
