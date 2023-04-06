package ex3;

public class VarDemo {
  public static void main(String[] args) {
    System.out.println("class변수 :" + VarTest.staticVar);
    System.out.println(VarTest.getStaticVar());
    VarTest.staticVar = 10;
    VarTest v = new VarTest();
    System.out.println("인스턴스변수 :" + v.instanceVar);
    v.instanceVar = 10;
    v.methodTest();
  }
}

class VarTest {
  static int staticVar = 5 ; // 클래스 변수 - 객체 생성 없이도 접근 , 사용 가능
  int instanceVar; // 인스턴스 변수 - 객체 생성 시 메모리 할당되어 그 이후 사용가능

  void methodTest(){
    int localVar = 20;
    System.out.println("localVar = " + localVar);
  }

  static int getStaticVar(){
    return staticVar;
  }
}
