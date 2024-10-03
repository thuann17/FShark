package com.poly.befhark.controller;

import com.poly.befhark.model.Users;
import com.poly.befhark.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://127.0.0.1:5500")
@RequestMapping("/api/account")
public class AccountController {
    @Autowired
    UserService userService;
    @Autowired
    private SimpMessagingTemplate messagingTemplate;

//    @GetMapping
//    public List<Users> getAccount() {
//        return userService.getAllUsers();
//    }

//    @GetMapping
//    public List<Users> getAllUsers(@RequestParam(required = false) String search) {
//        if (search != null && !search.isEmpty()) {
//            return userService.searchUser(search);
//        }
//        return userService.getAllUsers();
//    }

    @GetMapping("/{username}")
    public Users getAccountByName(@PathVariable String username) {
        return userService.getUserById(username);
    }

    @PutMapping("/{username}")
    public Users updateAccount(@RequestBody Users user, @PathVariable String username) {
        Users updatedUser = userService.updateUser(user, username);
        messagingTemplate.convertAndSend("/topic/account-status", updatedUser);
        return userService.updateUser(user, username);
    }

    @DeleteMapping("/{username}")
    public void deleteAccount(@PathVariable String username) {
        userService.deleteUser(username);
    }
    @GetMapping
    public Page<Users> getAllUsers(Pageable pageable) {
        return userService.getAllUsers(pageable);
    }
}
