package com.poly.befhark.DAO;

import com.poly.befhark.model.Conversations;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConversationDAO  extends JpaRepository<Conversations, Integer> {
}
