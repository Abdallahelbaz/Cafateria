package com.example.Cafateria.Database;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@PrimaryKeyJoinColumn(name = "userId")
public class Staff extends User {


    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long staffId;

    @Column(unique = true)
    private Long hospitalStaffId;

    public Staff(String firstName, String lastName, Date birthDate, String email, String userName, String password, Long hospitalStaffId) {
        super(firstName, lastName, birthDate, email, userName, password);
        this.staffId = staffId;
        this.hospitalStaffId = hospitalStaffId;
    }

}

