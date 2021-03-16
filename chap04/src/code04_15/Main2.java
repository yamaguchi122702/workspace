package code04_15;

public class Main2 {
  public static void main(String[] args) {
    int[] arrayA = {1, 2, 3};
    int[] arrayB;
    arrayB = arrayA;
    arrayB[0] = 100;
    System.out.println(arrayA[0]);
    // 配列変数arrayAの参照値
    System.out.println(arrayA);
    // 配列変数arrayBの参照値
    System.out.println(arrayB);
  }
}
