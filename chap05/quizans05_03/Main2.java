package quizans05_03;

public class Main2 {
  public static void main(String[] args) {
    String address = "uso800@xxxx.com";
    String text = "今度、飲みにいきませんか";
    email(address, text);
  }
  public static void email(String address, String text) {
	//タイトル無しの場合は無題として扱う
	email("無題", address, text);
  }
  public static void email(String title, String address, String text) {
    System.out.println(address + "に、以下のメールを送信しました");
    System.out.println("件名：" + title);
    System.out.println("本文：" + text);
  }
}
