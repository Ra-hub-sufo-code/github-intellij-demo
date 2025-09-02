package com.cfs.JWTDemo.controller;

import com.cfs.JWTDemo.util.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class JWTController {

    @Autowired
    private JwtUtil jwtUtil;

    @PostMapping("/generated-token")
    public String generateToken(@RequestParam String username,@RequestParam String password){
        if ("admin".equals(username)&&"admin".equals(password)){
            return jwtUtil.generateToken(username);
        }
        else {
            return "Invalid credentials";
        }
    }

    @GetMapping("/fund")
    public String fundTransfer(@RequestHeader (value = "Authorization",required = false) String authorizationHeader){

        if (authorizationHeader!=null && authorizationHeader.startsWith("Bearer ")){
            String token=authorizationHeader.substring(7);

            if (jwtUtil.validateToken(token)){
                return "This is secure API , token Valid";
            }
            else {
                return "Invalid Token";
            }
        }
        else {
            return "Authorization Header is missing";
        }
    }
}
