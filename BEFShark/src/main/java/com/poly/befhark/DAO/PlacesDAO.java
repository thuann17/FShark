package com.poly.befhark.DAO;

import com.poly.befhark.model.Places;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlacesDAO  extends JpaRepository<Places, Integer> {
}
