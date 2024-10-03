package com.poly.befhark.service;

import com.poly.befhark.DAO.UserDAO;
import com.poly.befhark.DAO.UserroleDAO;
import com.poly.befhark.model.Userroles;
import com.poly.befhark.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserDAO userDAO;
    @Autowired
    private UserroleDAO userroleDAO;
//
//    public List<Users> getAllUsers() {
//        return userDAO.findAll();
//    }


    public Users getUserById(String username) {
        return userDAO.findById(username).orElse(null);
    }

    public Users addUser(Users user) {
        return userDAO.save(user);

    }

    public Users updateUser(Users userDetail, String username) {
        Users user = userDAO.findById(username).orElse(null);
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
            user.setUserRoles(user.getUserRoles());
        }
        return userDAO.save(user);
    }

    public void deleteUser(String id) {
        userDAO.deleteById(id);
    }
//    public List<Users> searchUser(String keyword) {
//        if(keyword == null || keyword.isEmpty()){
//            return userDAO.findAll();
//        }
//        return userDAO.findByUsernameContaining(keyword);
//    }
    public Page<Users> searchUser(String search, Pageable pageable) {
        return userDAO.findByUsernameContainingIgnoreCase(search, pageable);
    }
    public Page<Users> getAllUsers(Pageable pageable) {
        return userDAO.findAll(pageable);
    }
}
