package oopjava.coins;

import java.util.Scanner;

public class Coins {
	public static void main(String[] args) {
		try(Scanner in = new Scanner(System.in)){
			System.out.println("金額を入力してください:");
			int amount = in.nextInt();
			coins(amount);
		}
	}

	public static void coins(int amount) {
		int[] coinTypes = {500, 100, 50, 10, 5, 1};
		int[] coinCount = {0, 0, 0, 0, 0, 0};

		for (int i = 0; i < coinTypes.length; i++) {
			coinCount[i] = amount / coinTypes[i];
			amount %= coinTypes[i];
			System.out.println(coinTypes[i] + "円: " + coinCount[i]);
		}
	}
}
