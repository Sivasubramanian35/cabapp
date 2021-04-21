package cabbookingapp;

public class bill {
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
		System.out.println("|peakHour charge  | "+peak);
		float total=(amt+gst+peak)-dis;
		System.out.println("|Total            | "+total);
		System.out.println("----------------------------------");
	}
}
