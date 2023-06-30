package com.example.user_service.services;

import com.example.user_service.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImp implements UserService{

    List<User> list = List.of(
            new User(1311L,"Aditya","23243324423"),
            new User(1312L,"Mane","23233243423"),
            new User(1313L,"Yash","23233434423")

    );

    @Override
    public User getUser(Long id) {
        return this.list.stream().filter(user -> user.getUserId().equals(id)).findAny().orElse(null);
    }
}
