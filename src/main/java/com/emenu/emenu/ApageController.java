package com.emenu.emenu;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

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
}
