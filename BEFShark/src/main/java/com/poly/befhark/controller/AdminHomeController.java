package com.poly.befhark.controller;


import com.poly.befhark.DTO.DashboardDTO;
import com.poly.befhark.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://127.0.0.1:5500")
@RequestMapping("/api/admin")
public class AdminHomeController {
    @Autowired
    HomeService homeService;

    @GetMapping("/countpostyear/{year}")
    public DashboardDTO countPostsByYear(@PathVariable int year) {
        DashboardDTO dto = new DashboardDTO();
        dto.setTotalPosts(homeService.countPostsByYear(year));
        return dto;
    }

    @GetMapping("/counttripyear/{year}")
    public DashboardDTO countTripByYear(@PathVariable int year) {
        DashboardDTO dto = new DashboardDTO();
        dto.setTotalPosts(homeService.countTripsByYear(year));
        return dto;
    }


}
