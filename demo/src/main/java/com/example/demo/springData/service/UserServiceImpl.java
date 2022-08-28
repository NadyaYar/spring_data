package com.example.demo.springData.service;

import com.example.demo.springData.repository.UserRepository;
import com.example.demo.springData.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Arrays;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostConstruct
    void init() {
        User user = new User("Alla", "Kyiv", 18);
        User user1 = new User("Arsen", "Lviv", 22);
        User user2 = new User("Ann", "Monaco", 34);
        userRepository.saveAll(Arrays.asList(user, user1, user2));
    }

    @Override
    public Iterable<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }
}
