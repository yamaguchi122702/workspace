package code16_01;

import java.util.ArrayList;
//自動変換無し
public class Main2 {
  public static void main(String[] args) {
    ArrayList<Integer> points = new ArrayList<Integer>();
    points.add(Integer.valueOf(10));
    points.add(Integer.valueOf(80));
    points.add(Integer.valueOf(75));
    for (Integer i : points) {
      System.out.println(i);
    }
    //拡張for文で値を代入できるか？
    for (Integer i : points) {
        i = Integer.valueOf(20);
    }
    for (Integer i : points) {
        System.out.println(i.intValue());
    }

    //拡張for文で値を代入できるか？
/*    int[][] test = new int[3][1];
    for (int[] i : test) {
        i[0] = 20;
    }
    for (int[] i : test) {
        System.out.println(i[0]);
    }
    //拡張for文で値を代入できるか？
    String[][] test2 = new String[3][1];
    for (String[] i : test2) {
        i[0] = "テスト";
    }
    for (String[] i : test2) {
        System.out.println(i[0]);
    }*/
  }
}
