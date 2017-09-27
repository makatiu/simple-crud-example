package com.marktiu.springbootsample.student;

public class Teacher
{

	private String name;
	private String course;
	
	public Teacher()
	{
		this.name = "miss minchin";
		this.course = "araln panlipunan"; 
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getCourse()
	{
		return course;
	}

	public void setCourse(String course)
	{
		this.course = course;
	}
}
