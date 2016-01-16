package web.controller;

import org.apache.log4j.Logger;
import javax.servlet.http.HttpServlet;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Reshetnyak Viktor on 11.01.2016.
 * Project proff29
 * Package web.web.controller
 */

@Controller
public class MyServlet extends HttpServlet {
    public static final Logger log = Logger.getLogger(MyServlet.class);

    private String name = "";

    public MyServlet() {
    }

    @RequestMapping(value = "/index", method = {RequestMethod.GET, RequestMethod.HEAD})
    public String index_index(Model model) {
        log.info("index_index()/index web.controller");
        return "/index";
    }


    @RequestMapping(value = "/", method = {RequestMethod.GET, RequestMethod.HEAD})
    public String index(Model model) {
        log.info("index()/index web.controller");
        return "/index";
    }
}
