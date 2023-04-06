package ex3;

public class Ball {
  private double radius = 2.0;  // 필드

  double getRadius(){
    return radius;
  }

  void setRadius(double radius){ // 설정자(셋터) : 데이터 검증
    if(radius > 0){
      this.radius = radius;
    }else {
      System.out.println("원의 반지름은 0보다 커야 합니다.");
    }
  }
  double getVolumn(){   // 메서드
    return 4/3 * 3.14 * radius * radius * radius;
  }
}

class Cylinder{
  double width = 2.0;
}
