package com.nt.ms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.consumer.IReciverMessage;
import com.nt.model.Student;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/receive")
@Slf4j
@EnableKafka
public class ReciverController {
	
	@Autowired
	private IReciverMessage Irm;

	
	@GetMapping("/read")
	public ResponseEntity<Student>  ReadMessage(){
		 Student readMessage = Irm.getCurrentMessage();
		return new ResponseEntity<>(readMessage,HttpStatus.OK);
	}
	
	
}
