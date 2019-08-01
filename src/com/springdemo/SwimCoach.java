package com.springdemo;

public class SwimCoach implements Coach {

	private FortuneService fortuneService;
	
	
	public SwimCoach(FortuneService theFortuneService) {
		this.fortuneService= theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Swim 1000 meters as warm up.";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
