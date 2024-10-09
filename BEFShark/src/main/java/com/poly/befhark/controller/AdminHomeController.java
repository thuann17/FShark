package com.poly.befhark.controller;

import com.poly.befhark.DTO.DashboardDTO;
import com.poly.befhark.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/admin")
public class AdminHomeController {
    @Autowired
    HomeService homeService;

    @GetMapping
    public DashboardDTO getDashboardStatistics(@RequestParam("year") int year) {
        return homeService.getDashboardStatistics(year);
    }
}
