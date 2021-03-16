package code04_14;

public class Main2 {
  public static void main(String[] args) {
    int[] scores = {20, 30, 40, 50, 80};

    // 従来のfor文
    for (int i = 0; i < scores.length; i++) {
        System.out.println(scores[i]);
    }
    // 拡張for文
    for (int value : scores) {
      System.out.println(value);
    }
  }
}
