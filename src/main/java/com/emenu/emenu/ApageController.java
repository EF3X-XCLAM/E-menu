package com.emenu.emenu;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ApageController {

    @GetMapping("/adminO")
    public String aOrder(){
        return "order";
    }

    @GetMapping("/adminM")
    public String aMenu(){
        return "amenu";
    }

    //@RequestMapping(value = "/loginn", method = RequestMethod.POST)
    @GetMapping("/loginn")
    public String login(Model model, String error) {
        if(error !=null){
            model.addAttribute("error", "Email or Password is Invaild");
        }

        return "login";

    }
}
