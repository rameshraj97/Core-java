package chainsys;

public class Third {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//primitive data type
		//signed date type
   byte bl=-128;//less 128,great then-129(-128 to -127)
   System.out.println("bl:" +bl);
   short maxvalue=32767;//2^16
   System.out.println("short max value:"+maxvalue);
	short minvalue=	-32768;//2^32
   System.out.println("short min value:"+minvalue); 
   long maxvalue1=9223372036854775807L;//2^64
	System.out.println("long max value:"+maxvalue);	  
   long minvalue1=-9223372036854775808L;//2^64
   System.out.println("long min value:"+maxvalue);
   float maxvalue2=2147483648.5432F;//2^32
   float minvalue2= -2147483648.11111F;//2^32
   double maxvalue3=2147483648.5432F;
   double minvalue3=-2147483648.11111F;
	}

}
