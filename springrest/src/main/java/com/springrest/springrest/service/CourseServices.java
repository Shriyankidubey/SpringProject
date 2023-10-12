package com.springrest.springrest.service;

import java.util.List;

import com.springrest.springrest.ItemModel.Course;

public interface  CourseServices {
	
	public  List<Course> getCourses();
		
	
	public Course getcourse(long courseId);
	
	
	public Course addcourse(Course course) ;
	
	
	public Course updatecourse(Course course) ;


	public void deletecourse(long parseLong);
	
	}
	
	


