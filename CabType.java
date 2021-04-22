package cabbookingapp;

public class CabType {
	static int getPrice(int type)
	{
		int price = 0;
		switch(type)
		{
		case 1:
			price=10;
			break;
		case 2:
			price=20;
			break;
		case 3:
			price=30;
			break;
		}
		return price;
	}
}
