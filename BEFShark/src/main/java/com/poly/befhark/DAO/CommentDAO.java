package com.poly.befhark.DAO;

import com.poly.befhark.entity.Comments;
import com.poly.befhark.entity.Posts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentDAO  extends JpaRepository<Comments, Integer> {
   int countByPostId(Integer postId);
}
