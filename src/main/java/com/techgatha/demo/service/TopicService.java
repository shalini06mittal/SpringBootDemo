package com.techgatha.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techgatha.demo.dao.TopicRepository;
import com.techgatha.demo.model.Topic;

@Service
public class TopicService {

	@Autowired
	private TopicRepository topicRepository;
	
	public List<Topic> getAllTopics()
	{
		List<Topic> topics = new ArrayList<>();
		topicRepository.findAll().forEach(topics::add);
		return topics;
		
	}
	public Topic getTopic(String id) {
		return topicRepository.findById(id).get();
	}
	
	public void addTopic(Topic topic)
	{
		topicRepository.save(topic);
	}
	public void updateTopic(Topic topic,String id)
	{
		//updates the topic if it exists else it does an insert
		topicRepository.save(topic);

	}
	public void deleteTopic(String id)
	{
		topicRepository.deleteById(id);

	}
}
