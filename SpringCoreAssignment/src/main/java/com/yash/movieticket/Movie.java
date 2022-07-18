package com.yash.movieticket;

import java.util.List;

public class Movie {
	private String movieName;
	private List<TimeSlot> timeSlot;

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public List<TimeSlot> getTimeSlot() {
		return timeSlot;
	}

	public void setTimeSlot(List<TimeSlot> timeSlot) {
		this.timeSlot = timeSlot;
	}

	@Override
	public String toString() {
		return "Movie [movieName=" + movieName + ", timeSlot=" + timeSlot + "]";
	}

	

}

class TimeSlot {
	private String TimeSlot;
	private double price;
	private Screening screeings;

	public String getTimeSlot() {
		return TimeSlot;
	}

	public void setTimeSlot(String timeSlot) {
		TimeSlot = timeSlot;
	}

	public double getPrice() {
		return price;
	}

	public Screening getScreeings() {
		return screeings;
	}

	public void setScreeings(Screening screeings) {
		this.screeings = screeings;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "TimeSlot [TimeSlot=" + TimeSlot + ", price=" + price + ", screeings=" + screeings + "]";
	}

}
class Screening{
	private int screening;
	private int sittingPerScreening;
	public int getScreening() {
		return screening;
	}
	public void setScreening(int screening) {
		this.screening = screening;
	}
	public int getSittingPerScreening() {
		return sittingPerScreening;
	}
	public void setSittingPerScreening(int sittingPerScreening) {
		this.sittingPerScreening = sittingPerScreening;
	}
	@Override
	public String toString() {
		return "Screening [screening=" + screening + ", sittingPerScreening=" + sittingPerScreening + "]";
	}
	
	
	
	
}
