package com.ques3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of passengers : ");
		int passengers = sc.nextInt();
		car1.setNumberOfPassenger(passengers);
		
		System.out.println("Enter number of kms : ");
		int kms = sc.nextInt();
		car1.setNumberOfKms(kms);
		
		OLA ola = new OLA();
		Car car=ola.bookCar(passengers, kms);

		int fare=ola.calculateBill(car);

		System.out.println("The total fare amount is "+fare);
	}

}
