package com.techgatha.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Course {

	@Id
	private String id;
	private String name;
	private String description;
	// Add this topic ref as course is related with a particular topic.and there 
	//can be many courses for a single topic.
	//It is a foreign key here in course table.
	@ManyToOne
	private Topic topic;
	public Course() {
		// TODO Auto-generated constructor stub
	}
	
	public Course(String id, String name, String description,String topicid) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.topic= new Topic(topicid, "", "");
	}

	public Topic getTopic() {
		return topic;
	}

	public void setTopic(Topic topic) {
		this.topic = topic;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Topic [id=" + id + ", name=" + name + ", description=" + description + "]";
	}
	
	
}
