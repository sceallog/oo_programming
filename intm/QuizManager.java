package oopjava.intm;

//import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;
//import java.nio.charset.StandardCharsets;
//import java.nio.file.Files;
//import java.nio.file.Paths;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
import java.util.Scanner;

class Quiz{
	public Quiz(String question, int correct, String[] options) {
	}
	public void serve(PrintStream ps) {
	}
	public boolean evaluate(int answer) {
		return false;
	}
}

public class QuizManager {
	public QuizManager(String file) throws IOException{
	}
	public boolean hasNext() {
		return false;
	}
	public Quiz next() {
		return null;
	}

	public static void main(String[] args) throws Throwable{
		try(Scanner s = new Scanner(System.in)){
			System.out.println("クイズ定義ファイル名を入力して下さい。");
			String file = s.nextLine();
			QuizManager qm = new QuizManager(file);
			int total = 0, correct = 0;
			while(qm.hasNext()) {
				Quiz q = qm.next();
				q.serve(System.out);
				if(q.evaluate(Integer.parseInt(s.nextLine()))) correct++;
				total++;
			}
			System.out.printf("%d問中%d正解。%n", total, correct);
		}
	}
}
