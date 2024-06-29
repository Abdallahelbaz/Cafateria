package com.example.Cafateria.Controllers;


import com.example.Cafateria.Database.Menu;
import com.example.Cafateria.Services.MenuService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/menus")
@AllArgsConstructor
public class MenuController {

    @Autowired
    private final MenuService menuService;

    @GetMapping("/getAllMenus")
    public List<Menu> getAllMenus() {
        return menuService.getAllMenus();
    }

    @GetMapping(value = "/{id}")
    public Menu getMenuById(@PathVariable Long id) {
        return menuService.getMenuById(id);
    }

    @PostMapping("/create")
    public Menu createMenu(@RequestBody Menu menu) {
        return menuService.createMenu(menu);
    }

    @PutMapping("/{id}")
    public Menu updateMenu(@PathVariable Long id, @RequestBody Menu menu){
        menu.setMenuId(id); // Ensure the ID is set for update operation
        return menuService.updateMenu(id, menu);
    }


    @DeleteMapping("/{id}")
    public void deleteMenu(@PathVariable Long id) {
        menuService.deleteMenu(id);
    }
}
