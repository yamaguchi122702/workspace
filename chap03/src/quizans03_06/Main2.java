package quizans03_06;

public class Main2 {
  public static void main(String[] args) {
    System.out.print("【数あてゲーム】");
    int ans = new java.util.Random().nextInt(10);
    //while文にした場合
    int i = 0;
    while(true) {
      i++;
      System.out.println("0〜9の数字を入力してください");
      int num = new java.util.Scanner(System.in).nextInt();
      if (ans == num) {
        System.out.println("アタリ！");
        break;
      }else if (i == 5) {
          break;
      } else {
        System.out.println("違います");
      }
    }
    System.out.println("ゲームを終了します");

    //while文にした場合
    i = 0;
    while(true) {
        i++;
        System.out.println("0〜9の数字を入力してください");
        int num = new java.util.Scanner(System.in).nextInt();
        //三項条件演算子を使用したケース
        System.out.println(ans == num ? "アタリ！":"違います" );
        if (ans == num || i == 5) {
            break;
        }
    }
    System.out.println("ゲームを終了します");

  }
}
