package com.alots.alots_backend.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alots.alots_backend.entity.User;
import com.alots.alots_backend.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepository userRepository;

    @Override
    public User registerUser(User user){
        return userRepository.save(user);
    }

    @Override
    public User getUserById(String id){
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    @Override
    public User updateUser(String id, User updatedUser){
        Optional<User> existingUser = userRepository.findById(id);
        if(existingUser.isPresent()){
            User user = existingUser.get();
            user.setName(updatedUser.getName());
            user.setEmail(updatedUser.getEmail());
            return userRepository.save(user);
        } else{
            return null;
        }
    }

    @Override
    public void deleteUser(String id){
        userRepository.deleteById(id);
    }


}
