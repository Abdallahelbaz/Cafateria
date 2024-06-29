package com.example.Cafateria.Database;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


@Entity
@Table(name = "Employee")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee extends User {


    @Column(name = "employee_id")
    private Long employeeId;
    @Column(name = "users_id")
    private Long userId;
    @Column(name = "active")
    private short active;
    @Column(name = "shift")
    private String shift;
    @Column(name = "salary")
    private float salary;
    @Column(name = "address")
    private String address;
    @Column(name = "job_description")
    private String jobDescription;
}
