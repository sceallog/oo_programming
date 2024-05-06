package oopjava.bmi;

import java.util.Scanner;

public class BMI {
	public static void main(String[] args) {
		try(Scanner s = new Scanner(System.in)){
			System.out.println("身長(cm)を入力して下さい: ");
			double tall = s.nextDouble();
			System.out.println("体重(kg)を入力して下さい: ");
			double weight = s.nextDouble();
			System.out.println("BMI: " + calc(tall, weight));
		}
	}

	public static double calc(double tall, double weight) {
		double bmi = 10000 * weight / (tall * tall);
		return bmi;
	}
}
