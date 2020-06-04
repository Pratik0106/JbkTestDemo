package com.javabykiran;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/testapi")
public class SpringController {

	@RequestMapping("/getquestion")
	public ArrayList<Question> getquestion()
	{
		ArrayList<Question> arraylistque=new ArrayList<>();
		//object of question1
		Question que=new Question();
		que.setQuestion("What are the features of java features?");
		que.setQueid(1);
		que.setOption1("inheritance");
		que.setOption2("binding");
		que.setCorrectanswer("Inheritance");
		arraylistque.add(que);
		return arraylistque;
	}
	@RequestMapping("/getallquestion")
	public ArrayList<Question> getAllquestion()
	{
		ArrayList<Question> arraylistque=new ArrayList<>();
		//object of question1
		Question que=new Question();
		que.setQuestion("What are the features of java features?");
		que.setQueid(1);
		que.setOption1("inheritance");
		que.setOption2("binding");
		que.setCorrectanswer("Inheritance");
		
		Question que1=new Question();
		que1.setQuestion("How many type of inheritance?");
		que1.setQueid(1);
		que1.setOption1("5");
		que1.setOption2("4");
		que1.setCorrectanswer("4");

		Question que2=new Question();
		que2.setQuestion("How many type of inheritance?");
		que2.setQueid(1);
		que2.setOption1("5");
		que2.setOption2("4");
		que2.setCorrectanswer("4");
		arraylistque.add(que);
		arraylistque.add(que1);
		arraylistque.add(que2);
		return arraylistque;
	}
	
}
