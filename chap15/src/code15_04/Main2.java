package code15_04;

import java.io.UnsupportedEncodingException;

//String・char配列・byte配列の相互変換
public class Main2 {
  public static void main(String[] args) throws UnsupportedEncodingException {
	  String str = "こんにちはJava";
	  char[] data1 = str.toCharArray();
	  byte[] data2 = str.getBytes("utf-8");
	  byte[] data3 = str.getBytes();
	  for(char i:data1) {
		  System.out.print(i);
	  }
	  System.out.println("");
	  for(byte i:data2) {
		  System.out.print(i);
	  }
	  System.out.println("");
	  for(byte i:data3) {
		  System.out.print(i);
	  }
	  System.out.println("");
	  //utf-8のチェック
	  codeCheck("utf-8");
	  //MS932のチェック
	  codeCheck("MS932");
  }

  //文字コードのチェック
  public static void codeCheck(String codeName) throws UnsupportedEncodingException {
	  String str = "こんにちはJava";
	  byte[] data1 = str.getBytes(codeName);
	  byte[] data2 = str.getBytes();
	  boolean check = true;
	  for(int i = 0;i < data1.length; i++) {
		  if(data1[i]!=data2[i]) {
			  check = false;
			  break;
		  }
	  }
	  if(check) {
		  System.out.println("デフォルト文字コードは"+codeName+"です");
	  }
  }
}
