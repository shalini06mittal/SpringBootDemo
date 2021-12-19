package com.techgatha.demo.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.techgatha.demo.model.Topic;
import com.techgatha.demo.service.TopicService;

@Controller
//@RequestMapping("/mvc")
public class TopicMVCController {
	
	@Autowired
	TopicService topicService;
	
	public TopicMVCController() {
		System.out.println("mvc controller");
	}
	
	@RequestMapping("/")
	public String getAllTopics(Map<String, List<Topic>> map)
	{
		System.out.println("get topics");
		map.put("topics",this.topicService.getAllTopics());
		return "welcome";
	}
	@RequestMapping("/addtopic")
	public String addTopic()
	{
		return "topicform";
	}
	@RequestMapping("/add")
	public String insertTopic(Topic topic)
	{
		System.out.println(topic);
		this.topicService.addTopic(topic);
		return "redirect:/";
	}
	@RequestMapping("/delete/{id}")
	public String deleteTopic(@PathVariable String id)
	{
		this.topicService.deleteTopic(id);
		return "redirect:/";
	}

}
