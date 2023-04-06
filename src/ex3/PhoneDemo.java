package ex3;

public class PhoneDemo {
  public static void main(String[] args) {
    Phone myPhone, yourPhone;
    myPhone = new Phone();
    yourPhone = new Phone();
    myPhone.model = "갤럭시 S22";
    myPhone.value = 200;
    myPhone.print();

    yourPhone.model = "갤럭시 S20";
    yourPhone.value = 120;
    yourPhone.print();

    System.out.println("myPhone = " + myPhone);
    System.out.println("yourPhone = " + yourPhone);

    myPhone = yourPhone;

    System.out.println("myPhone = " + myPhone);
    System.out.println("yourPhone = " + yourPhone);
  }
}


class Phone{
  String model;  // 전화기 model 정보
  int value; // 전화기 가격
  void print(){// 정보출력 메서드
    System.out.println(value + "만원 짜리 " + model+ "스마트폰");
  }
}