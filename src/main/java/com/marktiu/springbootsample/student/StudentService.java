package com.marktiu.springbootsample.student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class StudentService
{
	private List<Student> students = new ArrayList<Student>(
			Arrays.asList(
					new Student("1", "mark", 39), 
					new Student("2", "ariel", 25), 
					new Student("3", "jeru", 27)
			));

	public Student getStudent(String id)
	{
		return students.stream().filter
				(t -> t.getId().equals(id)).findFirst().get();
	}
	
	public List<Student> getStudentList()
	{
		return students;
	}

	public void addStudent(Student student)
	{
		students.add(student);
	}

	public void removeStudent(String id)
	{
		students.removeIf(t -> t.getId().equals(id));
	}

}
