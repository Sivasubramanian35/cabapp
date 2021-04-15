package com.sivasubramanian;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Scanner;

public class lvl3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		String[] cabtypes=new String[3];
		cabtypes[0]="micro";
		cabtypes[1]="mini";
		cabtypes[2]="prime";
		System.out.println("cabtypes");
		System.out.println(Arrays.toString(cabtypes));
		System.out.println("No of cab types"+cabtypes.length);
		for(String c:cabtypes)
		{
			System.out.println(c);
		}
		float amount=0;
		float dis=0;
		float gst=0,total=0;
		System.out.println("Choose cab types");
		String ct=in.next();
		System.out.println("Enter the km");
		int km=in.nextInt();
		switch(ct)
		{
		case "micro":
			amount=km*10;
			break;
		case "mini":
			amount=km*20;
			break;
		case "prime":
			amount=km*30;
			break;
		}
		System.out.println("Enter date of birth:");
		String dob=in.next();
		LocalDate db=LocalDate.parse(dob);
		int year=db.getYear();
		LocalDate cu=LocalDate.now();
		int curyear=cu.getYear();
		int age=curyear-year;
		
		System.out.println("Journey Date");
		String date=in.next();
		LocalDate dat=LocalDate.parse(date);
		System.out.println("Pickup time");
		String time=in.next();
		LocalTime tim=LocalTime.parse(time);
		//System.out.println(dat);
		//System.out.println(tim);
		int hour=tim.getHour();
		LocalTime tim1=LocalTime.parse("17:00:00");
		LocalTime tim2=LocalTime.parse("19:00:00");
		if(tim.isAfter(tim1)&&tim.isBefore(tim2))
		{
			amount=(float) (amount+((1.25*amount)/100));
		}
		System.out.println("Amount of "+ct+" is Rs."+amount);
		System.out.println("------------------------------");
		System.out.println("*************BILL*************");
		System.out.println("------------------------------");
		System.out.println("|Amount\t          | "+amount);
		gst=(7*amount)/100;
		if(age>50)
		{
			dis=(50*amount)/100;
		System.out.println("|Discount(age>50) |-"+dis);
		amount=amount-dis;
		}
		total=gst+amount;
		System.out.println("|GST percentage   | "+7+"%");
		System.out.println("|GST amount       | "+gst);
		System.out.println("|Total            | "+total);
		}	
	}


