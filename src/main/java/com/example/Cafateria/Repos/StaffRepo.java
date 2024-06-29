package com.example.Cafateria.Repos;

import com.example.Cafateria.Database.Staff;
import com.example.Cafateria.Database.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface StaffRepo extends JpaRepository<Staff,Long> {
}
