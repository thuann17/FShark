package com.poly.befhark.controller;

import com.poly.befhark.DTO.PostDTO;
import com.poly.befhark.service.PostService;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://127.0.0.1:5501")
@RequestMapping("/api/content")
public class AdminPostController {
    @Autowired
    private PostService postService; // Ensure PostService is implemented correctly

    @GetMapping
    public ResponseEntity<Page<PostDTO>> getAllPosts(
            @RequestParam(name = "page", required = false, defaultValue = "0") int page,
            @RequestParam(name = "size", required = false, defaultValue = "7") int size,
            @RequestParam(required = false) String search) {
        Page<PostDTO> listPost = postService.getPost(page, size, search);
        return ResponseEntity.ok(listPost);
    }
}

