package com.poly.befhark.DAO;


import com.poly.befhark.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDAO extends JpaRepository<Users, Integer> {
}
