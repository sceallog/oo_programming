package oopjava.feh13a;

/* 基本情報技術者試験 H13秋 問題８より */

public class TestPants {  // テスト用クラス
	public static void main(String[] args){
		Pants[] pants = {
				new Slacks("S1", 31, "Black"),
				new Slacks("S2", 31, "Black"),
				new Jeans("J1", 32, "Black", false),
				new Jeans("J2", 34, "Blue", true),
		};
		String black = new String("Black");
		for (int i=0; i < pants.length; i++){
			System.out.println(pants[i]);
		}
		System.out.println(pants[0].sizeIs(31));
		System.out.println(pants[1].colorIs(black));
		System.out.println(pants[2].sizeIs(30));
		System.out.println(pants[3].sizeIs(31));
	}
}

class Pants{
    String code;
    int size;
    String color;

    Pants(String code, int size, String color){
        this.code = code;
        this.size = size;
        this.color = color;
    }
    public boolean sizeIs(int size){
        // 設問aの回答を記述してfalseを削除してください。
        return /*[  a  ]*/ false;
    }

    public boolean colorIs(String color){
        // 設問bの回答を記述してfalseを削除してください。
        return /*[  b  ]*/ false;
    }

    public String toString(){
        return code + ", " + size + ", " + color;
    }
}

class Slacks extends Pants{
    Slacks(String code, int size, String color){
        super(code, size, color);
    }
}

class Jeans extends Pants{
    boolean buttonFront;
    Jeans(String code, int size, String color, boolean buttonFront){
        // 設問cの回答を記述してsuper(null, 0, null)を削除してください。
        /*[  c  ]*/ super(null, 0, null);
        this.buttonFront = buttonFront;
    }

    public String toString(){
        // 設問dの回答を記述してnullを削除してください。
        return /*[  d  ]*/ null;
    }
}

