package oopjava.intm;

//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
import java.util.Scanner;

public class BingoNum {
	public BingoNum(int n) {
	}
	
	public int next() {
		return 0;
	}

	public static void main(String[] args) throws Throwable{
		try(Scanner s = new Scanner(System.in)) {
			System.out.println("マスの数を入力して下さい");
			int n = Integer.parseInt(s.nextLine());
			BingoNum bn = new BingoNum(n);
			for(int i = 0; i < n; i++) {
				s.nextLine();
				System.out.println(bn.next());
			}
		}
	}
}
