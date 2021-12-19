package com.techgatha.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.techgatha.demo.model.Topic;

public interface TopicRepository extends CrudRepository<Topic,String>{

}
