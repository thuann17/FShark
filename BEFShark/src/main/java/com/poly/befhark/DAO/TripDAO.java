package com.poly.befhark.DAO;


import com.poly.befhark.model.Trips;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TripDAO extends JpaRepository<Trips, Integer> {
}
