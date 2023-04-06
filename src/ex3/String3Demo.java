package ex3;

public class String3Demo {
  public static void main(String[] args) {
    String s1 = "Hi";
    String s2 = new String("Java");

    System.out.println(s1.length());
    System.out.println(s2.charAt(0));

    System.out.println(s2.toLowerCase());
    System.out.println(s2.toUpperCase());
    System.out.println(s2);

    System.out.println(s2.substring(1,3));

    String s3 = " ";
    String s4 = ""; // null
    s4.length();
    String s5;
    //s5.length(); // nullpointerException
    System.out.println(s3.isEmpty());
    System.out.println(s4.isEmpty());
    System.out.println(s3.isBlank());
  }
}
