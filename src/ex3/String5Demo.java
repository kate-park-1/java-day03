package ex3;

public class String5Demo {
  public static void main(String[] args) {
    String version = String.format("%s , %d","JDK", 11); // 객체를 생성하지 않고 사용하는 정적 메서드
    System.out.println("version = " + version);
    String fruits = String.join(": ", "apple", "banana", "cherry","durian");
    System.out.println("fruits = " + fruits);
    String s = String.valueOf(10.0f);
    System.out.println("s = " + s);
  }
}
