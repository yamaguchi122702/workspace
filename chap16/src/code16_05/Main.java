package code16_05;

import java.util.Set;
import java.util.TreeSet;

public class Main {
  public static void main(String[] args) {
    Set<String> words = new TreeSet<String>();
    words.add("dog");
    words.add("cat");
    words.add("wolf");
    words.add("panda");
    for (String s : words) {
      System.out.print(s + "→");
    }
    System.out.println("");
    Set<String> words2 = new TreeSet<String>();
    words2.add("にし");
    words2.add("ひがし");
    words2.add("きた");
    words2.add("みなみ");
    for (String s : words2) {
      System.out.print(s + "→");
    }
    System.out.println("");
    Set<String> words3 = new TreeSet<String>();
    words3.add("西");
    words3.add("東");
    words3.add("北");
    words3.add("南");
    for (String s : words3) {
      System.out.print(s + "→");
    }
  }
}
