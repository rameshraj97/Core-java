package com.chaisys.learningTest;

public class ImpCalculator implements Calculator
	{
		public  int add(int v1,int v2)
		{
			int x=v1+v2;
			return x;
		}
		public  int multiply(int v1,int v2)
		{
			int x=v1*v2;
			return x;
		}
		public int divide(int v1,int v2) 
		{
			int x=v1/v2;
			return x;
		}
	}
