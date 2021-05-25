package com.emenu.emenu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller
public class CMenuController {

    @Autowired
    private CategoryService categoryService;
    @Autowired
    private ItemService itemService;
    @Autowired
    private TableService tableService;


    @GetMapping("/table11")
    public String emenu(Model model, HttpServletResponse response) throws IOException {
        System.out.println(tableService.getTable(1));
        model.addAttribute("table", tableService.getTable(1));
        model.addAttribute("categories", itemService.menu());
        model.addAttribute("items",itemService.findAll());
        model.addAttribute("itemImage",itemService);
        System.out.println(itemService.menu());
        return "cmenu";
    }

    @GetMapping("/table12")
    public String emenu2(Model model, HttpServletResponse response) throws IOException {
        System.out.println(tableService.getTable(2));
        model.addAttribute("table", tableService.getTable(2));
        model.addAttribute("categories", itemService.menu());
        model.addAttribute("items",itemService.findAll());
        model.addAttribute("itemImage",itemService);
        System.out.println(itemService.menu());
        return "cmenu";
    }


}
