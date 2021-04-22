package cabbookingapp;

import java.time.LocalTime;

public class PeakHour {
	static boolean isPeakhour(LocalTime time)
	{
		LocalTime tim1=LocalTime.parse("18:00:00");
		LocalTime tim2=LocalTime.parse("20:00:00");
		if(time.isAfter(tim1)&&time.isBefore(tim2))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
