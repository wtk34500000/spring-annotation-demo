package com.springdemo;

public class WeeklyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "You are so happy this week!";
	}

}
