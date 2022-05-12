package com.chainsys.learning.collection.testDemo;

import com.chainsys.learning.collection.Emp;

public class TestEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Emp firstEmp= new Emp (111);
  
  Emp SecondEmp= new Emp(222);
  
  System.out.println(firstEmp.hashCode());
  System.out.println(SecondEmp.hashCode());
  
  boolean result=firstEmp.equals(SecondEmp);
  System.out.println(result);
  result=firstEmp.equals(firstEmp);
  System.out.println(result);
  result=firstEmp.equals("holle");
  System.out.println(result);
  
  
  
  
	}

}
