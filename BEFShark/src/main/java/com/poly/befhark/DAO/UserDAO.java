package com.poly.befhark.DAO;


import com.poly.befhark.model.Users;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserDAO extends JpaRepository<Users, String> {
//    @Query("SELECT u FROM Users u WHERE u.username LIKE %:username%")
//    List<Users> findByUsernameContaining(@Param("username") String username);

    Page<Users> findByUsernameContainingIgnoreCase(String username, Pageable pageable);
}
