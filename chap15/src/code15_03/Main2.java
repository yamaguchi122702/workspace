package code15_03;
//全角スペースを除去するtrimを作る
public class Main2 {
  public static void main(String[] args) {
    String s1 = " 　　Java programing　 　";
    s1 = trim(s1);
    System.out.println("文字列s1は" + s1);        // ⇒ Java programing
    System.out.println("文字列s1の4文字目以降は" + s1.substring(3));        // ⇒ a programing
    System.out.println("文字列s1の4～8文字目以降は" + s1.substring(3, 8));  // ⇒ a pro
  }
  public static String trim(String str) {
	  //処理用1変数stに代入
	  String st = str;
	  String st1 = st;
	  boolean check;
	  do{
		  //無限ループにしない為に最初にfalse指定
		  check =false;
		  //半角スペースを除去
		  st = st1;
		  st1 = st.trim();
		  //先頭に全角スペースが無いかチェック
		  if(st1.startsWith("　")){
			  //全角スペースがあったので先頭を除去
			  st = st1.substring(1);
			  st1 = st;
			  //全角スペースがあったのでもう一度再チェックが必要true
			  check = true;
		  }
		  //終端に全角スペースが無いかチェック
		  if(st1.endsWith("　")){
			  //全角スペースがあったので終端を除去
			  st = st1.substring(0,st1.length()-1);
			  st1 = st;
			  //全角スペースがあったのでもう一度再チェックが必要true
			  check = true;
		  }
	  }while(check);

	  return st1;
  }
}
