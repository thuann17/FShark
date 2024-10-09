package com.poly.befhark.DAO;


import com.poly.befhark.entity.Trips;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TripDAO extends JpaRepository<Trips, Integer> {
}
