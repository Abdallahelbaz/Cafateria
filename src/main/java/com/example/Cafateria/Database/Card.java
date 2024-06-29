package com.example.Cafateria.Database;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.Date;

@Entity
@Table(name = "Card")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "card_id")
    private Long cardId;

    @Column(name = "card_holder")
    private String name;

    @Column(name = "card_number")
    private String number;

    @Column(name = "staff_id")
    private Long staffId;

//    @Column(name = "Cvv", length = 3, nullable = false)
//    private String cvv;
//
//    @Column(name = "Date", nullable = false)
//    @Temporal(TemporalType.DATE)
//    private Date date;

//    @ManyToOne
//    @JoinColumn(name = "userId", nullable = false)
//    private User user;

}
