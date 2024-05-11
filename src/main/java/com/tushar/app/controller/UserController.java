package com.tushar.app.controller;

import com.tushar.app.entity.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;



public interface UserController {

    List<User> getAllUsers();

    User getUserById(String id);

    User createUser(User user);

    User deleteUserById(String id);

    User updateUser(User user);

}
