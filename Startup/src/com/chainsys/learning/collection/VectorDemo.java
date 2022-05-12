package com.chainsys.learning.collection;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		Vector<Integer>v=new Vector<Integer>(3,2);
		System.out.println("initial size:"+v.size());
		System.out.println("initial capacitor:"+v.capacity());
		v.addElement(1);
		v.addElement(2);
		v.addElement(3);
		v.addElement(4);
		System.out.println("capacity:"+v.capacity());
		v.addElement(5);
		v.addElement(6);
		System.out.println("capacity"+v.capacity());
		System.out.println("first element"+(Integer)v.firstElement());
		System.out.println("Lastelement")
	}

}
