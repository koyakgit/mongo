package com.example.demo.domain.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document("user")
public class UserModel {
    @Id
    private final String id;
    private final String loginId;
    private final String name;
    private final Integer role;
}
