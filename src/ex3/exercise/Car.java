package ex3.exercise;

public class Car {
  static int numOfCar = 0;
  static int numOfRedCar = 0;
  String color;
  public Car(String color) {
    this.color = color;
    numOfCar++;
    if (this.color.equalsIgnoreCase("red")) {
      numOfRedCar++;
    }
  }

  public static int getNumOfCar() {
    return numOfCar;
  }

  public static int getNumOfRedCar() {
    return numOfRedCar;
  }
}
