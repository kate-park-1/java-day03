package ex3;

public class PhoneDemo {
  public static void main(String[] args) {
    Phone myPhone, yourPhone, yourPhone2;
    System.out.println("생성된 전화기 수 : " + Phone.getNumOfPhone()); // ==> 0

    myPhone = new Phone();
    System.out.println("생성된 전화기 수 : " + Phone.getNumOfPhone()); // ==> 1
    System.out.println("생성된 전화기 수 : " + myPhone.getNumOfPhone()); // ==> 1
    yourPhone = new Phone();
    System.out.println("생성된 전화기 수 : " + yourPhone.getNumOfPhone()); // ==> 2
    myPhone.model = "갤럭시 S22";
    myPhone.value = 200;
    myPhone.print();

    yourPhone.model = "갤럭시 S20";
    yourPhone.value = 120;
    yourPhone.print();

    yourPhone2 = new Phone();
    System.out.println("생성된 전화기 수 : " + yourPhone2.getNumOfPhone()); // ==> 3
    System.out.println("생성된 전화기 수 : " + myPhone.getNumOfPhone()); // ==> 3
    System.out.println("myPhone = " + myPhone);
    System.out.println("yourPhone = " + yourPhone);

    myPhone = yourPhone;

    System.out.println("myPhone = " + myPhone);
    System.out.println("yourPhone = " + yourPhone);
  }
}

class Phone{
  private static int numOfPhone = 0; // 클래스 변수 : 객체가 생성될 때마다 1씩 늘어나는 변수

  Phone(){ // 생성자
    numOfPhone++; // 객체가 생성될 때만 1씩 늘어나는 변수
  }
  String model;  // 전화기 model 정보
  int value; // 전화기 가격
  void print(){// 정보출력 메서드
    System.out.println(value + "만원 짜리 " + model+ "스마트폰");
  }

  static int getNumOfPhone(){
    return numOfPhone;
  }
}