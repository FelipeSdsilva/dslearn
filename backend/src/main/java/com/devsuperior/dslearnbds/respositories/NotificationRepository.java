package com.devsuperior.dslearnbds.respositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.dslearnbds.entities.Notification;

@Repository
public interface NotificationRepository extends JpaRepository<Notification , Long> {

}
