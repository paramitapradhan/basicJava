package calculator;

import java.util.Scanner;

public class EMI {

	public static void main(String[] args) {

		System.out.println("EMI CALCULATOR");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Principle amount :");
		float principle = sc.nextFloat();
		System.out.print("Enter ROI:");
		double ROI = sc.nextDouble();
		System.out.print("Enter Duration :");
		int Duration = sc.nextInt();
		double SI = (principle * ROI * Duration) / 100;
		double GROSS = principle + SI;
		int months = Duration * 12;
		double EMI = GROSS / months;
		System.out.print(" EMI :" + EMI);
		sc.close();
	}
}

//principle = 1000
//Rate of interest  = 10%
//duration = 2 years
//
//simple interest =  p x n x r / 100;
//
//Gross = p + interest
//
//months = duration x 12
//
//Emi = Gross / months