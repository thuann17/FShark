package com.poly.befhark.service;

import com.poly.befhark.DAO.PostDAO;
import com.poly.befhark.DAO.TripDAO;
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
    @Autowired
    private TripDAO tripDAO;

    public int countTripsByYear(int year) {
        return tripDAO.getTripByYear(year);
    }

    public int countPostsByYear(int year) {
        return postDAO.getPostByYear(year);
    }
}
