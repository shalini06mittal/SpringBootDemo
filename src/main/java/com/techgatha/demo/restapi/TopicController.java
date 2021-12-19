package com.techgatha.demo.restapi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.techgatha.demo.model.Topic;
import com.techgatha.demo.service.TopicService;

@RestController
public class TopicController {

	@Autowired
	private TopicService topicService;
	
	@RequestMapping("/topics")
	public List<Topic> getAllTopics() {
		return topicService.getAllTopics();
	}
	
	@RequestMapping("/topics/{id}")
	//if {id} and parameter are same name no need to provide @PathVariable("id")
	//public Topic getTopic(@PathVariable("id") String id)
	public Topic getTopic(@PathVariable String id)
	
	{
		return topicService.getTopic(id);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/topics")
	//@RequestBody this tells pring framework that theres a payload with post request.
	public void addTopic(@RequestBody Topic topic)
	{
		topicService.addTopic(topic);	
	}
	@RequestMapping(method=RequestMethod.PUT,value="/topics/{id}")
	//@RequestBody this tells pring framework that theres a payload with post request.
	public String updateTopic(@RequestBody Topic topic,@PathVariable String id)
	{
		topicService.updateTopic(topic,id);	
		System.out.println(topicService.getAllTopics());
		return "Updated";
	}
	@RequestMapping(method=RequestMethod.DELETE,value="/topics/{id}")
	//@RequestBody this tells pring framework that theres a payload with post request.
	public String deleteTopic(@PathVariable String id)
	{
		topicService.deleteTopic(id);	
		System.out.println(topicService.getAllTopics());
		return "deleted";
	}
}
