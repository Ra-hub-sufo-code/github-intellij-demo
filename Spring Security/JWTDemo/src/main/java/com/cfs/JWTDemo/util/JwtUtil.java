package com.cfs.JWTDemo.util;

import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import io.jsonwebtoken.security.SignatureException;
import org.springframework.stereotype.Component;

import java.security.Key;
import java.util.Date;

@Component
public class JwtUtil {

    private static final String SECRET_KEY_STRING="raushan@yehbfjsdidhdb9376987twgbb";
    private final Key SECRET_KEY= Keys.hmacShaKeyFor(SECRET_KEY_STRING.getBytes());

    public String generateToken(String username){

        String token= Jwts.builder()
                .setSubject(username)
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis()+(1000*30)))
                .signWith(SECRET_KEY)
                .compact();
        System.out.println("Generate Token "+token);
        return token;
    }

    public boolean validateToken(String token){

        try{
            Jwts.parserBuilder().setSigningKey(SECRET_KEY).build().parseClaimsJws(token);
            return true;
        }
        catch (ExpiredJwtException e){
            System.out.println("Token Expired "+e.getMessage());
            return false;
        }
        catch (SignatureException e){
            System.out.println("Invalid JWT Signature"+e.getMessage());
            return false;
        }
        catch (Exception e){
            System.out.println("JWT Exception "+e.getMessage());
            return false;
        }
    }
}
