package com.poly.befhark.DAO;

import com.poly.befhark.model.Comments;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentDAO  extends JpaRepository<Comments, Integer> {
}
