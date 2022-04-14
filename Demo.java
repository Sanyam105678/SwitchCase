package com.masai;

import java.util.Scanner;

public class Demo {
	
	static void city(String c) {
		
		switch (c) {
		case "Mumbai":
			System.out.println("Financial city");
			break;
			
		case "Kolkata":
			System.out.println("City of Joy");
			break;
			
		case "Delhi":
			System.out.println("Capital of Country");
			break;
			
		case "Banglore":
			System.out.println("Cyber City");
			break;
			
		default:
			System.out.println("May be other Indian City");
		}
		
	}
		 
	public static void main(String[] args) {
		
		Demo.city("Banglore");
	}

}
