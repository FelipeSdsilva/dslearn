package com.devsuperior.dslearnbds.respositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.dslearnbds.entities.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long>{

}
