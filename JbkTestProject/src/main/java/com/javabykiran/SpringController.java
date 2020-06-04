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
	
}
