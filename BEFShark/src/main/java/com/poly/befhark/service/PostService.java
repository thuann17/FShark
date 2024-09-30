package com.poly.befhark.service;

import com.poly.befhark.DAO.CommentDAO;
import com.poly.befhark.DAO.LikeDAO;
import com.poly.befhark.DAO.PostDAO;
import com.poly.befhark.DAO.ShareDAO;
import com.poly.befhark.model.Likes;
import com.poly.befhark.model.Posts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class PostService {
    @Autowired
    private PostDAO postDao;
    @Autowired
    private LikeDAO likeDao;
    @Autowired
    private CommentDAO commentDao;
    @Autowired
    private ShareDAO shareDao;

    public List<Posts> getAllPost() {
        return postDao.findAll();
    }
    public Likes getByPostId(Integer postId) {
        return likeDao.findLikesByPostId(postId);
    }

    public Posts getPostById(int id) {
        return postDao.findById(id).orElseThrow(() -> new RuntimeException("Không có id: " + id));
    }

    public Posts updatePost(Posts postDetails, int idPost) {
        Posts post = postDao.findById(idPost).orElse(null);
        if (post != null) {
            post.setContent(postDetails.getContent());
            post.setCreateDate(new Date());
            post.setUser(postDetails.getUser());
            postDao.save(post);
        }
        return postDao.save(post);
    }

    public void deletePostById(int id) {
        postDao.deleteById(id);
    }

}
