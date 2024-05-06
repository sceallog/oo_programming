package oopjava.feh15a;

/* 基本情報技術者試験 H15春 問題8より */

public class Rectangle /*extends [  b  ] */{
  double height;
  double width;
  public Rectangle(double height, double width) {
    this.height = height;
    this.width = width;
  }
  public String toString() {
    return "Rectangle : height = " + height +", width = " + width + ": ";
  }
/*  public double getArea() {
   return [  c  ];
  }
*/
}
