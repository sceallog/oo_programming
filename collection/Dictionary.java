package oopjava.collection;

import java.util.HashMap;
import java.util.Scanner;

public class Dictionary {
	public static void main(String[] args) throws Throwable{
		try(Scanner s = new Scanner(System.in)){
			System.out.println("見出し,説明 の形で入力して下さい(改行のみで追加終了)。");
			 var map = new HashMap<String, String>();
			for(String l = s.nextLine(); !(l.isEmpty()); l = s.nextLine()){
				 String[] v = l.split(",");
				 map.put(v[0], v[1]);
			}
			System.out.println("見出し を入力して下さい(改行のみで追加終了)。");
			for(String l = s.nextLine(); !(l.isEmpty()); l = s.nextLine()) {
				 System.out.println(map.getOrDefault(l, "-みつかりませんでした-"));
			}
		}
	}
}
