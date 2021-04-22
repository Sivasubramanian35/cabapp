package cabbookingapp;

import java.time.LocalDate;

public class CheckSenior {
	static boolean isSenior(LocalDate dob)
	{
		int year=dob.getYear();
		LocalDate cu=LocalDate.now();
		int curyear=cu.getYear();
		int age=curyear-year;
		if(age>50)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
