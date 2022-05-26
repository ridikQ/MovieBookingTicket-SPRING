package com.example.moviebookingticket.controller;

import com.example.moviebookingticket.entity.UserEntity;
import com.example.moviebookingticket.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/all")
    public List<UserEntity>getAllUser(){
        return userService.getAllUsers();
    }
    @PostMapping("/add")
    public void addUser(@RequestBody UserEntity userEntity){
        userService.addUser(userEntity);
    }
    @GetMapping("/{id}")
    public void getUserById(@PathVariable("id") Long id){
        userService.getUserById(id);
    }
}
