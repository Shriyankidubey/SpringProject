package com.springrest.springrest.controller;

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
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.ItemModel.Course;
import com.springrest.springrest.service.CourseServices;

@RestController 
public class MyController {
	
	@Autowired
	private CourseServices courseservice;
	
	@GetMapping("/home")
	public String home() {
		return "Welcom home harry.";
	}
	
	// this will get all the courses
	@GetMapping("/courses")
	public List<Course> getCourses() {
	
		return this.courseservice.getCourses();
	}
	
	// this will get the particular courseId .
	@GetMapping ("/courses/{courseId}")
	public Course getcourse(@PathVariable String  courseId ) {
		
		return this.courseservice.getcourse(Long.parseLong(courseId));
		
	}
	
	
	// this method used to post or add the course
	
	@PostMapping("/courses")
	public Course addcourse(@RequestBody Course course) {
		return this.courseservice.addcourse(course);
	}
	// this is used for updating the course
	@PutMapping("/courses")
	public Course updatecourse(@RequestBody Course course) {
		return this.courseservice.updatecourse(course);
	}
	
	// this methos is used to delte the course by giving or providing it's courseId.
	@DeleteMapping("/courses/{courseId}")
	public ResponseEntity<HttpStatus> deletecourse(@PathVariable String courseId){
		try {
			this.courseservice.deletecourse(Long.parseLong(courseId));
			return new  ResponseEntity<>(HttpStatus.OK);
		}
		catch (Exception e) {
			return  new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
