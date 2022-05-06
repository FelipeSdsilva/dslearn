package com.devsuperior.dslearnbds.respositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.dslearnbds.entities.Notification;
import com.devsuperior.dslearnbds.entities.User;

@Repository
public interface NotificationRepository extends JpaRepository<Notification , Long> {

	Page<Notification> findByUser(User user, Pageable pageable);
}
