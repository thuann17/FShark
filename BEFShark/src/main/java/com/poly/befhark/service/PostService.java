package com.poly.befhark.service;

import com.poly.befhark.DAO.CommentDAO;
import com.poly.befhark.DAO.LikeDAO;
import com.poly.befhark.DAO.PostDAO;
import com.poly.befhark.DAO.ShareDAO;
import com.poly.befhark.DTO.PostDTO;
import com.poly.befhark.entity.Posts;
import com.poly.befhark.entity.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class PostService {
    @Autowired
    private PostDAO postDao;
    @Autowired
    private CommentDAO commentDAO;
    @Autowired
    private LikeDAO likeDAO;

    //  convert từ enity sang DTO
    public PostDTO convertToPostDTO(Posts post) {
        PostDTO postDTO = new PostDTO();
        int commentCount = commentDAO.countByPostId(post.getId()); // You need to create this method
        int likeCount = likeDAO.countByPostId(post.getId());
        postDTO.setId(post.getId());
        postDTO.setContent(post.getContent());
        postDTO.setCreateDate(post.getCreateDate());
        postDTO.setUsername(post.getUser() != null ? post.getUser().getUsername() : null);
        postDTO.setCommentCount(commentCount);
        postDTO.setLikeCount(likeCount);
        return postDTO;
    }

    //  lấy tất cả dữ liệu
    public Page<PostDTO> getPost(int page, int size, String search) {
        Pageable pageable = PageRequest.of(page, size);
        Page<Posts> accounts = (search == null || search.isEmpty())
                ? postDao.findAll(pageable)
                : postDao.findByContentContainingIgnoreCase(search, pageable);
        return accounts.map(this::convertToPostDTO);
    }

    public void deletePost(int postId) {
        postDao.deleteById(postId);
    }
}
