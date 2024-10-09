package com.poly.befhark.DAO;

import com.poly.befhark.entity.Places;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlacesDAO  extends JpaRepository<Places, Integer> {
}
