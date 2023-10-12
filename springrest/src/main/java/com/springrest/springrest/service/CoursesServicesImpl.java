package com.springrest.springrest.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.springrest.springrest.ItemModel.Course;


@Service
public class CoursesServicesImpl implements CourseServices {
	
	List<Course> list ;
	
	
	public CoursesServicesImpl() {
		
		list = new ArrayList<>();
		list.add( new Course(123 ,"Java Backend Course" , " This is an assignment course to display the basic functioning."));
		list.add( new Course(127 ,"SpringBoot" , " This is an assignment course to display the basic  springboot functioning."));
		list.add( new Course(129 ,"Java Core Course" , " This is an assignment course to display the basic Java Core functioning."));
	}

	@Override
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		return list;
	}

	@Override
	public Course getcourse(long courseId) {
		// TODO Auto-generated method stub
		
		Course  c = null;
		for(Course course : list ) {
			if(course.getId()== courseId) {
				 c= course ;
				 break ;
			}
		}
		return c;
	}

	@Override
	public Course addcourse(Course course) {
		// TODO Auto-generated method stub
		
		list.add(course);
		return course;
	}

	@Override
	public Course updatecourse(Course course) {
		
		// TODO Auto-generated method stub
		
		for(Course e : list) {
		
		if(e.getId() == course.getId()) {
			e.setName(course.getName());
			e.setDescription(course.getDescription());
		}
		
	}
		return course;
	}
	
	
	

	@Override
	public void deletecourse(long parseLong) {
		// TODO Auto-generated method stub
		list = this.list.stream().filter(e->e.getId()!=parseLong).collect(Collectors.toList());
		
	}
}