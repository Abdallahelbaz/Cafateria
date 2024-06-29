package com.example.Cafateria.Database;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


@Entity
@Table(name = "Staff")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Staff extends User {


    @Column(name = "staff_id")
    private Long staffId;
    @Column(name = "users_id")
    private Long userId;
    @Column(name = "hospital_staff_id", unique = true)
    private Long hospitalStaffId;

}

