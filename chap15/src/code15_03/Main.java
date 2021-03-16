package code15_03;

public class Main {
  public static void main(String[] args) {
    String s1 = "Java programing";
    System.out.println("文字列s1の4文字目以降は" + s1.substring(3));        // ⇒ a programing
    //終端指定以降は切り出さない
    System.out.println("文字列s1の4～8文字目以降は" + s1.substring(3, 8));  // ⇒ a pro
  }
}
