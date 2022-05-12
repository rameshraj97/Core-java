package com.chainsys.learning.collection;

import java.util.ArrayDeque;
import java.util.Iterator;

public class ArrayDequeDemo {

	public static void main(String[] args) {
	ArrayDeque<String>arraydeque=new ArrayDeque<String>();
      arraydeque.push("a");
      arraydeque.push("b");
      arraydeque.push("c");
      arraydeque.push("d");
      arraydeque.push("x");
      arraydeque.push("z");
      arraydeque.push("e");
      arraydeque.push("f");
		/*
		 * System.out.println("before popping the stack:"+arraydeque.size());
		 * while(arraydeque.peek()!=null) System.out.println(arraydeque.pop()+" ");
		 * System.out.println("after popping the stack:"+arraydeque.size());
		 */
      Iterator<String>iterator=arraydeque.iterator();
      while(iterator.hasNext()) {
    	  System.out.println("\t"+iterator.next());
      }
    	Iterator<String>stringiterator=arraydeque.descendingIterator();
    	while(stringiterator.hasNext()) 
    	{
}
    	arraydeque.addFirst("h");
    	arraydeque.addLast("i");
    	iterator=arraydeque.iterator();
    	while(iterator.hasNext());
    	System.out.println("\t"+iterator.next());
	
	System.out.println("*****************pollfirst:"+arraydeque.peekFirst());
	System.out.println(arraydeque);
	System.out.println("************peeklast:"+arraydeque.peek());
	System.out.println(arraydeque);

	// remove First 
	// retrieve and remove the first element of this deque
	
	System.out.println("*****************remove First:"+arraydeque.removeFirst());
	System.out.println(arraydeque);
	System.out.println("************removelast:"+arraydeque.removeLast());
	System.out.println(arraydeque);

	// remove first occurrence

	System.out.println("*****************remove First occurrece:"+arraydeque.removeFirstOccurrence(stringiterator));
	System.out.println(arraydeque);
	System.out.println("************removelast occurece:"+arraydeque.removeLastOccurrence(stringiterator));
	System.out.println(arraydeque);

}
}
