package chainsys;

import java.util.Scanner;

public class Sixth {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner sc=new Scanner(System.in);
 System.out.println("enter the 10 digital number");
 long value=sc.nextLong();
 sc.close();
 long num=value;
 long rem=0;
while(num>0) {
	rem=num%10;
	if(rem%2==0) {
		System.out.println(rem); 
	}
	num=num/10;
}
 
	}
public void Swapnumber(){
	int a=10;
	int b=20;
	System.out.println(a+" "+b+" ");  
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println("a after:"+a+"after:"+b);
}
}
