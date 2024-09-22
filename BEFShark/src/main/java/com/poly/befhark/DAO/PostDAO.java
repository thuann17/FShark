package com.poly.befhark.DAO;

import com.poly.befhark.model.Posts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostDAO extends JpaRepository<Posts, Integer> {
}
