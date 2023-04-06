package ex3;

public class Ball {
  private double radius = 2.0;  // 필드

  double getRadius(){
    return radius;
  }

  void setRadius(double r){
    radius = r;
  }
  double getVolumn(){   // 메서드
    return 4/3 * 3.14 * radius * radius * radius;
  }
}

class Cylinder{
  double width = 2.0;
}
