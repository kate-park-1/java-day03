package ex3;

public class BallDemo {
  public static void main(String[] args) {
    Ball b = new Ball();
    System.out.println("b = " + b.getRadius());
    System.out.println(b.getVolumn());

    b.setRadius(4.0);
    System.out.println(b.getVolumn());
  }
}

class Circle{
  double radius = 1.0;
}
