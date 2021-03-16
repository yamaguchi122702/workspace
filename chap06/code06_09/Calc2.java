package code06_09;
//import code06_06.*;
import code06_06.CalcLogic2;

//package calcapp.main;
//import calcapp.logics.*;

public class Calc2 {
  public static void main(String[] args) {
    int a = 10; int b = 2;
    int total = CalcLogic2.tasu(a, b);
    int delta = CalcLogic2.hiku(a, b);
    System.out.println("足すと" + total + "、引くと" + delta);
  }
}
