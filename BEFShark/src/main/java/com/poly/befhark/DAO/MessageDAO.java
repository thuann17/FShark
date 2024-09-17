package com.poly.befhark.DAO;

import com.poly.befhark.model.Messages;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageDAO  extends JpaRepository<Messages, Integer> {
}
