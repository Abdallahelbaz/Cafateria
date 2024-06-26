package com.example.Cafateria.Database;


import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "menu")
public class Menu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "menuId")
    private Long menuId;

    @Column(name = "Title", length = 50, nullable = false)
    private String title;

    @OneToMany(mappedBy = "menu", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Item> items;

    // Constructors, getters, and setters

    public Menu() {
    }

    public Menu(String title) {
        this.title = title;
    }

    public Long getMenuId() {
        return menuId;
    }

    public void setMenuId(Long menuId) {
        this.menuId = menuId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "menuId=" + menuId +
                ", title='" + title + '\'' +
                '}';
    }
}

