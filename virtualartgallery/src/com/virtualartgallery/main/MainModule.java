package com.virtualartgallery.main;

import java.util.Scanner;


public class MainModule {

	public static void main(String[] args) {
		
		
		int choice = -1;
		
		Scanner scInput = new Scanner(System.in);
		
		while(choice!=0) {
			
			System.out.println("Choose below options:");
			System.out.println("3. User");
			
			choice = scInput.nextInt();
			
			switch(choice) {
			
			case 3:
				
				int innerChoice = -1;
				while(innerChoice !=0) {
					
					System.out.println("Choose below options:");
					System.out.println("1. New User Registration");
					System.out.println("2. ");
					
					innerChoice = scInput.nextInt();
					              scInput.nextLine();
					
					switch(innerChoice){
						
					case 1:
						System.out.println("Enter Username :");
						String userName = scInput.nextLine();
						System.out.println("Enter your Password:");
						String passWord = scInput.nextLine();
						
					    System.out.println("Enter your Email:");
						String email = scInput.nextLine();
						System.out.println("Enter your FirstName:");
						String firstName = scInput.nextLine();
						System.out.println("Enter yout LastName:");
						String lastName = scInput.nextLine();
						System.out.println("Enter your DateofBirth:YYYY-MM-DD");
						String dateOfBirth = scInput.nextLine();
						
						
						
						break;
						
						
					}
					
				}
			}
		}
		
		scInput.close();
		

	}

}
