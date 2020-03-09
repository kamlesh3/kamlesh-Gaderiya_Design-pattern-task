package BuilderPattern;

public class Shop 
{
	public static void main(String args[])
	{
		Phone p = new PhoneBuilder().setOs("Android").setRam(2).setProcessors("i5").getPhone();
	    System.out.println(p);
	}

}
