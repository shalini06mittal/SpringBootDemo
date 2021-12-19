package com.techgatha.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techgatha.demo.dao.CourseRepository;
import com.techgatha.demo.model.Course;

@Service
public class CourseService {

	@Autowired
	private CourseRepository courseRepository;
	
	public List<Course> getAllCourses(String topicId)
	{
		
		List<Course> courses = new ArrayList<>();
		courseRepository.findByTopicId(topicId)
		.forEach(courses::add);
		return courses;
		
	}
	public Course getCourse(String id) {
		return courseRepository.findById(id).get();
	}
	
	public void addCourse(Course topic)
	{
		courseRepository.save(topic);
	}
	public void updateCourse(Course course)
	{
		//updates the topic if it exists else it does an insert
		courseRepository.save(course);

	}
	public void deleteCourse(String id)
	{
		courseRepository.deleteById(id);

	}
}
