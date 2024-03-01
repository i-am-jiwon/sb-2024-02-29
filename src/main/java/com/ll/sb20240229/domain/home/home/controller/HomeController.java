package com.ll.sb20240229.domain.home.home.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequiredArgsConstructor
public class HomeController {
    @Value("${custom.jwt.secretKey}")
    private String jwtSecretKey;

    @GetMapping("/")
    @ResponseBody
    public String showMain() {
        return "5555";
    }

    @GetMapping("/jwtSecretKey")
    @ResponseBody
    public String showJwtSecretKey() {
        return jwtSecretKey;
    }
}
