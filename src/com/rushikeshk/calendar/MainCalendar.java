package com.rushikeshk.calendar;

public class MainCalendar {

	public static void main(String[] args) {
		CalendarDemo cal = new CalendarDemo();
		cal.day(Day.Saturday);
		cal.day(Day.Wednesday);
		cal.month(Month.March);
		cal.month(Month.May);
		cal.month(Month.September);
		cal.month(Month.June);
		cal.month(Month.October);
		cal.direction(Direction.NorthWest);
		cal.direction(Direction.East);
		cal.direction(Direction.South);
		
	}

}
