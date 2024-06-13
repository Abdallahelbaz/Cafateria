package com.example.Cafateria.Repos;

import com.example.Cafateria.Database.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepo extends JpaRepository<User,Long> {

    @Query("Select s From User s where s.email= ?1")
    Optional<User> findUserByEmail(String email);

}
