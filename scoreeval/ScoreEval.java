package oopjava.scoreeval;

import java.util.Scanner;

public class ScoreEval {
	public static void main(String[] args) {
		System.out.println("10人分の点数:");
		try(Scanner sc = new Scanner(System.in)){
			int min = Integer.MAX_VALUE, max = 0;
			double ave = 0;

			// ここに点数入力，最高，最低，平均計算処理を実装
			for (int i = 0; i < 10; i++) {
				var score = sc.nextInt();
				if (score < min) {
					min = score;
				} else if (score > max) {
					max = score;
				}
				ave += score;
			}
			ave /= 10;
			System.out.println("最高点: " + max);
			System.out.println("最低点: " + min);
			System.out.println("平均点: " + ave);
		}
	}
}
