package com.haroon.workfolio_server.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.haroon.workfolio_server.entity.User;
import com.haroon.workfolio_server.repos.UserRepository;


@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(final UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> allUsers() {
        List<User> users = new ArrayList<>();
        userRepository.findAll().forEach(users::add);
        return users;
    }
}
