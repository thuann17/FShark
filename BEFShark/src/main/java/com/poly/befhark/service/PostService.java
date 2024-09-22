package com.poly.befhark.service;

import com.poly.befhark.DAO.PostDAO;
import com.poly.befhark.model.Posts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {
    @Autowired
    private PostDAO postDao;

    public List<Posts> getAllPost() {
        return postDao.findAll();
    }

    public Posts getPostById(int id) {
        return postDao.findById(id).orElseThrow(() -> new RuntimeException("Không có id: " + id));
    }

   public void deletePostById(int id) {
        postDao.deleteById(id);
   }

}
