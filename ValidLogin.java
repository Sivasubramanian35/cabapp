package cabbookingapp;

public class ValidLogin {
	static boolean isValid(long mobno,String pswd)
	{
		boolean valid;
		String mobstr=String.valueOf(mobno);
		if(mobstr.length()==10 && pswd.length()>8)
		{
			valid=true;
		}
		else
		{
			valid=false;
		}
		return valid;
	}
}
