package oopjava.geo;

import java.util.Scanner;

public class Point {
	public static void main(String[] args) throws Throwable{
		try(Scanner s = new Scanner(System.in)){
			System.out.println("点aの座標を入力して下さい。");
			Point p1 = new Point(s.nextDouble(), s.nextDouble());
			System.out.println("点bの座標を入力して下さい。");
			Point p2 = new Point(s.nextDouble(), s.nextDouble());
			System.out.printf("点aの位置: %s%n", p1);
			System.out.printf("点aの原点からの距離: %.2f%n", p1.getDistance());
			p1.move(1, 1);
			System.out.printf("点aの移動後の位置: %s%n", p1);
			System.out.printf("点bの位置: %s%n", p2);
			System.out.printf("点aとbの距離: %.2f%n", p1.getDistance(p2));
			System.out.printf("点aとbは同じ？: %s%n", p1.isSamePosition(p2));
		}
	}

	private double x;
	private double y;

	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public void setX(double x) {
		this.x = x;
	}

	public void setY(double y) {
		this.y = y;
	}

	public boolean isSamePosition(Point p2) {
		double epsilon = 0.0001;
        return (Math.abs(x - p2.getX()) < epsilon) && (Math.abs(y - p2.getY()) < epsilon);
	}
	public double getDistance() {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
	}

	public double getDistance(Point p2) {
        return Math.sqrt(Math.pow(x - p2.getX(), 2) + Math.pow(y - p2.getY(), 2));
	}

	public void move(double dx, double dy) {
		x += dx;
		y += dy;
	}
	
	public String toString() {
		return String.format("[%.1f,%.1f]", x, y);
	}
}
