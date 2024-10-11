package com.poly.befhark.controller;

import com.poly.befhark.DAO.UserDAO;
import com.poly.befhark.DTO.UserDTO;
import com.poly.befhark.service.AccountService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Map;

@RestController
@CrossOrigin(origins = "http://127.0.0.1:5500")
@RequestMapping("/api/account")
public class AccountController {

    @Autowired
    AccountService accountService;
    @Autowired
    private UserDAO userDAO;

    @GetMapping
    public ResponseEntity<Page<UserDTO>> getAccounts(
            @RequestParam(name = "page", required = false, defaultValue = "0") int page,
            @RequestParam(name = "size", required = false, defaultValue = "7") int size,
            @RequestParam(required = false) String search) {
        Page<UserDTO> accounts = accountService.getAccounts(page, size, search);
        return ResponseEntity.ok(accounts);
    }

    @PutMapping("/{username}")
    public ResponseEntity<Void> updateAccountStatus(@PathVariable String username, @RequestBody Map<String, Boolean> status) {
        accountService.updateAccountStatus(username, status.get("active"));
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{username}")
    public ResponseEntity<Void> deleteAccount(@PathVariable String username) {
        if (userDAO.existsById(username)) {
            accountService.deleteAccount(username);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }

    }

}
