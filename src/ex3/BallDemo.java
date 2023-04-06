package ex3;

public class BallDemo {
  public static void main(String[] args) {
    Ball b = new Ball();
    System.out.println("b = " + b.getRadius());
    System.out.println(b.getVolumn());

    b.setRadius(4.0);
    b.setRadius(-1.0);
    System.out.println(b.getVolumn());

    Circle circle = new Circle(10.0);
    System.out.println(circle.getRadius());
    circle.setRadius(-1.0);
    circle.setRadius(4.0);
    System.out.println(circle.getRadius());

    Circle circle1 = new Circle();
    System.out.println(circle1.getRadius());
  }
}

class Circle{
  double radius = 1.0;

  public Circle(){  // 생성자를 만들지 않으면 컴파일러가 자동으로 생성해주지만, 기존 생성자가 있으면 자동생성안됨.
    radius = 2.0;
  }

  public Circle(double radius){  // 생성자 오버로딩
    this.radius = radius;
  }

  public double getRadius() {
    return radius;
  }

  public void setRadius(double radius) {
    if(radius>0) this.radius = radius;
    else System.out.println("반지름은 0보다 커야 합니다.");
  }
}
