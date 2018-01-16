package by.matrosov.captchawithspring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class FormController {

    @RequestMapping(method = RequestMethod.GET)
    public String home(ModelMap modelMap){
        modelMap.put("form", new Form());
        return "home";
    }
}
