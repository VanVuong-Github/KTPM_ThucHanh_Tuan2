package com.exercise.tuan2.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.exercise.tuan2.entity.Student;

@Repository
public interface StudentRepo extends CrudRepository<Student, Long>{
	
}
