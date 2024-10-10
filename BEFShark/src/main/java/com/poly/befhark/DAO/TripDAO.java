package com.poly.befhark.DAO;


import com.poly.befhark.entity.Trips;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface TripDAO extends JpaRepository<Trips, Integer> {
    @Query(value = "EXEC  GetTripByYear :year_param", nativeQuery = true)
    int getTripByYear(int year_param);
}
