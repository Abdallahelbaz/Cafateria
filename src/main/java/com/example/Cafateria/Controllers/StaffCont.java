package com.example.Cafateria.Controllers;

import com.example.Cafateria.Database.Staff;
import com.example.Cafateria.Services.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StaffCont {

    @Autowired
    private StaffService service;

    @GetMapping("/createStaff")
    public String createStaff(Model model){
        Staff staff=new Staff();
        model.addAttribute("staff",staff);
        return "Signup";
    }

    @PostMapping("/createStaff")
    public String createStaff(@ModelAttribute Staff staff, Model model) {
        model.addAttribute("staff", staff);
        service.createStaff(staff);
        return "redirect:/";
    }
}
