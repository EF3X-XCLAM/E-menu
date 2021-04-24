package com.emenu.emenu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CMenuController {

    @Autowired
    private CategoryService categoryService;
    @Autowired
    private ItemService itemService;

    @GetMapping("/")
    public String emenu()
    {
        itemService.menu();
        //System.out.println(categoryService.findAll());
        return "cmenu";
    }
}
