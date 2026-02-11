package com.durgasoft.Student_Management_System.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.durgasoft.Student_Management_System.beans.Student;
import com.durgasoft.Student_Management_System.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService{
	
	@Autowired	
	private StudentRepository repository;

	// Add Student 
	@Override
	public String addStudent(Student student) {
	
		repository.save(student);	
		
		return student.getSid()+" Student inserted successfully !";
	}
	
	// Search Student 
	@Override
	public Student searchStudent(Integer sid) {	
		
		Optional<Student> stud = repository.findById(sid);
		
		if(stud.isPresent()) {
			return stud.get();	
		}
		
		return null;
	}

	// Get All Student
	@Override	
	public List<Student> getAllStudents() {
		
		List<Student> studs = repository.findAll();
		
		return studs;	
	}

	// Update Student 
	@Override
	public String updateStudent(Student student) {	
		
		if(repository.existsById(student.getSid())) {
			repository.save(student);
			return "Student update successfully !";
		}else {
			return "Student not found !";
		}

	}

	// Delete Student	
	@Override	
	public String deleteStudent(int sid) {
		
		if(repository.existsById(sid)) {
			repository.deleteById(sid);
			return "Student delete successfully !";
		}else {
			return "Student not found !";
		}

	}

}
