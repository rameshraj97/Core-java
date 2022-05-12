package com.chainsys.learning.garbagecollectoin;

public class FinalizeDemo {
	public static void main(String args[])throws Exception
	{
		Calculator c1=new Calculator();
		c1.add(100,50);
		c1=null;
		Calculator c2=new Calculator();
		Calculator c3=new Calculator();
		// creating an obj for runtime
		// it is not possible to create n obj direclty for runtime like
		// runtime first rt=new runtime ();
		// the default constructor for runtime is private here
		// so we use a static 

		Runtime rt=Runtime.getRuntime();//factorymethod
	     rt.gc();
	     c2=null;
	     c3=null;
	     rt.gc();
		System.in.read();
	}
}


