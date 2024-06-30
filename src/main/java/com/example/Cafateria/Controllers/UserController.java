package com.example.Cafateria.Controllers;


import com.example.Cafateria.Database.User;
import com.example.Cafateria.Services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;
//
//@Controller
//@RequestMapping("api/users")
//@AllArgsConstructor
public class UserController {

//    @Autowired
//    private final UserService userService;

//
//    @GetMapping
//    public String getAllUsers(Model model) {
//        model.addAttribute("users", userService.getAllUsers());
//        return "user-list";  // Thymeleaf template
//    }


//    @PostMapping("/adduser")
//    public String addUser(@Valid User user, BindingResult result, Model model) {
//        if (result.hasErrors()) {
//            return "add-user";
//        }
//
//        userService.createUser(user);
//        return "redirect:/index";
//    }


//    @GetMapping("/getAllUsers")
//    public List<User> getAllUsers() {
//        return userService.getAllUsers();
//    }
//
//    @GetMapping(value = "/{id}")
//    public User getUserById(@PathVariable Long id) {
//        return userService.getUserById(id);
//    }
//
//    @PostMapping("/create")
//    public User createUser(@RequestBody User user) {
//        return userService.createUser(user);
//    }
//
//    @PutMapping("/{id}")
//    public User updateUser(@PathVariable Long id, @RequestBody User user){
//        user.setUserId(id); // Ensure the ID is set for update operation
//        return userService.updateUser(id,user);
//    }
//
//
//    @DeleteMapping("/{id}")
//    public void deleteUser(@PathVariable Long id) {
//        userService.deleteUser(id);
//    }
}
