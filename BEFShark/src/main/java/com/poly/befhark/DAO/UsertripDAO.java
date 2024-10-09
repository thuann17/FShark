package com.poly.befhark.DAO;

import com.poly.befhark.entity.Usertrips;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsertripDAO extends JpaRepository<Usertrips, Integer> {
}
