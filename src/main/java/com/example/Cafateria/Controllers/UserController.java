package com.example.Cafateria.Controllers;

import com.example.Cafateria.Database.User;
import com.example.Cafateria.Services.UserService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

@RestController
public class UserController {
    private final UserService userService;


    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<User> getUsers(){return userService.getUsers();}

    // add a new user
    @PostMapping
    public void registerNewUser(@RequestBody User user){userService.addNewUser(user);}

    // delete
    @DeleteMapping(path = "id")
    public void deleteUser(@PathVariable("id") Long id){userService.deletUser(id);}
    // to update user first name

    @PutMapping(path = "id")
    public void updateUserFirstName(
            @PathVariable("id") Long id,
            @RequestParam(required = false) String firstName
    ){ userService.updateUserFirstName(id,firstName);}

    @PutMapping(path = "id")
    public void updateUserLastName(
            @PathVariable("id") Long id,
            @RequestParam(required = false) String lastName
    ){ userService.updateUserLastName(id,lastName);}

    @PutMapping(path = "id")
    public void updateUserPhone(
            @PathVariable("id") Long id,
            @RequestParam(required = false) String phone
    ){ userService.updateUserPhone(id,phone);}

    @PutMapping(path = "id")
    public void updateUserAddress(
            @PathVariable("id") Long id,
            @RequestParam(required = false) String address
    ){ userService.updateUserAddress(id,address);}

    @PutMapping(path = "id")
    public void updateUserDOB(
            @PathVariable("id") Long id,
            @RequestParam(required = false) LocalDate dob
    ){ userService.updateUserDOB(id,dob);}

    @PutMapping(path = "id")
    public void updateUserPassword(
            @PathVariable("id") Long id,
            @RequestParam(required = false) String  password
    ){ userService.updateUserPassword(id,password);}


}
