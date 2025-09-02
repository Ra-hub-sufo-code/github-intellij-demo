package com.cfs.SecurityP02.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class BankController {

    private Double balance=80000.0;

    @GetMapping("/transfer")
    public String transfer(){
        return "Money is transfer";
    }

    @GetMapping("/bal")
    public Double bal( ){
        return this.balance;
    }

    @GetMapping("contact")
    public String contactUs( ){
        return "Contact Us 78523577549";
    }
}
