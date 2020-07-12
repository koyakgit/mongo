package com.example.demo.domain.model;

import org.springframework.data.annotation.Id;

import lombok.Data;

@Data
public class UserModel {
    @Id
    private final String id;
    private final String loginId;
    private final String name;
    private final Integer role;
}
