package com.poly.befhark.controller;

import com.poly.befhark.DTO.UserDTO;
import com.poly.befhark.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("http://127.0.0.1:5500")
@RequestMapping("/api/profile")
public class ProfileController {
    @Autowired
    AccountService accountService;

    @GetMapping("/{username}")
    public UserDTO findByUsername(@PathVariable String username) {
        return accountService.getAccountByUsername(username);
    }
}
