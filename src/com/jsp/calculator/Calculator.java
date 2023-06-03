package com.jsp.calculator;

public class Calculator {
 
 public void add(int a, int b)
 {
	 System.out.println(a+b);
 }
 public void sub(int a,int b)
 {
	 System.out.println(a-b);
 }
 public void multi(int a, int b)
 {
	 System.out.println((a*b));
 }
 public void div(int a, int b)
 {
	 System.out.println(a/b);
 }
 public static void main(String[] args) {
	Calculator c=new Calculator();
	c.add(2, 6);
	c.sub(10, 6);
	c.multi(2, 2);
	c.div(10, 5);
			
	
	
}
}
