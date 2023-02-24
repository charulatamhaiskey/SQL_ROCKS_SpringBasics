package com.example.SQLRocks;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {


    @Autowired
    UserService userService; //we have to use an object of the service Layer : so that we can call its function.



    @PostMapping("/add")
    public String createUser(@RequestBody() User user){

        //Try adding try-catch blocks as well
        return userService.createUser(user);

    }

    @GetMapping("/getUser")
    public User getUser(@RequestParam("id")Integer id){

        return userService.getUser(id);
    }


    //H.w
    //1. Write an API to find all the Users in Db. (findAll) : no paramter
    //2. Please read through the general function that jpa interface is providing
    @GetMapping("/getAllUser")
    public List<User> getAllUser(){
        return userService.getAllUser();
    }


}