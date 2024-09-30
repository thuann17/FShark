package com.poly.befhark.DAO;
import com.poly.befhark.model.Likes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LikeDAO  extends JpaRepository<Likes, Integer> {
    Likes findLikesByPostId(Integer postId);
}
