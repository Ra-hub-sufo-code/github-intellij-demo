package com.cfs.SecurityP04.controller;

import com.cfs.SecurityP04.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class UserController {

    @Autowired
    AccountService service;

    @GetMapping("/balance")
    public String getBalance(){
        return service.getBalance();
    }

    @GetMapping("/user")
    public String user(){
        return "Hii, i am user";
    }

    @PostMapping("/close")
    public String closeAccount(){
        return service.closeAccount();
    }

    @GetMapping("/contact")
    public String contact(){
        return "You can contact with me 8638628357";
    }
}
