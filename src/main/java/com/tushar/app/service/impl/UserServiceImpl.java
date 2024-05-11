package com.tushar.app.service.impl;

import com.tushar.app.entity.User;
import com.tushar.app.repo.UserRepository;
import com.tushar.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repository;

    @Override
    public List<User> getAllUsers() {
        return repository.findAll();
    }

    @Override
    public User getUserById(int id) {
        return repository.findById(id).get();
    }

    @Override
    public User createUser(User user) {
        System.out.println("user = " + user);
        repository.save(user);
        return user;
    }

    @Override
    public User deleteUserById(int id) {
        User user = repository.findById(id).get();
        repository.delete(user);
        return user;
    }

    @Override
    public User updateUser(User user) {
//        User usr = repository.findById(user.getId()).get();
//        usr.setName("kkkkkkkkkkkkkkkkkkkk");
//        user.setId(usr.getId());
//        repository.delete(usr);
        repository.save(user);
        return user;
    }
}
