package com.mindgate.pojo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculation {
	private int num1;
	private int num2;
	private int result;
	
	public void accept() {
		Scanner scanner = new Scanner(System.in);
		try {
		
		System.out.println("Enter Num 1 : " + num1);
		 num1 = scanner.nextInt();
		
		System.out.println("Enter Num 2 : " + num2);
		 num2  = scanner.nextInt();
		} catch(InputMismatchException e) {
			System.out.println("Invalid Input");
		}
		finally {
			System.out.println("Thanks");
			scanner.close();
		}
	}
	
	public void calculate() {
		System.out.println("Calulating");
		
		 result  = num1 + num2;  
	}
	
	public void display() {
		System.out.println("Result : " + result);
	}
}
