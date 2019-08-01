package com.springdemo;

public class PingpongCoach implements Coach {

	private FortuneService fortuneService;
	
	public PingpongCoach(FortuneService theFortuneService) {
		this.fortuneService=theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "swing you paddle 1000 times!";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
