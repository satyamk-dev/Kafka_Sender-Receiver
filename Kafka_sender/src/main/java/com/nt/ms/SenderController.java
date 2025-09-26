package com.nt.ms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.model.Student;
import com.nt.sender.ISenderTemplete;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/send")
@EnableKafka
@Slf4j
public class SenderController {
	
	@Autowired
	private ISenderTemplete Ist;
		
	@PostMapping("/msg")
	public ResponseEntity<String>  sendingMassage(@RequestBody Student s){
	String sm = Ist.sendMessage(s);
	System.out.println(sm);
		return new ResponseEntity<>(sm,HttpStatus.OK);
	}

}
