package com.ques3;

public class OLA {

	public Car bookCar(int numberOfPassenger, int numberOfKMs) {
		if(numberOfPassenger <= 3)
		{
			HatchBack hatchback = new HatchBack();
			return hatchback;
		}
		else
		{
			Sedan sedan = new Sedan();
			return sedan;
		}
	}
	
	
	public int calculateBill(Car car) {
		int total_fare;
		if(car instanceof HatchBack)
		{
			Car car1 = new HatchBack();
			int num = car1.getNumberOfKms();
			HatchBack hatchback = (HatchBack)car1;
			int fare = hatchback.farePerKm;
			total_fare = num*fare;
//			System.out.print(num+" "+fare);
		}
		else
		{
			Car car1 = new Sedan();
			int num = car1.getNumberOfKms();
			Sedan sedan = (Sedan)car1;
			int fare = sedan.farePerKm;
			total_fare = num*fare;
//			System.out.print(num+" "+fare);
		}
		return total_fare;
	}
	
	
}
