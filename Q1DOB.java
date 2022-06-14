package com.eval4;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;



public class Q1DOB {
	public static void main(String[] args) {
		Scanner sc = new  Scanner(System.in);
		System.out.println("Enter the date in dd/MM/yyyy format");
		String dob= sc.next();
		try {
		LocalDate ld = LocalDate.parse(dob, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

		LocalDate curDate = LocalDate.now();

		Period period = Period.between(ld, curDate);

		if (ld.isAfter(curDate)) {
			System.out.println("Date of Birth should not be in Future");
		} 
		else if(period.getYears()>=18 && period.getMonths()==0 && period.getDays()==0)
		{
			System.out.println("Happy Birthday, You are eligible to cast your vote.");
		}
		else if(period.getYears()>=18){
		  System.out.println("You are eligible to cast your vote");
		}
		}
		catch(Exception e)
		{
			System.out.println("please pass the date in the proper format");
		}
	}
}
