//byte->short->int->long->float->double
class WideningTypeCasting
{
	public static void main(String args[])
	{
		int i=100;
		long l=i;
		float f=l;
		System.out.println("Integer value : "+i);
		System.out.println("Long value : "+l);
		System.out.println("Float value : "+f);
	}
} 