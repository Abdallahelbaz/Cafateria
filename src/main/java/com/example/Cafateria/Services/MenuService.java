package com.example.Cafateria.Services;

import com.example.Cafateria.Database.Menu;
import com.example.Cafateria.Repos.MenuRepo;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Data
@AllArgsConstructor
public class MenuService {

    @Autowired
    private final MenuRepo menuRepo;

    public List<Menu> getAllMenus() {
        return menuRepo.findAll();
    }

    public Menu createMenu(Menu menu) {
        return menuRepo.save(menu);
    }


    public Menu getMenuById(Long id) {
        return menuRepo.findById(id).orElse(null);
    }



    public Menu updateMenu(Long id,Menu menu) {
        Optional<Menu> updateMenu = this.menuRepo.findById(id);
        if (updateMenu.isPresent()){
            updateMenu.get().setMenuId(menu.getMenuId());
            return this.menuRepo.save(menu);
        }
        throw new RuntimeException();
    }

    public void deleteMenu(Long id) {
        menuRepo.deleteById(id);
    }
}
