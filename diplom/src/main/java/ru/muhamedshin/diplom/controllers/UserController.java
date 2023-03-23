package ru.muhamedshin.diplom.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import ru.muhamedshin.diplom.model.User;
import ru.muhamedshin.diplom.service.UserService;

@Controller
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/login")
    public String login(){
        return "login";
    }
    @GetMapping("/registration")
    public String registration(){
        return "registration";
    }

    @PostMapping("/registration")
    public String createUser(User user, Model model){
        if(!userService.createUser(user)){
            model.addAttribute("errorMessage","Пользователь с email" + user.getEmail() + " уже существует");
            return "registration";
        } ;
        return "redirect:/login";
    }

    @GetMapping("/hello")
    public String securityHello(){
        return "hello";
    }

}