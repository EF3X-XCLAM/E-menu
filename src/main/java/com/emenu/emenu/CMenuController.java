package com.emenu.emenu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller
public class CMenuController {

    @Autowired
    private CategoryService categoryService;
    @Autowired
    private ItemService itemService;

    @GetMapping("/")
    public String emenu(Model model, HttpServletResponse response) throws IOException {
        /*List<Item> newlist = (List<Item>) itemService.findAll();
        response.setContentType("image/jpeg, image/jpg, image/png, image/gif");
        response.getOutputStream().write(newlist.get(0).getImage());
        response.getOutputStream().close();*/

        model.addAttribute("categories", itemService.menu());
        model.addAttribute("items",itemService.findAll());
        model.addAttribute("itemImage",itemService);
        //itemService.menu();
        System.out.println(itemService.menu());
       // System.out.println(itemService.findAll());
        return "cmenu";
    }
}
