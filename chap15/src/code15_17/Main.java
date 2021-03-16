package code15_17;

import java.time.LocalDate;
import java.time.Period;

public class Main {
  public static void main(String[] args) {
    LocalDate d1 = LocalDate.of(2020,1,1);
    LocalDate d2 = LocalDate.of(2020,1,4);

    // 3日間を表すPeriodを2通りの方法で生成
    Period p1 = Period.ofDays(3);
    Period p2 = Period.between(d1, d2);
    // 3か月後を表すPeriodを生成
    Period p3 = Period.ofMonths(3);

    // d2のさらに3日後を計算する
    LocalDate d3 = d2.plus(p2);
    // d1の3日前を計算する
    LocalDate d4 = d1.minus(p1);
    // d2のさらに3ヶ月後を計算する
    LocalDate d5 = d2.plus(p3);

    Period p4 = Period.between(d1, d5);

    System.out.println(p1);
    System.out.println(p2);
    System.out.println(p3);
    System.out.println(p4);
    System.out.println(d3);
    System.out.println(d4);
    System.out.println(d5);
  }
}
