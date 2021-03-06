package com.devsuperior.dslearnbds.respositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.dslearnbds.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	User findByEmail(String email);
}
