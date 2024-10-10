package com.poly.befhark.DAO;

import com.poly.befhark.DTO.PostDTO;
import com.poly.befhark.entity.Posts;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostDAO extends JpaRepository<Posts, Integer> {
    Page<Posts> findByContentContainingIgnoreCase(String title, Pageable pageable);
    long countByContentContainingIgnoreCase(String title);

    @Query(value = "EXEC GetPostsByYear :yearParam", nativeQuery = true)
    int getPostByYear(@Param("yearParam") int year);
}
