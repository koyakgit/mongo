package com.example.demo.domain.repository;

import com.example.demo.domain.model.UserModel;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<UserModel, String> {

}
