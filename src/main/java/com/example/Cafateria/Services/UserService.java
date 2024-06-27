package com.example.Cafateria.Services;

import com.example.Cafateria.Database.User;
import com.example.Cafateria.Repos.UserRepo;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Data
@AllArgsConstructor
public class UserService {


    private final UserRepo userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public User updateUser(Long id,User user) {
        Optional<User> updateUser= this.userRepository.findById(id);
        if (updateUser.isPresent()){
            updateUser.get().setUserName(user.getUserName());
            return this.userRepository.save(user);
        }
        throw new RuntimeException();
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
