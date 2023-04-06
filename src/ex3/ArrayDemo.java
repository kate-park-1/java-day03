package ex3;

public class ArrayDemo {
  public static void main(String[] args) {
    int[] scores = new int[5];  // array - 5개 엘리먼트를 가지게 될 공간을 확보
    for(int i=0; i< scores.length; i++){
      System.out.println(scores[i]);
    }


//    scores[0] = 100;
//    scores[1] = 90;
//    scores[2] = 80;
//    scores[3] = 70;
//    scores[4] = 95;

    int[] scoreArray = {100, 90, 80, 70, 95, 80, 70, 60, 79, 80, 100, 80, 50, 50}; // int array를 생성과 동시에 5개 값을 초기화


    int total = 0;
    for (int i = 0; i < scores.length; i++) {
      total += scores[i];
    }


    double avg = (double)total / scores.length;

    System.out.println("total = " + total);
    System.out.println("avg = " + avg);

    total = 0;
    for (int i = 0; i < scores.length; i++) {
      total += scoreArray[i];
    }

    avg = (double)total / scoreArray.length;

    System.out.println("total = " + total);
    System.out.println("avg = " + avg);
    System.out.println(scoreArray[-1]);
  }
}
