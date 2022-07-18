//WAP in which you have to create a system where movie name, show time and price of ticket per show will be injected. Your job is to find out how a movie eared during a particular time 
//slot means movie Radhe time slot 12-3 earned for current week 10 crore. Similarly for other time slot you need to print the details.

package com.yash.movieticket;

import java.time.LocalDate;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class MainClass {
	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(ConfigurationClassMovie.class);
		Movie movie = ctx.getBean("movie", Movie.class);
		List<TimeSlot> timeSlots = movie.getTimeSlot();
		int screens;
		int siting;
		double price;
		
		System.out.println(movie.getMovieName()+" movie earned in current week in different slot are: ");
		for (TimeSlot timeSlot : timeSlots) {
			System.out.println("TimeSlot : "+timeSlot.getTimeSlot());
			Screening screening = timeSlot.getScreeings();
			screens = screening.getScreening();
			siting = screening.getSittingPerScreening();
			price = timeSlot.getPrice();
			System.out.println("Total Earned : "+new Double((screens*siting*price*LocalDate.now().getDayOfWeek().getValue())).longValue());
			System.out.println("********************************************************");
		}
	}

}
