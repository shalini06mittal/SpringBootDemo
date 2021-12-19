package com.techgatha.demo.restapi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.techgatha.demo.model.Course;
import com.techgatha.demo.model.Topic;
import com.techgatha.demo.service.CourseService;

@RestController
public class CourseController {

	@Autowired
	private CourseService courseService;
	
	/*
	 * Here when you call this path it loads courses for a particular topic along with topic
	 * details. If you do not want to load the topic details you can lazy load the Topic 
	 * Course class
	 */
	@RequestMapping("/topics/{id}/courses")
	public List<Course> getAllCourses(@PathVariable String id) {
		return courseService.getAllCourses(id);
	}
	
	@RequestMapping("/topics/{topicid}/courses/{id}")
	public Course getCourse(@PathVariable String id)	
	{
		return courseService.getCourse(id);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/topics/{topicId}/courses")
	//Instead asking user to pass the topic object i let user pass the id for which 
	//course to be added and rest will be handled in the code.
	public void addCourse(@RequestBody Course course, @PathVariable String topicId)
	{		
		course.setTopic(new Topic(topicId,"",""));
		courseService.addCourse(course);	
	}
	@RequestMapping(method=RequestMethod.PUT,value="/topics/{topicId}/courses/{id}")
	public String updateCourse(@RequestBody Course course,@PathVariable String topicId,@PathVariable String id )
	{
		course.setTopic(new Topic(topicId,"",""));
		courseService.updateCourse(course);	
		return "Updated";
	}
	@RequestMapping(method=RequestMethod.DELETE,value="/topics/{topicId}/courses/{id}")
	//@RequestBody this tells pring framework that theres a payload with post request.
	public String deleteCourse(@PathVariable String id)
	{
		courseService.deleteCourse(id);	
		return "deleted";
	}
}
