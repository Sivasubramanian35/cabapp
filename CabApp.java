package cabbookingapp;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class CabApp {

	public static void main(String[] args) {
		float peakCharge,discount;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter mobile number:");
		long mobno=in.nextLong();
		System.out.println("Enter password:");
		String pswd=in.next();
		if(ValidLogin.isValid(mobno,pswd))  //Validate login credentials
		{
			System.out.println("Valid login");
			System.out.println("1.Mini\n2.Micro\n3.Prime");
			System.out.println("Choose cabtype(enter 1 or 2 or 3):");
			int type=in.nextInt();
			int cabPrice=CabType.getPrice(type); //Get price amount for cab type
			System.out.println("Enter no of km:");
			int km=in.nextInt();
			float amount=cabPrice*km; //Calculate amount
			float gstValue;
			gstValue=Gst.findGst(amount);   //Find GST
			System.out.println("Journey Date(yyyy-mm-dd):");
			String date=in.next();
			LocalDate dat=LocalDate.parse(date);
			System.out.println("Pickup time(hh:mm:ss)");
			String time=in.next();
			LocalTime tim=LocalTime.parse(time);
			if(PeakHour.isPeakhour(tim))  //Check peak hour
			{
				peakCharge= (float)(1.25*amount)/100;  //1.25% will be added per km for peak hour
			}
			else {
				peakCharge=0;
			}
			System.out.println("Enter date of birth(yyyy-mm-dd)");
			String dob=in.next();
			LocalDate dob1=LocalDate.parse(dob);
			if(CheckSenior.isSenior(dob1)) //Check senior citizen
			{
				discount=(50*amount)/100;  //Reduce 50% of amount if senior citizen
			}
			else {
				discount=0;
			}
			Bill.printBill(amount,gstValue,peakCharge,discount); //Print receipt
		}
		else
		{
			System.out.println("SOORY!Not valid!");
			System.out.println("Enter valid 10 digit mobile number");
			System.out.println("make sure your password is greater than 8 digit");
		}
		in.close();
	}

}
