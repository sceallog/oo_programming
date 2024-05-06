package oopjava.intm;

//import java.util.Arrays;
//import java.util.Random;
import java.util.Scanner;

public class HitBlow {
	public HitBlow(String answer){
	}

	public int[] evaluate(String guess){
		return null;
	}

	public static void main(String args[]) throws Throwable{
		try(Scanner s = new Scanner(System.in)){
			System.out.println("当てる数字を入力して下さい(改行のみでランダム)");
			HitBlow hb = new HitBlow(s.nextLine());
			while(true){
				System.out.printf("4桁の数字を入力して下さい%n");
				int[] result = hb.evaluate(s.nextLine());
				if(result == null) continue;
				if(result[0] == 4) {
					System.out.println("正解！");
					break;
				}
				System.out.printf("%dヒット %dブロウ%n", result[0], result[1]);
			}
		}
	}
}
