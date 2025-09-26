package com.nt.consumer;

import com.nt.model.Student;

public interface IReciverMessage {
	
	public void ReadMessage(Student s);
	
	public Student getCurrentMessage();


}
