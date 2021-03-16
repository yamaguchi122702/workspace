

public class Main {
  public static void main(String[] args) {
    Empty e = new Empty();
    String s = e.toString();
    System.out.println(s);
    System.out.println(e.getClass());
    System.out.println(e.hashCode());
    System.out.println("テスト".toString());
    System.out.println("テスト".getClass());
    "テスト".clone().equals("テスト");
    Slime sl = new Slime();
    System.out.println(sl.getClass());
    System.out.println(sl.toString());
  }
}
