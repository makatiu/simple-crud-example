package com.marktiu.springbootsample.student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class StudentService
{
	@Autowired
	StudentRepository studentRepository;

	public Student getStudent(String id)
	{
		return studentRepository.findOne(id);
	}
	
	public List<Student> getStudentList()
	{

		List<Student> student = new ArrayList<>();
		studentRepository.findAll().forEach(student::add);
	
		return student;
	}

	public void addStudent(Student student)
	{
		studentRepository.save(student);
	}

	public void removeStudent(String id)
	{
		studentRepository.delete(id);
	}

}
