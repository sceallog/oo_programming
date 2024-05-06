package oopjava.fortune;

public class Fortune {
	public static void main(String[] args) {
		System.out.println(tellFortune());
	}

	public static String tellFortune () {
		int r = (int)(Math.random() * 4);
		String[] fortunes = {"大吉", "吉", "凶", "大凶"};
		String fortune = fortunes[r];
		return fortune;
	}
}
