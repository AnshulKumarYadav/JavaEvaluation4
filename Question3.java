package com.eval4;

import java.util.Scanner;

public class Question3 {
//	Q3)
//	1. What is the difference between Checked and Unchecked Exceptions in Java, create a user-defined
//	checked and unchecked exception class?
//	2. What is the difference between the throw and throws keyword in Java?
	
	/* Checked  and Unchecked Exception:  Checked exception are those exception which classes directly inherit throwable class except 
	 * runtime exception  and error while unchecked classes inherites runtime exception.
	 * 
	 * throw and throws : throw is used for throw an exception and throws is used for declare a exception. It also specify that any exception may be occured 
	 * in the method. 
	 * 
	 * 
	 * */
	
	public void checkNum(int num) throws Exception
	{
		if(num>18)
		{
			System.out.println("Valid");
		}
		else {
			throw new checkedException("Not valid number");
		}
	}
	public void uncheckedException(int num) throws uncheckdException{
		int divisorr = 0;
		if(num > 10)
		{
			divisorr= 2;
			int sum = num/divisorr;
			System.out.println("Sum is: "+sum);
		}
		else {
			throw new uncheckdException("Enter number greater than 10");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num:");
		int num = sc.nextInt();
		Question3 q = new Question3();
		try {
			q.uncheckedException(num);
		}
		catch(uncheckdException u)
		{
			System.out.println(u.getMessage());
		}
		try {
			q.checkNum(num);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	
}
