package ru.stqa.pft.sandbox;

public class MyFirstProgram {
  public static void main(String[] args) {
    hello("Masha");
    hello("Max");


    Square s = new Square(5);
        System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());

    Rectangle r = new Rectangle(4,6);
       System.out.println("Площадь прямоуольника со сторонами " + r.a + " и " + r.b + " = " + r.area());

      // Point p1=new Point(); до конструктора в классе Point
    // p1.x=2;
     //  p1.y=3;
      // Point p2=new Point();
      //p2.x=4;
     // p2.y=2;
    Point p1=new Point(2,3);
    Point p2=new Point(4,2);
    System.out.println("расстояние между двумя точками координат " + "p1("+ p1.x + "," +p1.y+")"+ " и "+"p2("+p2.x+","+p2.y+")"+" равно "+p1.distance(p2));

}

  public static void hello(String somebody) {
    System.out.println("Hello, " + somebody + "!");
  }

  //public static double distance(Point p1, Point p2) {
   // return Math.sqrt((p2.x-p1.x)*(p2.x-p1.x)+(p2.y-p1.y)*(p2.y-p1.y));
 // }
}
