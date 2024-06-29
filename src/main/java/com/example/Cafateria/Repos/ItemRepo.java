package com.example.Cafateria.Repos;

import com.example.Cafateria.Database.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepo extends JpaRepository<Item,Long> {
}
