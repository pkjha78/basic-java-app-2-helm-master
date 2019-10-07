package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.util.JWTUtil;

@RestController
public class TokenController {

    @RequestMapping("/token")
    public String getToken(){
        return JWTUtil.getJWTToken();
    }

}
