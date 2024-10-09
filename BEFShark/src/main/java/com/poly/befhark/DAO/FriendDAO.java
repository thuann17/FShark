package com.poly.befhark.DAO;

import com.poly.befhark.entity.Friends;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FriendDAO  extends JpaRepository<Friends, Integer> {
}
