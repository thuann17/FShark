package com.poly.befhark.DAO;


import com.poly.befhark.entity.Shares;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShareDAO extends JpaRepository<Shares, Integer> {
}
