package oopjava.feh15a;

/* 基本情報技術者試験 H15春 問題8より */

public class Triangle /*extends [  a  ]*/{
  double la;
  double lb;
  double lc;
  public Triangle(double la, double lb, double lc) {
    this.la = la;
    this.lb = lb;
    this.lc = lc;
  }
  public String toString() {
   return "Triangle : sides = " + la +", "+ lb +", " + lc + ": ";
  }
  public double getArea() {
    double s = (la + lb + lc) / 2.0;
    return Math.sqrt(s * (s - la) * (s - lb) * (s - lc));
  }
  
//  @Override
  public double getPerimeter() {
    return la + lb + lc;
  }
}
