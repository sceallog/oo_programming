package oopjava.geo;

import java.util.Scanner;

public class Line {
	public static void main(String[] args) throws Throwable{
		try(Scanner s = new Scanner(System.in)){
			System.out.println("線分の座標をx1 y1 x2 y2の順に入力して下さい。");
			Point p1 = new Point(s.nextDouble(), s.nextDouble());
			Point p2 = new Point(s.nextDouble(), s.nextDouble());
			System.out.println("点の座標をx yの順に入力して下さい。");
			Point p3 = new Point(s.nextDouble(), s.nextDouble());
			Line l = new Line(p1, p2);
			System.out.printf("線分: %s%n", l);
			System.out.printf("線分の⻑さ: %.2f%n", l.getLength());
			l.move(1, 1);
			System.out.printf("移動後の線分: %s%n", l);
			System.out.printf("点%sは線分%s上にある?: %s%n", p3, l, l.isOn(p3));
		}
	}

	private Point p1;
	private Point p2;

	public Line(Point p1, Point p2) {
		this.p1 = p1;
		this.p2 = p2;
	}

	public Point getP1() {
		return p1;
	}

	public void setP1(Point p1) {
		this.p1 = p1;
	}

	public Point getP2() {
		return p2;
	}

	public void setP2(Point p2) {
		this.p2 = p2;
	}

	public double getLength() {
		return p1.getDistance(p2);
	}

	public void move(int dx, int dy) {
		p1.setX(p1.getX() + dx);
		p1.setY(p1.getY() + dy);
		p2.setX(p2.getX() + dx);
		p2.setY(p2.getY() + dy);
	}

	public boolean isOn(Point p) {
		double a = p1.getDistance(p2);
		double b = p.getDistance(p1) + p.getDistance(p2);
		double epsilon = 0.0001;
		return (Math.abs(a - b) < epsilon);
	}

	public String toString() {
		return String.format("%s->%s", p1.toString(), p2.toString());
	}
}
