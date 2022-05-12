package com.chainsys.unittest;

import com.chainsys.variables.Calculator;

public class CalculatorTest {
public static void testAdd() 
{

int arg1=100;
int arg2=50;
int output=Calculator.add(100, 50);
	System.out.println("result:"+output);
}
public static void testMultiply()
{
int arg1=100;
int arg2=50;
int output=Calculator.multiple(100, 50);
	System.out.println("result:"+output);
	}

public static void testDivide()

{
int arg1=100;
int arg2=50;
int output=Calculator.divide(100, 50);
	System.out.println("result:"+output);
}
	
public static void testSubtract() {
	int arg1=100;
	int arg2=50;
	int output=Calculator.subtract(100, 50);
		System.out.println("result:"+output);
	}

}
