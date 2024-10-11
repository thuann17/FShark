package com.poly.befhark.service;

import com.poly.befhark.DAO.UserDAO;
import com.poly.befhark.DTO.UserDTO;
import com.poly.befhark.entity.Users;
import com.poly.befhark.exception.UserNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

    @Autowired
    private UserDAO userDAO;
    @Autowired
    private SimpMessagingTemplate messagingTemplate;

    // lấy tất cả nè
    public Page<UserDTO> getAccounts(int page, int size, String search) {
        Pageable pageable = PageRequest.of(page, size);
        Page<Users> accounts = (search == null || search.isEmpty())
                ? userDAO.findAll(pageable)
                : userDAO.findByUsernameContainingIgnoreCase(search, pageable);

        return accounts.map(this::convertToDTO);
    }

    //     lấy 1 người
    public UserDTO getAccountByUsername(String username) {
        return userDAO.findById(username).map(this::convertToDTO).orElse(null);
    }

    // cập nhật nè
    public void updateAccountStatus(String username, Boolean active) {
        Users user = userDAO.findById(username)
                .orElseThrow(() -> new UserNotFoundException(username));
        user.setActive(active);
        userDAO.save(user);
        messagingTemplate.convertAndSend("/topic/account-status", convertToDTO(user));
    }

    // xoá nè
    public void deleteAccount(String username) {
        userDAO.deleteById(username);
    }

    //convert từ entity sang DTO
    public UserDTO convertToDTO(Users user) {
        UserDTO dto = new UserDTO();
        dto.setUsername(user.getUsername());
        dto.setHometown(user.getHometown());
        dto.setActive(user.getActive());
        dto.setEmail(user.getEmail());
        dto.setFirstname(user.getFirstname());
        dto.setLastname(user.getLastname());
        dto.setBio(user.getBio());
        return dto;
    }
}
