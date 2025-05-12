package com.alots.alots_backend.service;

import java.util.List;
import com.alots.alots_backend.entity.User;


public interface UserService {
    User registerUser(User user);
    List<User> getAllUsers();
    User getUserById(String id);
    User updateUser(String id, User user);
    void deleteUser(String id);
}
