package code15_15;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Main {
  public static void main(String[] args) {
    // LocalDateTimeの生成方法
    LocalDateTime l1 = LocalDateTime.now();
    LocalDateTime l2 = LocalDateTime.of(2020, 1, 1, 9, 5, 0, 0);

    // LocalDateTimeとZoneDateTimeの相互変換
    ZonedDateTime z1 = l2.atZone(ZoneId.of("Europe/London"));
    LocalDateTime l3 = z1.toLocalDateTime();
    System.out.println(l1);
    // InstantとZoneDateTimeの相互変換
    Instant i1 = z1.toInstant();
    ZonedDateTime z2 = i1.atZone(ZoneId.of("Asia/Tokyo"));
    ZonedDateTime z3 = l2.atZone(ZoneId.of("Asia/Tokyo"));
    System.out.println(z1);
    System.out.println(z2);
    System.out.println(z3);
    System.out.println(l3);
  }
}
