package com.example.demo;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DemoConfigurations {
    private final DemoProperties properties;

    @Autowired
    public DemoConfigurations(DemoProperties properties) {
        this.properties = properties;
    }

    @Bean
    public MongoClient mongoClient() {
        return MongoClients.create(this.properties.getHostUrl());
    }
}
