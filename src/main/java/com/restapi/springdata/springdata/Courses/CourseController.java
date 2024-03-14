package com.restapi.springdata.springdata.Courses;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CourseController {
	
	@Autowired
	private CourseService service;
	
	
	@RequestMapping("/courses")
	public List<Course> getCourses(){
		return service.getCourses();
	}
	
	@RequestMapping("/courses/{id}")
	public Course getCourseById(@PathVariable String id){
		return service.getCourseById(id);
	}
	
	@RequestMapping(value="/courses",method=RequestMethod.POST)
	public void addCourse(@RequestBody Course course){
		 service.addCourse(course);
	}
	
	@RequestMapping(value="/courses/{id}",method=RequestMethod.PUT)
	public void addCourse(@RequestBody Course course,@PathVariable String id){
		 service.updateCourse(id,course);
	}
	
	@RequestMapping(value="/courses/{id}",method=RequestMethod.DELETE)
	public void addCourse(@PathVariable String id){
		 service.deleteCourse(id);
	}
	
}
