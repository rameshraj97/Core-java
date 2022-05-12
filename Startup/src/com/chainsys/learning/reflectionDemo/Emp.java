package com.chainsys.learning.reflectionDemo;

public class Emp {
	//Amp
	
	
	public int Eno;
	public String Name;
	public Emp()
	{
	   System.out.println("Emp Created");
	}
	public void startWork()
	{
	   System.out.println("WorkStarted");
	    }
	    public void pauseWork(int duration)
	    {
	        System.out.println("pauseWork for "+duration );
	    }
	
	}

