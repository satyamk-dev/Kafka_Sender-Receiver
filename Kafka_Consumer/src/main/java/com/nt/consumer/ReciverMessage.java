package com.nt.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import com.nt.model.Student;

@Component
public  class ReciverMessage implements IReciverMessage {
	
	private Student st;

	@Override
	@KafkaListener(topics="${app.kafka.topic}" ,groupId="Kafka_Consumer_Group")
	public void ReadMessage(Student s) {
	  this.st=s;
	}
	
	public Student getCurrentMessage() {
		return st;
	}
}

