package practice12;

public class Practice12_3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int yesno;
		do {
			System.out.print("[グー:1 チョキ:2 パー:3] >");
			int myHand = new java.util.Scanner(System.in).nextInt(); // 自分の出す手を入力
			int pcHand = getHand(); 						// コンピュータの手を乱数で決定
			System.out.println("あなた：" + janken(myHand)); 	// 自分の出した手を表示
			System.out.println("PC：" + janken(pcHand)); 	// コンピュータの手を表示
			System.out.println("結果：" + winner(myHand, pcHand)); // 勝敗の表示
			System.out.print("[続けますか？YES=1 NO=0：] >");
			yesno = new java.util.Scanner(System.in).nextInt();
		} while ( yesno == 1); // 続ける場合は1を入力

	}

	//出す手を文字列に変換
	public static String janken(int x) {
		String hand = "";
		switch (x) {
		case 1:
			hand = "グー";
			break;
		case 2:
			hand = "チョキ";
			break;
		case 3:
			hand = "パー";
			break;
		}
		return hand;
	}

	//ランダムに相手の出す手を決定
	public static int getHand() {
		return (int) (Math.random() * 3) + 1;
	}

	//勝ち負けの判定
	public static String winner(int myHand, int pcHand) {
		String result = "";

		//引き算を行ってその数値で判定
		switch (myHand - pcHand) {
		case 0:
			result = "あいこ";
			break;
		case 1:
		case -2:
			result = "あなたの負け";
			break;
		case -1:
		case 2:
			result = "あなたの勝ち";
		}
		return result;

		//上記にさらに3を加算して3の剰余を出すとスマートになる。
//		switch ((myHand - pcHand + 3) % 3) {
//		case 0:
//			result = "あいこ";
//			break;
//		case 1:
//			result = "あなたの負け";
//			break;
//		case 2:
//			result = "あなたの勝ち";
//		}
//		return result;
	}
}