package com.poly.befhark.DAO;

import com.poly.befhark.entity.Notifications;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificationDAO  extends JpaRepository<Notifications, Integer>
{
}
