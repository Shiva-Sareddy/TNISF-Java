package com.kalki.OOPs;

import java.util.Scanner;

public class BasicConceptsofOOPs {
	
	// Declaring Variables i.e. Attributes or Properties
	static String course; // Static variable
	int branchID;
	String branchName;
	int noOfStudents;
	int noOfGirls;
	int noOfBoys;
	
	// Methods or Behaviours
	static void course() {
		course = "Bachelor of Technology"; // Static method
	}
	
	void noOfStudents() {
		noOfStudents = noOfGirls + noOfBoys;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BasicConceptsofOOPs.course();
		BasicConceptsofOOPs oop = new BasicConceptsofOOPs(); // Creating Object, object name here is "oop"
		
		System.out.print("Enter No.of Girls: ");
		oop.noOfGirls = sc.nextInt();
		
		System.out.print("Enter No.of Boys: ");
		oop.noOfBoys = sc.nextInt();
		
		System.out.print("Enter Branch ID(1/2/3/4): ");
		oop.branchID = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter Branch name: ");
		oop.branchName = sc.nextLine();
		
		oop.noOfStudents();
		System.out.println("--- B.E.S.T Innovation University ---");
		System.out.println("Course: " + BasicConceptsofOOPs.course);
		System.out.println("Student Details for Branch \"" + oop.branchName + "\" with Branch number: " + oop.branchID);
		System.out.println("Total Students: " + oop.noOfStudents);
		System.out.println("Girls: " + oop.noOfGirls);
		System.out.println("Boys: " + oop.noOfBoys);
		
		sc.close();

	}

}
