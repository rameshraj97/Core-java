package com.chainsys.learning.collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EventObject;
import java.util.Iterator;
import java.util.ListIterator;
public class ListIteratorDemo {

	public static void main(String[] args) {
		ArrayList<String>StringArrayList= new ArrayList<String>();
        String s1="s";
        StringArrayList.add("c");
        StringArrayList.add("s1");
        StringArrayList.add("A");
        StringArrayList.add("E");
        StringArrayList.add("s1");
        StringArrayList.add("D");
        StringArrayList.add("f");
        StringArrayList.add("s1");
        Iterator<String>string_itr= StringArrayList.iterator();
        while (string_itr.hasNext()) {
        	System.out.println(string_itr.next()+" ");
        
        }
        System.out.println();
        ListIterator<String>string_List_itr=StringArrayList.listIterator();
        while(string_List_itr.hasNext()) {
        	String element=string_List_itr.next();
        	string_List_itr.set(element+"---");
        }
        string_itr= StringArrayList.iterator();
        while(string_itr.hasNext()) {
        	Object element=string_itr.next();
        	System.out.println(element+"  ");
        	
        }
        System.out.println();
        while(string_itr.hasNext());
        System.out.println();
	}

}
