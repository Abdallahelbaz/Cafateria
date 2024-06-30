package com.example.Cafateria.Controllers;


import com.example.Cafateria.Database.Menu;
import com.example.Cafateria.Services.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class MenuContr {
    @Autowired
    private MenuService service;


    @GetMapping
    public String getAllMenus(Model model) {
        List<Menu> menus = service.getAllMenus();
        model.addAttribute("menus", menus);
        return "create_menu";  // Thymeleaf template name
    }


    @GetMapping("/createMenu")
    public String createMenu(Model model){
        Menu menu=new Menu();
        model.addAttribute("menus",menu);
        return "login";
    }

    @PostMapping("/createMenu")
    public String createMenu(@ModelAttribute Menu menu, Model model) {
        model.addAttribute("menus", menu);
        service.createMenu(menu);
        return "redirect:/";
    }
}
