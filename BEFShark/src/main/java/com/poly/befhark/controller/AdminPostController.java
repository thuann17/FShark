package com.poly.befhark.controller;

import com.poly.befhark.DAO.PostDAO;
import com.poly.befhark.model.Posts;
import com.poly.befhark.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/post")
public class AdminPostController {
    @Autowired
    private PostService postService;

    @GetMapping
    public List<Posts> post() {
        System.out.println(postService.getAllPost());
        return postService.getAllPost();
    }
    @GetMapping("/{id}")
    public Posts getPostById(@PathVariable int id) {
        return postService.getPostById(id);
    }
    @DeleteMapping("/{id}")
    public String deletePost(@PathVariable int id) {
        postService.deletePostById(id);
        return "success delete post" + id;
    }
}
