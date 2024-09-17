package com.poly.befhark.DAO;

import com.poly.befhark.model.Placetrips;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlacetripDAO  extends JpaRepository<Placetrips, Integer> {
}
