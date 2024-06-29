package com.example.Cafateria.Repos;

import com.example.Cafateria.Database.Card;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardRepo extends JpaRepository<Card, Long> {
}
