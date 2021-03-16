package code15_02;

public class Main2 {
  public static void main(String[] args) {
    String s1 = "Java and JavaScript";
    if (s1.contains("Java")) {
      System.out.println("文字列s1は、Javaを含んでいます");
    }
    if (s1.endsWith("Java")) {
      System.out.println("文字列s1は、Javaが末尾にあります");
    }
    System.out.println("文字列s1で最初にJavaが登場する位置は" + s1.indexOf("Java"));
    System.out.println("文字列s1で最後にJavaが登場する位置は" + s1.lastIndexOf("Java"));

    //indexOf lastindexOfの引数intに対しての確認用

    //文字列ではなく文字で指定
    System.out.println("文字列s1で最初にJが登場する位置は" + s1.indexOf('J'));
    System.out.println("文字列s1で最後にaが登場する位置は" + s1.lastIndexOf('a'));
    //文字列ではなく文字で指定
    //Unicode(Asciiコード)でJは74なのでそれを指定
    System.out.println("文字列s1で最初にJが登場する位置は" + s1.indexOf(74));
    //Unicode(Asciiコード)でaは97なのでそれを指定
    System.out.println("文字列s1で最後にaが登場する位置は" + s1.lastIndexOf(97));
  }
}
