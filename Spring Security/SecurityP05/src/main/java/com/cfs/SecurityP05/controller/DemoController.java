package com.cfs.SecurityP05.controller;

import com.cfs.SecurityP05.entity.UserListRequest;
import com.cfs.SecurityP05.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class DemoController {

    @Autowired
    private UserService userService;

    @PostMapping("/addUsers")
    public String addUsers(@RequestBody UserListRequest request){
        userService.saveUsers(request.getUsers());
        return "User add Successfully";
    }

    @GetMapping("/public")
    public String publicMethod(){
        return "This is public method";
    }

    @GetMapping("/admin")
    public String adminMethod(){
        return "This is admin method";
    }

    @GetMapping("/user")
    public String userMethod(){
        return "This is user method";
    }
}
