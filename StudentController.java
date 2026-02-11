package com.durgasoft.Student_Management_System.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.durgasoft.Student_Management_System.beans.Student;
import com.durgasoft.Student_Management_System.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {	
		
	@Autowired		
	private StudentService service;	
	
	@PostMapping("/add")	
	public ResponseEntity<String> add(@RequestBody Student student){
		
		String status = service.addStudent(student);	
			
		return new ResponseEntity<>(status, HttpStatus.CREATED);	
	}
	
	@GetMapping("/search/{sid}")
	public ResponseEntity<Student> search(@PathVariable("sid") Integer sid){
		
		Student student = service.searchStudent(sid);
		
		return new ResponseEntity<>(student, HttpStatus.OK);	
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<Student>> getAll(){	
		
		List<Student> studs = service.getAllStudents();
		
		return new ResponseEntity<List<Student>>(studs, HttpStatus.OK);	
	}
	
	@PutMapping("/update")
	public ResponseEntity<String> update(@RequestBody Student student){
		
		String status = service.updateStudent(student);	
		
		return new ResponseEntity<>(status,HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{sid}")	
	public ResponseEntity<String> delete(@PathVariable Integer sid){
		
		String status = service.deleteStudent(sid);
		
		return new ResponseEntity<String>(status, HttpStatus.OK);	
	}

}
