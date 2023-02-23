package com.example.sri.Controller;

import com.example.sri.Entity.User;
import com.example.sri.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping()
    public User CreateUser(@RequestBody User user){

        return userService.createUserAndRole(user);
    }
}
