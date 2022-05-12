package com.chainsys.unittest;

import com.chainsys.classandmethods.Employee;

public class Emptest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Employee first=new Employee(2342);
        first.setName("ramesh");
        first.setCity("chennai");
        first.setSalary("50000");
        System.out.println(first.getName());
        System.out.println(first.getCity());
        System.out.println(first.getSalary());
       
        }
       


}