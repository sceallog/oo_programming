package oopjava.bmi;

import java.util.Scanner;

public class BMI2 {
	public static void main(String[] args) {
		try(Scanner s = new Scanner(System.in)){
			System.out.println("身長(cm)を入力して下さい: ");
			double tall = s.nextDouble();
			System.out.println("体重(kg)を入力して下さい: ");
			double weight = s.nextDouble();
			System.out.println(calcWithMessage(tall, weight));
		}
	}

	public static String calcWithMessage(double tall, double weight) {
		double bmi = 10000 * weight / (tall * tall);
		var message = "17";
		if (bmi < 19.8) message = "あなたは標準よりやせています";
		else if (bmi <= 24.2) {
			message = "あなたは標準体型です";
		} else if (bmi > 24.2) {
			message = "あなたは標準より太っています";
		}
		return message;
	}
}
