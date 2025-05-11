package com.alots.alots_backend.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.alots.alots_backend.entity.User;

public interface UserRepository extends MongoRepository<User, String>{
    User findByEmail(String email);


}
