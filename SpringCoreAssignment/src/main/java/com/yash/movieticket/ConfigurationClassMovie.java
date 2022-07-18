package com.yash.movieticket;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.yash.movieticket")
public class ConfigurationClassMovie {
	
	@Bean
	public Screening screening1()
	{
		Screening screening=new Screening();
		screening.setScreening(200);
		screening.setSittingPerScreening(50);
		return screening;
	}
	@Bean
	public Screening screening2()
	{
		Screening screening=new Screening();
		screening.setScreening(190);
		screening.setSittingPerScreening(50);
		return screening;
	}
	
	@Bean
	public TimeSlot timeSlot1()
	{
		TimeSlot timeSlot=new TimeSlot();
		timeSlot.setTimeSlot("9-12");
		timeSlot.setPrice(600);
		timeSlot.setScreeings(screening1());
		return timeSlot;
	}
	@Bean
	public TimeSlot timeSlot2()
	{
		TimeSlot timeSlot=new TimeSlot();
		timeSlot.setTimeSlot("12-3");
		timeSlot.setPrice(750);
		timeSlot.setScreeings(screening2());
		return timeSlot;
	}
	
	@Bean
	public TimeSlot timeSlot3()
	{
		TimeSlot timeSlot=new TimeSlot();
		timeSlot.setTimeSlot("3-6");
		timeSlot.setPrice(950);
		timeSlot.setScreeings(screening1());
		return timeSlot;
	}
	
	@Bean
	public Movie movie()
	{
		Movie movie=new Movie();
		movie.setMovieName("Radhe");
		List<TimeSlot> timeSlots=new ArrayList<TimeSlot>();
		timeSlots.add(timeSlot1()); timeSlots.add(timeSlot2()); timeSlots.add(timeSlot3());
		movie.setTimeSlot(timeSlots);
		return movie;
	}
	

}
