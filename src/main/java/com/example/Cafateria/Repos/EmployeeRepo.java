package com.example.Cafateria.Repos;

import com.example.Cafateria.Database.Employee;
import com.example.Cafateria.Database.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {
}
