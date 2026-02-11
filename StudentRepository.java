package com.durgasoft.Student_Management_System.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.durgasoft.Student_Management_System.beans.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{

	// All method available in JPA Repository !
	
	
}
