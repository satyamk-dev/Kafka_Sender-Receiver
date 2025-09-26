package com.nt.sender;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import com.nt.model.Student;

@Component
public class SenderTemplate implements ISenderTemplete {
	
	
	@Value("${app.kafka.topic}")
	private String topic;
	
	@Autowired
	private  KafkaTemplate<String, Student> kt ;
	

	@Override
	public String sendMessage(Student s) {
		kt.send(topic, s);
		System.out.println(topic);
		return "Message Delivered";
		
	}

	

}
