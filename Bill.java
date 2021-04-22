package cabbookingapp;

public class Bill {
	static void printBill(float amt,float gst,float peak,float dis)
	{
		System.out.println("--------welcome to OLA cab--------");
		System.out.println("--------Enjoy your journey--------");
		System.out.println("----------------------------------");
		System.out.println("***************BILL***************");
		System.out.println("----------------------------------");
		System.out.println("|Amount\t          | "+amt);
		System.out.println("|GST percentage   | "+7+"%");
		System.out.println("|GST amount       | "+gst);
		System.out.println("|Discount(age>50) |-"+dis);
		System.out.println("|PeakHour charge  | "+peak);
		float total=(amt+gst+peak)-dis;
		System.out.println("|Total            | Rs."+total);
		System.out.println("----------------------------------");
	}
}
