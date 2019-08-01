package com.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PingongJavaConfigDemoApp {

	public static void main(String[] args) {
		
		//read spring config java class
		AnnotationConfigApplicationContext context=
				new AnnotationConfigApplicationContext(SportConfig.class);
		
		//get the bean from spring container
		Coach theCoach = context.getBean("pingpongCoach", Coach.class);
//		Coach baseballCoach = context.getBean("baseballCoach", Coach.class);
		
		//call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
//		System.out.println(baseballCoach.getDailyWorkout());
		
		//call method to get daily fortune
		System.out.println(theCoach.getDailyFortune());
//		System.out.println(baseballCoach.getDailyFortune());
		
		//call our new swim coach method.. has the props values injected
//		System.out.println("email: " + theCoach.getEmail());
//		System.out.println("team: " + theCoach.getTeam());
				
		//close the context
		context.close();
	}

}
