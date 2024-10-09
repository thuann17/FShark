package com.poly.befhark.DAO;

import com.poly.befhark.entity.Images;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageDAO  extends JpaRepository<Images, Integer> {
}
