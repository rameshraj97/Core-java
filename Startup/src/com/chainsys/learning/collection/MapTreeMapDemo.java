package com.chainsys.learning.collection;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapTreeMapDemo {

	public static void main(String[] args) {
	TreeMap<String,Double>tm=new TreeMap<String,Double>();
	tm.put("john", 3434.34);
	tm.put("tom doe", 3434.34);
	tm.put("rame", 3434.34);
	tm.put("preethi", 3434.34);
	tm.put("naveen", 3434.34);
	Set<Map.Entry<String,Double>>set= tm.entrySet();
	Iterator<Map.Entry<String,Double>>i=set.iterator();
	while(i.hasNext()) {
		Map.Entry<String,Double> me=i.next();
		System.out.println();
	}
	
	}

}
