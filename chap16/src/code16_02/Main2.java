package code16_02;

import java.util.*;

public class Main2 {
  public static void main(String[] args) {
	//ArrayListをLinkedListに差し替えてみた
    LinkedList<String> names = new LinkedList<String>();
    names.add("湊");
    names.add("朝香");
    names.add("菅原");
    Iterator<String> it = names.iterator();
    while (it.hasNext()) {
      String e = it.next();
      System.out.println(e);
    }
  }
}
