package code16_01;

import java.util.ArrayList;
import java.util.List;
//自動変換無し
public class Main3 {
  public static void main(String[] args) {
    ArrayList<String> points = new ArrayList<String>();
    points.add("ミナト");
    points.add("アサカ");
    points.add("スガワラ");
    for (int i = 0; i < points.size();i++) {
        System.out.println(points.get(i));
    }
    for (String i : points) {
      System.out.println(i);
    }
    List<Hero> points2 = new ArrayList<Hero>();
    ArrayList<Character> points3 = new ArrayList<Hero>();
    List<Character> points4 = new ArrayList<Hero>();
    Character ch = new Hero();
  }
}
