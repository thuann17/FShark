package com.poly.befhark.controller;

import com.poly.befhark.model.Posts;
import com.poly.befhark.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://127.0.0.1:5500")
@RequestMapping("/api/post")
public class AdminPostController {
    @Autowired
    private PostService postService;

    @GetMapping
    public List<Posts> post() {

        return postService.getAllPost();
    }
    @GetMapping("/{idPost}")
    public Posts getPostById(@PathVariable int idPost) {
        return postService.getPostById(idPost);
    }
    @DeleteMapping("/{idPost}")
    public String deletePost(@PathVariable int idPost) {
        postService.deletePostById(idPost);
        return "success delete post" + idPost;
    }
}
