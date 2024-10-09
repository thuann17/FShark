package com.poly.befhark.DAO;


import com.poly.befhark.entity.Users;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDAO extends JpaRepository<Users, String> {
    Page<Users> findByUsernameContainingIgnoreCase(String username, Pageable pageable);
}
