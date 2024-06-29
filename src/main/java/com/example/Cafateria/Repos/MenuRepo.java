package com.example.Cafateria.Repos;

import com.example.Cafateria.Database.Menu;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuRepo extends JpaRepository<Menu,Long> {
}
