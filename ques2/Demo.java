package com.ques2;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("How many Student objects need to be created");
		int num = sc.nextInt();
		
		Student[] students = new Student[num];
		
		for(int i=0; i<students.length; i++)
		{
			students[i]=new Student();
			
			System.out.println("Enter details of student : "+(i+1));
			System.out.print("roll: ");
			int roll = sc.nextInt();
			students[i].setRoll(roll);
			
			System.out.print("name: ");
			String name = sc.next();
			students[i].setName(name);
			
			System.out.print("address: ");
			String address = sc.next();
			students[i].setAddress(address);
			
			System.out.print("marks: ");
			int marks = sc.nextInt();
			students[i].setMarks(marks);
			
			System.out.println("-----------------");
		}
		
		int sum = 0;
		for(int j=0; j<students.length; j++)
		{
			System.out.println("Details of student : "+(j+1));
			System.out.println("roll: "+students[j].getRoll());
			System.out.println("name: "+students[j].getName());
			System.out.println("address: "+students[j].getAddress());
			System.out.println("marks: "+students[j].getMarks());
			System.out.println("----------------------");
			sum = sum + students[j].getMarks();
		}
		
		int average = sum/students.length;
		System.out.println("Average of all the Students marks : "+average);
	}

}
