package com.cfs.SecurityP01.Controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/bank")
public class Controller {

    @GetMapping("/admin")
    public String admin(){
        return "Hii, i am admin";
    }

    @GetMapping("/user")
    public String user(){
        return "Hii, i am user";
    }
}
