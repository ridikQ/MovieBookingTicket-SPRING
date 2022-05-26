package com.example.moviebookingticket.services;

import com.example.moviebookingticket.entity.UserEntity;
import com.example.moviebookingticket.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<UserEntity>getAllUsers(){
        return userRepository.findAll();
    }
    public void addUser(UserEntity userEntity){
        userRepository.save(userEntity);
    }
    public void getUserById(Long id){
        userRepository.findById(id);
    }
}
