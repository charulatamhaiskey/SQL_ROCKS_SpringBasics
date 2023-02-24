package com.example.SQLRocks;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {


private List<User> userList;
private int id;
    @Autowired
    UserRepository userRepository; //This is a object

    public UserService(){
        userList = new ArrayList<>();
        id=1;
    }

    public String createUser(User user){
        userRepository.save(user);
        userList.add(user);
        return "User added successfully";
    }

    public User getUser(int id){
        User user = userRepository.findById(id).get(); //Help you find the Entity by primary key.
        return user;
    }

    public List<User> getAllUser() {
        return userRepository.findAll();
    }
}