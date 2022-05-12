package chainsys;

import java.util.Scanner;

public class chackuserName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner sc=new Scanner (System.in);//in_
  System.out.println("enter the name");
  String userName=sc.nextLine();
  sc.close();
  System.out.println("Name is:"+userName);
 char[]nameAscharacters =userName.toCharArray();
int langthofcharactersArray  =nameAscharacters.length;
 for(int index=0;index<langthofcharactersArray;index++) {
	 System.out.println(index+" "+nameAscharacters[index]);
 }
	}

}
