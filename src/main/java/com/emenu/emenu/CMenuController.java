package com.emenu.emenu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CMenuController {

    @Autowired
    private CategoryService categoryService;
    @Autowired
    private ItemService itemService;

    @GetMapping("/")
    public String emenu(Model model)
    {

        model.addAttribute("categories", itemService.menu());
        model.addAttribute("items",itemService.findAll());
        //itemService.menu();
        System.out.println(itemService.menu());
       // System.out.println(itemService.findAll());
        return "cmenu";
    }
}
