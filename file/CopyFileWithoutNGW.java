package oopjava.file;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CopyFileWithoutNGW {
	void createFile(File file, List<String> contents) throws IOException{
	}

	void copyFileWithoutNGW(File source, File target, List<String> ngwords) throws IOException {
	}

	public static void main(String[] args) throws Throwable{
		CopyFileWithoutNGW cf = new CopyFileWithoutNGW();
		try(Scanner s = new Scanner(System.in)){
			System.out.println("コピー元のファイル名を入力して下さい。");
			File source = new File(s.nextLine());
			System.out.println("コピー元のファイルの内容を入力して下さい(改行のみで終了。");
			List<String> contents = new ArrayList<>();
			for(String l = s.nextLine(); !(l.isEmpty()); l = s.nextLine()) {
				contents.add(l);
			}
			cf.createFile(source, contents);
			System.out.println("NGWordを入力して下さい(改行のみで終了。");
			List<String> ngws = new ArrayList<>();
			for(String l = s.nextLine(); !(l.isEmpty()); l = s.nextLine()) {
				ngws.add(l);
			}
			System.out.println("コピー先のファイル名を入力して下さい。");
			cf.copyFileWithoutNGW(source, new File(s.nextLine()), ngws);
			System.out.println("コピーしました。");
		}
	}
}
