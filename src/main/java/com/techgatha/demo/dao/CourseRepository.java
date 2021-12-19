package com.techgatha.demo.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.techgatha.demo.model.Course;

public interface CourseRepository extends CrudRepository<Course,String>{

	//add method to look for all the courses specific to a particular topic.
	//if you provide a method in a particular way CrudRepository will filter data accordingly.
	//lets see a simple example to look for courses with a particular name;
	//to find courses use find, for filter use By and filter with what i.e name so Name
	public List<Course> findByName(String name);
	public List<Course> findByDescription(String description);
	//if topic was a string following would have worked
	//public List<Course> findByTopic(String topicId);
	//But since it is a class Topic and looking for a topic with an Id so TopicId
	public List<Course> findByTopicId(String topicId);
	
}
