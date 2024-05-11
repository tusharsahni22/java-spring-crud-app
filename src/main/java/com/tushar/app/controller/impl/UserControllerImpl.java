package com.tushar.app.controller.impl;

import com.tushar.app.controller.UserController;
import com.tushar.app.entity.User;
import com.tushar.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@RestController
@RequestMapping("/user")
public class UserControllerImpl implements UserController {


    @Autowired
    private UserService service;

    @Override
    @GetMapping("/")
    public List<User> getAllUsers() {
        return service.getAllUsers();
    }

    @Override
    @GetMapping("/{id}")
    public User getUserById(@PathVariable String id) {
        return service.getUserById(Integer.parseInt(id));
    }

    @Override
    @PostMapping("/")
    public User createUser(@RequestBody User user) {
        return service.createUser(user);
    }

    @Override
    @DeleteMapping("/{id}")
    public User deleteUserById(@PathVariable String id) {
        return service.deleteUserById(Integer.parseInt(id));
    }

    @Override
    @PutMapping("/")
    public User updateUser(@RequestBody User user) {
        System.out.println("put user = " + user);
        return service.updateUser(user);
    }
}
