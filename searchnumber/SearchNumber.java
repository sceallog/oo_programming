package oopjava.searchnumber;

import java.util.Scanner;

public class SearchNumber {
	public static void main(String[] args) {
		try(Scanner s = new Scanner(System.in)){
			System.out.println("数字を10個入力して下さい。");
			int[] nums = new int[10];
			for(int i = 0; i < 10; i++) {
				nums[i] = s.nextInt();
			}
			System.out.println("検索する数値を入力して下さい。");

			// ここに数値入力と検索処理を実装。見つかればreturnする。
			int searchValue = s.nextInt();

			for (int j = 0; j < nums.length; j++) {
				if (nums[j] == searchValue) {
					System.out.printf("先頭から%d番目の数です", j + 1);
					break;
				} else if (j == nums.length - 1) {
					System.out.println("ありません");
				}
			}
		}
	}
}
