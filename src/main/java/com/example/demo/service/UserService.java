package com.example.demo.service;

import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public User getUserById(Long id) {
        return userRepository
                .findById(id).orElseThrow(() -> new ResourceNotFoundException("Item with ID " + id + " not found"));
    }
     public List<User> getUsers() {
        return userRepository.findAll();
     }
}
