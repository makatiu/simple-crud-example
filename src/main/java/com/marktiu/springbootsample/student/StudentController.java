package com.marktiu.springbootsample.student;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController
{

	@Autowired
	private StudentService studentService;
	
	@RequestMapping("/getStudentList")
	public List<Student> getStudentList()
	{
		return studentService.getStudentList();
	}
	
	@RequestMapping("/getStudent/{id}")
	public Student getStudentWithId(@PathVariable String id)
	{
		return studentService.getStudent(id);			
	}
	
	@RequestMapping(value = "/addStudent", method=RequestMethod.POST)
	public void addStudent(@RequestBody Student student)
	{
		studentService.addStudent(student);
	}
	
	@RequestMapping(value = "/removeStudent/{id}", method=RequestMethod.DELETE)
	public void removeStudentWithId(@PathVariable String id)
	{
		studentService.removeStudent(id);			
	}
	
}
