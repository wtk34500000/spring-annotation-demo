package com.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
public class TennisCoach implements Coach {
	
	@Autowired
	@Qualifier("fileFortuneService")
	private FortuneService fortuneService;
	
	@Value("${foo.email}")
	private String email;
	
	@Value("${foo.team}")
	private String team;
	
	
	public String getEmail() {
		return this.email;
	}
	
	public String getTeam() {
		return this.team;
	}
	
	//define a default constructor
//	public TennisCoach() {
//		System.out.println(">>TennisCoach constructor called");
//	}
//	
//	@Autowired
//	public TennisCoach(@Qualifier("randomFortuneService")FortuneService theForuneService) {
//		this.fortuneService=theForuneService;
//	}
	
	//define a setter method
//	@Autowired
//	public void setFortuneService(@Qualifier("happyFortuneService")FortuneService theFortuneService) {
//		System.out.println(">>TennisCoach setter method is called.");
//		this.fortuneService=theFortuneService;
//	}
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

}
