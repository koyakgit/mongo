package com.example.demo.domain.service;

import com.example.demo.domain.model.UserModel;
import com.example.demo.domain.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void create() {
        final UserModel model = new UserModel(null, "hoge", "ほげ", 777);
        this.userRepository.save(model);
    }
}
