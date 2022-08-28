package com.example.demo.springData.service;

import com.example.demo.springData.entity.User;

public interface UserService {

    Iterable<User> findAll();

    User save(User user);
}
