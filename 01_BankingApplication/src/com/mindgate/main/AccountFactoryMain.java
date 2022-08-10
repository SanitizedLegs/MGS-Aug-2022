package com.mindgate.main;

import java.util.Scanner;

import com.mindgate.factory.AccountFactory;
import com.mindgate.pojo.Account;
import com.mindgate.pojo.Current;
import com.mindgate.pojo.Savings;

public class AccountFactoryMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		AccountFactory accountFactory = new AccountFactory();
//		int choice;
		
		System.out.println("Press 1. Savings");
		System.out.println("Press 2. Current");
		
		System.out.println("Enter Your Choice");
		 int choice = scanner.nextInt();
		 Account account = accountFactory.getAccount(choice);
		 
//		 System.out.println("Account Object Created !!");
		
		if (account instanceof Savings)
			System.out.println("Savings Object Created !!");
		
		if (account instanceof Current)
			System.out.println("Current Object Created !!");
	}
}
