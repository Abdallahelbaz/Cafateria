package com.example.Cafateria.Services;

import com.example.Cafateria.Database.Item;
import com.example.Cafateria.Repos.ItemRepo;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Data
@AllArgsConstructor
public class ItemService {

    @Autowired
    private final ItemRepo itemRepo;

    public List<Item> getAllItems() {
        return itemRepo.findAll();
    }

    public Item createItem(Item item) {
        return itemRepo.save(item);
    }


    public Item getItemById(Long id) {
        return itemRepo.findById(id).orElse(null);
    }



    public Item updateItem(Long id,Item item) {
        Optional<Item> updateItem = this.itemRepo.findById(id);
        if (updateItem.isPresent()){
            updateItem.get().setItemId(item.getItemId());
            return this.itemRepo.save(item);
        }
        throw new RuntimeException();
    }

    public void deleteItem(Long id) {
        itemRepo.deleteById(id);
    }
}
