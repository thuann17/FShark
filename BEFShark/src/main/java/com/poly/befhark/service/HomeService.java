package com.poly.befhark.service;

import com.poly.befhark.DAO.PostDAO;
import com.poly.befhark.DTO.DashboardDTO;
import com.poly.befhark.DTO.PostDTO;
import com.poly.befhark.entity.Posts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HomeService {
    @Autowired
    private PostDAO postDAO;


    public Page<Posts> getPostsByContent(String content, Pageable pageable) {
        return postDAO.findByContentContainingIgnoreCase(content, pageable);
    }


    public long countPostsByContent(String content) {
        return postDAO.countByContentContainingIgnoreCase(content);
    }

    public List<Posts> getPostsByYear(int year) {
        return postDAO.findByYear(year);
    }

    public DashboardDTO getDashboardStatistics(int year) {
        long totalPosts = postDAO.countByContentContainingIgnoreCase("");
        List<Posts> postsByYear = postDAO.findByYear(year);

        DashboardDTO dashboardDTO = new DashboardDTO();
        dashboardDTO.setTotalPosts(totalPosts);
//        dashboardDTO.setPostsByYear(postsByYear.size());



        return dashboardDTO;
    }
}
