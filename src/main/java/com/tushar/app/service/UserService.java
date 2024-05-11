package com.tushar.app.service;

import com.tushar.app.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;



public interface UserService {
    List<User> getAllUsers();

    User getUserById(int id);

    User createUser(User user);

    User deleteUserById(int id);

    User updateUser(User user);
}
