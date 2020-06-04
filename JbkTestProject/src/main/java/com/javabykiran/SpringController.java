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
		
		Question que=new Question();
		que.setQuestion("What are the features of java features?");
		que.setQueid(1);
		que.setOption1("inheritance");
		que.setOption2("binding");
		que.setCorrectanswer("Inheritance");
		arraylistque.add(que);
		return arraylistque;
	}
	@RequestMapping("/getquestion")
	public ArrayList<Question> getallquestion()
	{
		ArrayList<Question> arraylistque=new ArrayList<>();
		
		Question que=new Question();
		que.setQuestion("What are the features of java features?");
		que.setQueid(1);
		que.setOption1("inheritance");
		que.setOption2("binding");
		que.setCorrectanswer("Inheritance");
		
		Question que2=new Question();
		que2.setQuestion("How many types of inheritance?");
		que2.setQueid(2);
		que2.setOption1("5");
		que2.setOption2("4");
		que2.setCorrectanswer("4");
		
		arraylistque.add(que);
		arraylistque.add(que2);
		return arraylistque;
	}
	
}
