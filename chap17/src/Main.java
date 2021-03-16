public class Main {
  public static void main(String[] args) {
	  //文法エラー（syntax error）
//	  System.out.println("START")
	  //実行時エラー（runtime error）
	  int[] num = new int[] {0,1,2};
	  System.out.println("プログラムを開始します。処理を３つ実行します。");
//	  System.out.println("処理"+num[1]+"を完了");
//	  System.out.println("処理"+num[2]+"を完了");
//	  System.out.println("処理"+num[3]+"を完了");
	  //論理エラー（logic error）
	  int x = 3,y = 5;
	  System.out.println("プログラムを開始します");
	  System.out.println(x + "＋" + y + "を計算します");
	  System.out.println("計算終了：　答えは" + x + y);
	  System.out.println("プログラムを正常終了します");
  }
}
