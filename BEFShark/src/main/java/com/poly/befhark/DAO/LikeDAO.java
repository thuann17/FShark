package com.poly.befhark.DAO;
import com.poly.befhark.entity.Likes;
import com.poly.befhark.entity.Posts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LikeDAO  extends JpaRepository<Likes, Integer> {
  int countByPostId(Integer postId);
}
