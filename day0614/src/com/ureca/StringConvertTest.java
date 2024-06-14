package com.ureca;

public class StringConvertTest {//문자열 변환 테스트

   static void convert1() {
	  String s1="우리나라";
	  String s2="대한민국만세!!";	  
	  s1=s1+s2;
	  System.out.println(s1.substring(4).equals(s2));
	  /*
	     String클래스: 고정문자열!!
	     1. String클래스 객체 생성
	     2. 문자열변환을 위해서 임시로 StringBuffer클래스 객체 생성
	     3. append()메소드 호출
	     4. StringBuffer객체를 String객체로 변환
	     5. 임시생성된 StringBuffer객체를 소멸.	 	          
	   */
	  
	  
	  System.out.println(s1);
   }//convert1
   
   static void convert2() {
	  StringBuilder s1 = new StringBuilder("우리나라"); 
	  s1.append("대한민국만세!!");
	  /*
	     StringBuilder클래스: 가변문자열!!
	     1. StringBuilder클래스 객체 생성
	     2. append()메소드 실행.
	   */
	  System.out.println(s1);
   }
   
   public static void main(String[] args) {
	  convert1();
	  System.out.println("----------------");
	  convert2();
   }//main
	
 
}



