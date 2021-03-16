package quizans17_03;

public class Main {
  public static void main(String[] args) {
    try {
      int i = Integer.parseInt("三");
    } catch (NumberFormatException e) {
      System.out.println("NumberFormatException例外をcatchしました");
    }
  }
}
