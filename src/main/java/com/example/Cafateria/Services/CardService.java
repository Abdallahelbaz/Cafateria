package com.example.Cafateria.Services;

import com.example.Cafateria.Database.Card;
import com.example.Cafateria.Repos.CardRepo;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Data
@AllArgsConstructor
public class CardService {

    @Autowired
    private final CardRepo cardRepo;

    public List<Card> getAllCards() {
        return cardRepo.findAll();
    }

    public Card createCard(Card card) {
        return cardRepo.save(card);
    }


    public Card getCardById(Long id) {
        return cardRepo.findById(id).orElse(null);
    }



    public Card updateCard(Long id, Card card) {
        Optional<Card> updateCard = this.cardRepo.findById(id);
        if (updateCard.isPresent()){
            updateCard.get().setCardId(card.getCardId());
            return this.cardRepo.save(card);
        }
        throw new RuntimeException();
    }

    public void deleteCard(Long id) {
        cardRepo.deleteById(id);
    }
}
