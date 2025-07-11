package com.grupo3.allslife_framework.framework.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.grupo3.allslife_framework.framework.model.Notification;
import com.grupo3.allslife_framework.framework.model.User;

@Repository
public interface NotificationRepository extends JpaRepository <Notification, Long>{
    List<Notification> findByReceiver(User receiver);
}
