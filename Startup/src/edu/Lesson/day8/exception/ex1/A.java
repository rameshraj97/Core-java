package edu.Lesson.day8.exception.ex1;

public class A {
public static void m1() {}
public static void m2() {}
    
public static void m3() {
	//m4();
	try {
		m4();
		
	}
	catch(Exception e)
{
		System.out.println("inside catch "+e.getMessage());
		Throwable t1=e.getCause();
		System.out.println("cause"+t1.getMessage());
		
	}
}
		public static void m4()  throws Exception{
	Exception e1=new Exception("Error 1");
	//inner Exception
	// e1 is nested inside e2
	Exception e2=new Exception("Error 2",e1);
	//throw e2;
}
	public static void testm4() 
	{
		try {
			m4();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			
			
		}

			}
		
	

