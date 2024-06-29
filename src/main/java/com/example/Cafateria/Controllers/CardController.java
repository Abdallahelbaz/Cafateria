package com.example.Cafateria.Controllers;


import com.example.Cafateria.Database.Card;
import com.example.Cafateria.Services.CardService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/card")
@AllArgsConstructor
public class CardController {


    @Autowired
    private final CardService cardService;

    @GetMapping("/getAllCards")
    public List<Card> getAllCards() {
        return cardService.getAllCards();
    }

    @GetMapping(value = "/{id}")
    public Card getCardById(@PathVariable Long id) {
        return cardService.getCardById(id);
    }

    @PostMapping("/create")
    public Card createCard(@RequestBody Card card) {
        return cardService.createCard(card);
    }

    @PutMapping("/{id}")
    public Card updateCard(@PathVariable Long id, @RequestBody Card card){
        card.setCardId(id); // Ensure the ID is set for update operation
        return cardService.updateCard(id, card);
    }


    @DeleteMapping("/{id}")
    public void deleteCard(@PathVariable Long id) {
        cardService.deleteCard(id);
    }
}
