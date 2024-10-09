package com.poly.befhark.DAO;

import com.poly.befhark.entity.Messages;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageDAO  extends JpaRepository<Messages, Integer> {
}
