package com.chainsys.learning.collection;

import java.util.Iterator;
import java.util.TreeSet;

public class demoA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 TreeSet<String>ts=new TreeSet<String>();
  ts.add(" cut");
  ts.add(" fun");
  ts.add(" assam");
  ts.add(" ball");
  ts.add(" dog");
  ts.add(" aad");
  ts.add(" aad");
  ts.add(" event");
  ts.add(" fan");
  ts.add(" null");
  ts.add(" dheli");
  ts.add(" apple");
  ts.add(" egg");
  ts.add(" fool");
  System.out.println("size"+ts.size());
  Iterator<String>itr=ts.iterator();
  while(itr.hasNext()) {
	  System.out.println(itr.next());
  }
	}

}
