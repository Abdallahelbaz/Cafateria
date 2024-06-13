package com.example.Cafateria.Services;

import com.example.Cafateria.Database.User;
import com.example.Cafateria.Repos.UserRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class UserService {
    private final UserRepo userRepo;

    @Autowired
    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }
    public List<User> getUsers(){
        return userRepo.findAll();
    }

    public void addNewUser(User user){
        Optional<User> userbyEmail=userRepo.findUserByEmail(user.getEmail());
        if(userbyEmail.isPresent()){
            throw new IllegalStateException("User is Existed");
        }
        userRepo.save(user);
    }

    public void deletUser(Long id){
        boolean exists=userRepo.existsById(id);
        if(exists) userRepo.deleteById(id);
        else throw new  IllegalStateException("Not found");

    }

    // to change the first name
    @Transactional
    public void updateUserFirstName(Long studentId, String firstName) {
        User user=userRepo.findById(studentId)
                .orElseThrow(()-> new IllegalStateException("Not exist"));

        if(firstName!=null && firstName.length()>=0 && !Objects.equals(user.getFirstName(),firstName)){
            user.setFirstName(firstName);
        }

    }
    // to change the last name
    @Transactional
    public void updateUserLastName(Long studentId, String lastName) {
        User user=userRepo.findById(studentId)
                .orElseThrow(()-> new IllegalStateException("Not exist"));

        if(lastName!=null && lastName.length()>=0 && !Objects.equals(user.getLastName(),lastName)){
            user.setLastName(lastName);
        }

    }
    @Transactional
    public void updateUserPhone(Long studentId, String phone) {
        User user=userRepo.findById(studentId)
                .orElseThrow(()-> new IllegalStateException("Not exist"));

        if(phone!=null && phone.length()>=0 && !Objects.equals(user.getPhone(),phone)){
            user.setPhone(phone);
        }

    }
    @Transactional
    public void updateUserAddress(Long studentId, String address) {
        User user=userRepo.findById(studentId)
                .orElseThrow(()-> new IllegalStateException("Not exist"));

        if(address !=null && address.length()>=0 && !Objects.equals(user.getAddress(), address)){
            user.setAddress(address);
        }

    }

    //
    //
    //
    // it will be edited
   //
   @Transactional
   public void updateUserDOB(Long studentId, LocalDate dob) {
       User user=userRepo.findById(studentId)
               .orElseThrow(()-> new IllegalStateException("Not exist"));

   }
   // have to be edited too
    @Transactional
    public void updateUserPassword(Long studentId, String password) {
        User user=userRepo.findById(studentId)
                .orElseThrow(()-> new IllegalStateException("Not exist"));

        if(password!=null && password.length()>=0 && !Objects.equals(user.getPassword(),password)){
            user.setPassword(password);
        }

    }



}
