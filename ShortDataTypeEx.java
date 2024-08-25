class ShortDataTypeEx
{
	public static void main(String args[])
	{
		short distanceInMeters=1500;
		short timeInSeconds=120;

		short speed=(short) (distanceInMeters / timeInSeconds);
		System.out.println("The speed is: " + speed + " meters per second.");
	}
}