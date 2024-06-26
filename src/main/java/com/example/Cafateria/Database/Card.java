package com.example.Cafateria.Database;

import jakarta.persistence.*;


import java.util.Date;

@Entity
@Table(name = "card")
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cardId")
    private Long cardId;

    @Column(name = "Name", length = 50, nullable = false)
    private String name;

    @Column(name = "Number", length = 16, nullable = false)
    private String number;

    @Column(name = "Cvv", length = 3, nullable = false)
    private String cvv;

    @Column(name = "Date", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date date;

    @ManyToOne
    @JoinColumn(name = "userId", nullable = false)
    private User user;

    // Constructors, getters, and setters

    public Card() {
    }

    public Card(String name, String number, String cvv, Date date, User user) {
        this.name = name;
        this.number = number;
        this.cvv = cvv;
        this.date = date;
        this.user = user;
    }

    public Long getCardId() {
        return cardId;
    }

    public void setCardId(Long cardId) {
        this.cardId = cardId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Card{" +
                "cardId=" + cardId +
                ", name='" + name + '\'' +
                ", number='" + number + '\'' +
                ", cvv='" + cvv + '\'' +
                ", date=" + date +
                ", user=" + user +
                '}';
    }
}
