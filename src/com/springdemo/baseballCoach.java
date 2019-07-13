package com.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class baseballCoach implements Coach {
	
	
	
	@Autowired
	@Qualifier("happyFortuneService")
	private FortuneService fortuneService;
	
	@Value("${foo.email}")
	private String email;
	
	@Value("${foo.team}")
	private String team;
	
	
//	@Autowired
//	public baseballCoach(FortuneService theFortuneService) {
//		this.fortuneService=theFortuneService;
//	}
//	
//	@Autowired
//	public void dosomeCrazyThing(FortuneService theFortuneService) {
//		this.fortuneService=theFortuneService;
//	}
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Swing the bat 50 times per day!";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Come on: "+fortuneService.getFortune();
	}

}
