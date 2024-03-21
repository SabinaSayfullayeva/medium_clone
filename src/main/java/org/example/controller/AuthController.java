package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.dto.UserSignupDto;
import org.example.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {

    private final UserService userService;

    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @GetMapping("/logout")
    public String logout(){
        return "logout";
    }

    @GetMapping("/signup")
    public String signup(){
        return "signup";
    }



    @PostMapping("/signup")
    public String registerUser(@ModelAttribute UserSignupDto userSignUpDto){
        userService.saveUser(userSignUpDto);
        return "redirect:/";
    }

}
