package com.chainsys.unittest;

import java.sql.Date;

import com.chainsys.entrypoint.Startup;

public class VariableTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		{
			//display the value of static field
			//value is zero (default value)
			//DataA is accessed without creating an object
			System.out.println("DataA: " + Startup.DataC);
			//display the value of immutable field
			//this is not possible  without an object
			//System.out.println("DataB: " + Startup.DataB);
			//display the value of constant field
			
			System.out.println("DataC: " + Startup.DataC);
			//modifying value of the static field DataA
			Startup.DataC=2345;
			System.out.println("DataA: " + Startup.DataC);
			//modifying value of the static field DataC
			//ERROR: The final field Startup.DatC cannot be assigned
			//Startup.DataC=2345;
 }
	
	}
}

