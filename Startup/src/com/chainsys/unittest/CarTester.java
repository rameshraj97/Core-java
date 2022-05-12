package com.chainsys.unittest;

import com.chainsys.classandmethods.Car;

public class CarTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Car firstcar=new Car("tn 20A 001");
      firstcar.setColor("red");
      firstcar.setFuel("petrol");
      firstcar.setYearofpurchase(2022);
      System.out.println(firstcar.regNo); 
      System.out.println(firstcar.getColor());
      System.out.println(firstcar.getFuel());
      System.out.println(firstcar.getYearofpurchase());
	}

}
