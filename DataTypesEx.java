public class DataTypesEx 
{
	public static void main(String[] args)
	{
      		int a = 10;
        	float b = 10.5f; 
       		char c = 'A'; 
        	boolean d = false;
        	String str = "Java";
        	System.out.println(((Object)a).getClass().getName()); 
        	System.out.println(((Object)b).getClass().getName());
       	 	System.out.println(((Object)c).getClass().getName());
        	System.out.println(((Object)d).getClass().getName());
        	System.out.println(str.getClass().getName()); 
    	}    
}
