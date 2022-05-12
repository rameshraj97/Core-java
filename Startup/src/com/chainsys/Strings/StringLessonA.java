package com.chainsys.Strings;

public class StringLessonA {
    public static void lessonOne() {
    String firstString= "Chainsys";
    System.out.println(firstString);
    char dataOne[]= {'C','h','a','i','n'};
    String secondString=new String(dataOne);
    System.out.println(secondString);
    String thirdString = new String(new char[]{ 'C','h','a','i','n'});
    System.out.println(thirdString);
    }
 
    public static void lessonTwo() {
    String firstString="Hello";
    String secondString="Hello";
    String thirdString="Hello";
    int firstNumber=100;
    int secondNumber=100;
    int thirdNumber=100;
    System.out.println(firstString);
    System.out.println(secondString);
    firstString="welcome";
    System.out.println(firstString);
    System.out.println(secondString);
    }
    public static void creatingStringinaForLoop() {
    for(int count=0;count<10;count++) {
    String s1="Hello";
    }
    }
    public static void stringToCharArray() {
    java.util.Scanner Scanner =new java.util.Scanner(System.in);
    System.out.println("Enter a WORD");
    String firstString =Scanner.nextLine();
    Scanner.close();
    int stringlength=firstString.length();
    System.out.println("Length "+stringlength);
    char[] data=firstString.toCharArray();
    int dataarraylength=data.length;
    System.out.println("Length "+dataarraylength);
    }
  

public static void testStringTrim() {
    String secondString="Hope   it   rain";
    
    System.out.println("BeforeString:"+secondString.length());
    secondString=secondString.trim();
    System.out.println("After Trim:"+secondString.length());
}
public static void testSplit() {
String firstString="Tom and Jerry are good friends";
String trimmedString=firstString.trim();
String[] data=trimmedString.split(" ");
int count = data.length;
System.out.println("Word Count"+ count);
for(int index=0;index<count;index++) {
System.out.println(data[index]);                                               
}
}
public static void testSplitDays() {
    String weekdays = "Mon;Tue;Wed;Thu;fri;Sat;Sun";
    String[] data= weekdays.split(";");
    int count=data.length;
    System.out.println("Days Count"+count);
    for(int index=0;index<count;index++) {
    System.out.println(data[index]); }       
    }
    public static void stringToUpperLower() {
        java.util.Scanner scanner=new java.util.Scanner(System.in);
        System.out.println("enter a word");
        String firstString=scanner.nextLine();
        scanner.close();
        System.out.println(firstString);
        String stringInUppercase=firstString.toUpperCase();
        System.out.println("touppercase"+stringInUppercase);
        //string in firstStrin is not modified,because STRINGS ARE immutable
        System.out.println("s1"+firstString);
        String stringInLowercase=firstString.toLowerCase();
        System.out.println("lowerCase"+stringInLowercase);
        System.out.println("s1="+firstString);
        String subString=firstString.substring(3);
        System.out.println(subString);
        //from 3rd char to 6th char
        //from index 2 to index 5
        subString=firstString.substring(2, 6);
        System.out.println(subString);
        //replace
        String replaceedString=firstString.replace('a', 'e');
        System.out.println(replaceedString);
        //equals
        boolean flag1=firstString.equals(stringInUppercase);//false
        System.out.println(flag1);
        //equalsIgnoreCase
        boolean flag=firstString.equalsIgnoreCase(stringInUppercase);//true
        System.out.println(flag);
}
}

