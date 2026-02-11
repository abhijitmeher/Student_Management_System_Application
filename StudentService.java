package com.durgasoft.Student_Management_System.service;

import java.util.List;

import com.durgasoft.Student_Management_System.beans.Student;

public interface StudentService {	
	
	public String addStudent(Student student);	
	public Student searchStudent(Integer sid);
	public List<Student> getAllStudents();
	public String updateStudent(Student student);
	public String deleteStudent(int sid);			

}
