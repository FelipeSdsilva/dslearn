package com.devsuperior.dslearnbds.respositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.dslearnbds.entities.Content;

@Repository
public interface ContentRepository extends JpaRepository<Content, Long> {

}
