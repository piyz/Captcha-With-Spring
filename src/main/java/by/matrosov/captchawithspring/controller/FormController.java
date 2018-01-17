package by.matrosov.captchawithspring.controller;

import by.matrosov.captchawithspring.model.Form;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller
public class FormController {

    @RequestMapping(method = RequestMethod.GET)
    public String home(ModelMap modelMap){
        modelMap.put("form", new Form());
        return "home";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String next(@ModelAttribute("form") Form form, HttpServletRequest req, ModelMap modelMap){
        String captcha = req.getSession().getAttribute("captcha_security").toString();
        String verifyCaptcha = req.getParameter("captcha");
        if (captcha.equals(verifyCaptcha)){
            return "success";
        }else {
            modelMap.put("error", "Captcha Invalid");
            return "home";
        }
    }
}
