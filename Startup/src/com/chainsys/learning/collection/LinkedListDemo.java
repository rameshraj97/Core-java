package com.chainsys.learning.collection;
import java.util.*;
public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String>stringLinkedList= new LinkedList();
		        stringLinkedList.add("F");
		        stringLinkedList.add("B");
		        stringLinkedList.add("");
		        stringLinkedList.add("E");
		        stringLinkedList.add("C");
		        stringLinkedList.add("F");
		        stringLinkedList.add("B");
		        stringLinkedList.add("D");
		        stringLinkedList.add("E");
		        stringLinkedList.add("C");
		        stringLinkedList.addLast("Z");
		        stringLinkedList.addFirst("A");
		        stringLinkedList.add(1,"A2");
		        Iterator<String>stringIterator=stringLinkedList.iterator();
		        while(stringIterator.hasNext()) {
		            System.out.print(stringIterator.next()+" ");
		        }
		        System.out.println();
		        stringLinkedList.remove("F");
		        stringLinkedList.remove(2);
		        Iterator<String>stringIterator1=stringLinkedList.iterator();
		        while(stringIterator1.hasNext()) {
		            System.out.print(stringIterator1.next()+" ");
		        }
		        System.out.println();
		        stringLinkedList.removeFirst();
		        stringLinkedList.removeLast();
		        Iterator<String>stringIterator11=stringLinkedList.iterator();
		        while(stringIterator11.hasNext()) {
		            System.out.print(stringIterator11.next()+" ");
		        }
		    }

		
		
	
		public static void main(String args[]) {
		    // initial capacity is 3 increment is by 2
		    Vector<Integer> v=new Vector<Integer> (3, 2); 
		    System.out.println("Initial size :"+v.size());
		    System.out.println("Initial capacity :"+v.capacity());
		    v.addElement(1);//new InLeger (1)
		    v.addElement(2);
		    v.addElement(3);
		    v.addElement(4);
		    System.out.println("capacity :"+v.capacity());
		    v.addElement (5);
		    v.addElement (6);
		    System.out.println("capacity "+v.capacity());
		    System.out.println ("Firat element: " +(Integer) v.firstElement());
		    System.out.println("Last element: " +(Integer)v.lastElement());
		    if(v.contains (3))
		    System.out.println("Vector contains 3.");
		    
		    Enumeration<Integer> vEnum = v. elements (); 
		    System.out.println("\nElements in vector: "); 
		    while (vEnum.hasMoreElements()) 
		        System.out.print (vEnum.nextElement () + " ");

		}}
