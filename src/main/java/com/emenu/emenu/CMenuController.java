package com.emenu.emenu;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CMenuController {
    @GetMapping("/")
    public String emenu(){
            return "cmenu";
        }
}
