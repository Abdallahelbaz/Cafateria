package com.example.Cafateria.Controllers;

import com.example.Cafateria.Database.Menu;
import com.example.Cafateria.Database.User;
import com.example.Cafateria.Services.MenuService;
import com.example.Cafateria.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

//import java.util.List;
//@Controller
public class Usercont {

//    @Autowired
//    private UserService service;
//
//
//    @GetMapping("getall")
//    public String getAllMenus(Model model) {
//        List<User> menus = service.getAllUsers();
//        model.addAttribute("users", menus);
//        return "create_menu";  // Thymeleaf template name
//    }
//
//
//    @GetMapping("/createUser")
//    public String createMenu(Model model){
//        Menu menu=new Menu();
//        model.addAttribute("menus",menu);
//        return "login";
//    }
//
//    @PostMapping("/createUser")
//    public String createMenu(@ModelAttribute Menu menu, Model model) {
//        model.addAttribute("menus", menu);
//        service.createMenu(menu);
//        return "redirect:/";
//    }
}
