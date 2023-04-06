package ex3;

public class Person {
  String name;
  int age;

  public void sayHello() {
    System.out.println("Hello, " + age + "," + name + "!");
  }

  public Person setName(String name) {
    this.name = name;
    return this;
  }

  public Person setAge(int age) {
    this.age = age;
    return this;
  }
}
