package com.chaisys.learningTest;

public class TestCalculator {

	public static void main(String[] args) 
	{
		Calculator c1=new ImpCalculator();
		System.out.println("Addition of two value is "+ c1.add(3, 2));
		System.out.println("Division of two value is "+ c1.divide(8,2));
		System.out.println("Multiplication of two value is "+ c1.multiply(9, 3));
	}
}