package com.poly.befhark.DAO;

import com.poly.befhark.model.Posts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostDAO extends JpaRepository<Posts, Integer> {
}
