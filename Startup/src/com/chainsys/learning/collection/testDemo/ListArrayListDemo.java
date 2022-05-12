package com.chainsys.learning.collection.testDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import com.chainsys.learning.collection.Emp;

public class ListArrayListDemo {

	private static boolean empIterator;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
lessonArrayList();
	}
	public static void  lessonArrayList() {
		ArrayList<Emp>empArrayList=new ArrayList<Emp>(30);
		System.out.println("InitialempArraylistSize:"+empArrayList.size());
		try {
			for(int i=0;i<5;i++) {
				Emp e1=new Emp(1);
				e1.name="Emp"+i;
				empArrayList.add(e1);
			}
			System.out.println("size of empArrayList after addtion:"+empArrayList.size());
			Emp e3=(Emp)empArrayList.get(4);
	         empArrayList.add(e3);
	         System.out.println("size of emparraylist after addtion:"+empArrayList.size());
	         empArrayList.add(new Emp(4));
	         System.out.println("freq of (Emp id -4) in ArrayList="+Collections.frequency(empArrayList, e3));
	         Iterator<Emp> empIterato=empArrayList.iterator();
		}
	         
	         
			
		
		
	


