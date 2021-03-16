package code06_08;
import code06_06.CalcLogic;

//package calcapp.main;
//import calcapp.logics.CalcLogic;

public class Calc {
  public static void main(String[] args) {
    int a = 10; int b = 2;
    int total = CalcLogic.tasu(a, b);
    int delta = code06_06.CalcLogic.hiku(a, b);
    System.out.println("足すと" + total + "、引くと" + delta);
  }
}
