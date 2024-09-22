package com.poly.befhark.controller;

import com.poly.befhark.model.Users;
import com.poly.befhark.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/account")
public class AccountController {
    @Autowired
    UserService userService;

    @GetMapping()
    public List<Users> getAccount() {
        return userService.getAllUsers();
    }

}
