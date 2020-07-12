package com.example.demo.domain.service;

import com.example.demo.domain.model.UserModel;
import com.example.demo.domain.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Transactional
    public void create() throws Exception {
        {
            final UserModel model = new UserModel(null, "loginId1", "ほげ", 771);
            this.userRepository.save(model);
        }
        {
            final UserModel model = new UserModel(null, "loginId2", "ほげ", 772);
            this.userRepository.save(model);
        }
        this.userRepository.save(null);
        {
            final UserModel model = new UserModel(null, "loginId3", "ほげ", 773);
            this.userRepository.save(model);
        }
    }
}
