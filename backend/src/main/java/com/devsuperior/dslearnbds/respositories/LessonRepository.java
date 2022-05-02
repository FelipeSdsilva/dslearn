package com.devsuperior.dslearnbds.respositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.dslearnbds.entities.Lesson;

@Repository
public interface LessonRepository extends JpaRepository<Lesson, Long>{

}
