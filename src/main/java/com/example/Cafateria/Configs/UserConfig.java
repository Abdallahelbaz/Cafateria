package com.example.Cafateria.Configs;

import com.example.Cafateria.Database.User;
import com.example.Cafateria.Repos.UserRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class UserConfig {
    @Bean
    CommandLineRunner commandLineRunner(UserRepo repo){
        return args -> {
            User user=new User();
            repo.saveAll(List.of(user));
        };
    }
}
