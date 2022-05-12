package com.chainsys.ArrayTest;

import java.util.Arrays;

public class ArrayTest_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int []arr= {2,3,4,5,7};
     System.out.println("array as:"+Arrays.asList(arr));
	
	
  int []array= {22,44,55,66,77,88};
  Arrays.sort(array);
  int intkey=77;
  System.out.println(intkey+"arrays index value:"+Arrays.binarySearch(array, intkey));

  
  
  
  
  int []aa=new int[5];
    aa[0]=10;
    aa[1]=20;
    aa[2]=30;
    aa[3]=40;
    aa[4]=50;
    for(int i=0;i<aa.length;i++) {
    	System.out.println("Elements of the index:"+i+" "+aa[i]);
    }
}
}