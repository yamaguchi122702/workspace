package test;
public class Test12_01 {
	public static void main(String[] args) {
		String[] name = {"山田","鈴木","佐々木","田中","小林"};
		int[] age = {20,37,45,31,52};
		String[] addr = {"東京","神奈川","東京","埼玉","埼玉"};
		System.out.println("会員住所検索");
		System.out.print("[検索したい住所] >");
		String search = new java.util.Scanner(System.in).nextLine();
		System.out.println("");
		System.out.println("会員ID\t氏名\t年齢\t住所");
		System.out.println("------------------------------");
		if(search == null){
			for(int i=0;i<=name.length-1;i++){
		System.out.print((i+1)+"\t"+name[i]+"\t"+age[i]+"\t"+addr[i]+"\n");
			}
		}else{
			for(int i=0;i<=name.length-1;i++){
				if(addr[i].equals(search)){
		System.out.print((i+1)+"\t"+name[i]+"\t"+age[i]+"\t"+addr[i]+"\n");
				}
			}
		}
	}
}
