package edu.Lesson.day8.exception.ex1;

public class DemoTrace {
private static Throwable err;

public static void m1() {
	try {
		m2();
	}catch(Exception err) {
		System.out.println("get msg"+err.getMessage());
		err.printStackTrace();
		/*
		 * Throwable t1=err.getCause(); if(null !=t1) { class c1=t1.getclass();
		 * System.out.println("case"+c1.getName); } else
		 * System.out.println("case is null");
		 */
		}
		finally {
			System.out.println("inside m1 finally");
		}
	}
	public static void m2() 
	{
		m3();
	} 
	public static void m3()
	{
		m4();
	}
	public static void m4()
	{
		int x=0;
		int y=0;
		int z=0;
		x=100;
		z=x/y;
		System.out.println("result"+z);
	
}
}
