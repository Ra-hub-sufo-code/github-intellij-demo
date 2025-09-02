package com.cfs.CSRFDemo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping
public class UserController {

    @GetMapping("/about")
    public String about(){
        return "Hii, this is abc company";
    }

    @GetMapping("/contact")
    public String contact(){
        return "You can contact with me 968274548073";
    }

    @GetMapping("/user")
    public String user(){
        return "I am user";
    }

    @GetMapping("/admin")
    public String admin(){
        return "I am admin";
    }
}
