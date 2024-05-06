package oopjava.collection;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortStrings {
	public static void main(String[] args) throws Throwable{
		System.out.println("文字列を入力して下さい(改行のみで終了)。");
		 var list = new ArrayList<String>();
		try(Scanner s = new Scanner(System.in)){
			for(String l = s.nextLine(); !(l.isEmpty()); l = s.nextLine()) {
				list.add(l);
			}
			 Collections.sort(list);
			 for(String l : list) {
				System.out.println(l);
			 }
		}
	}
}
