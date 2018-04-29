package com.microservices.user.web;


import com.microservices.user.models.UserModel;
import com.microservices.user.services.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {


    private final UserService userService;



    public UserController(final UserService userService){
        this.userService=userService;

    }

    @RequestMapping("/users")
    public List<UserModel> user() {
        return this.userService.getUsers();
    }


    @GetMapping("/user/{userId}")
    public UserModel user(@PathVariable(value="userId") String userId) {
        return this.userService.getUser(userId);
    }


}
