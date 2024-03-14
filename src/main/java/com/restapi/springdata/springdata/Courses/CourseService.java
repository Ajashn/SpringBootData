package com.restapi.springdata.springdata.Courses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CourseService {
	
	@Autowired
	private CourseRepository repo;
	private List<Course> courses=new ArrayList<>(Arrays.asList(new Course("1","java","javacourse"),
		new Course("2","spring","springcourse"),
		new Course("3","sprongboot","sprongbootcourse"),
		new Course("4","maven","maven"),
		new Course("5","springmvc","springmvc")));

	public List<Course> getCourses(){
		//return courses;
		List<Course> courses=new ArrayList<>();
		repo.findAll().forEach(courses::add);
		return courses;
	}

	public Course getCourseById(String id) {
		//return courses.stream().filter(course->course.getId().equals(id)).findFirst().get();
		return repo.findById(id).get();
	}

	public void addCourse(Course course) {
		// TODO Auto-generated method stub
		repo.save(course);
		
	}
	
	public void updateCourse(String id,Course course) {

		
		repo.save(course);

	}

	public void deleteCourse(String id) {
		repo.deleteById(id);
	
	}
}
