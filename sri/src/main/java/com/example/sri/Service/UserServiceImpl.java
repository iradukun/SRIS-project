package com.example.sri.Service;

import com.example.sri.Entity.Role;
import com.example.sri.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService{
@Autowired
private User user;
private List<User> users = new ArrayList<>();
    @Override
    public User createUserAndRole(User user) {
        user.setId(user.getId());
        user.setNames(user.getNames());
        user.setEmail(user.getEmail());
        user.setRole(user.getRole());
        user.setPermisions(user.getPermisions());
        System.out.println(user);
        users.add(user);
        return user;

    }
}
