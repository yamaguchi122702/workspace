package code06_07;

//package calcapp.main;

public class Calc {
  public static void main(String[] args) {
    int a = 10; int b = 2;
    int total = code06_06.CalcLogic.tasu(a, b);
    int delta = code06_06.CalcLogic.hiku(a, b);
    System.out.println("足すと" + total + "、引くと" + delta);
  }
}
