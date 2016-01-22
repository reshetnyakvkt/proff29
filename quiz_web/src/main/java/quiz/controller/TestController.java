package quiz.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import quiz.service.TestService;

/**
 * Created by Reshetnyak Viktor on 21.01.2016.
 * Package quiz.controller
 */
@Controller
public class TestController {
    public static final Logger log = Logger.getLogger(TestController.class);

    @Autowired(required = true)
    private TestService testService;

    public TestController() {
    }

    @RequestMapping(value = "test", method = {RequestMethod.GET})
    public String test(){
        log.info("test(Model model)");
        try {
            System.out.println(this.getClass().getCanonicalName() + ".test(Model model)");
            testService.fill();
        } catch (Exception exception){
            exception.printStackTrace();
            System.out.println("Error execute test()" + exception.getMessage());
        }
        return "/index";
    }
}
