package com.poly.befhark.service;

import com.poly.befhark.DAO.UserDAO;
import com.poly.befhark.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserDAO userDAO;

    public List<Users> getAllUsers() {
        return userDAO.findAll();
    }

    public Users getUserById(int id) {
        return userDAO.findById(id).orElse(null);
    }

    public Users addUser(Users user) {
        return userDAO.save(user);

    }

    public Users updateUser(Users userDetail, Integer id) {
        Users user = userDAO.findById(id).orElse(null);
        if (user != null) {
            user.setPassword(userDetail.getPassword());
            user.setActive(userDetail.getActive());
            user.setEmail(userDetail.getEmail());
            user.setGender(userDetail.getGender());
            user.setLastname(userDetail.getLastname());
            user.setFirstname(userDetail.getFirstname());
            user.setBirthday(userDetail.getBirthday());
            user.setBio(userDetail.getBio());
            user.setHometown(userDetail.getHometown());
            user.setCurrency(userDetail.getCurrency());
        }
        return userDAO.save(user);
    }
    public void deleteUser(int id) {
        userDAO.deleteById(id);
    }
}
