package test;
public class Test12_03 {
	public static void main(String[] args) {
		System.out.println("会員検索");
		System.out.print("[検索したい住所] >");
		String searchAddr = new java.util.Scanner(System.in).nextLine();
		System.out.print("[検索したい性別] >");
		String searchGender = new java.util.Scanner(System.in).nextLine();
		if(searchAddr.equals("")){
			view();
		}else if(searchGender.equals("")){
			view(searchAddr);
		}else{
			view(searchAddr,searchGender);
		}
	}
	public static void view(){
		String[] name = {"山田","鈴木","佐々木","田中","小林"};
		String[] gender = {"男性","女性","男性","女性","男性"};
		int[] age = {20,37,45,31,52};
		String[] addr = {"東京","神奈川","東京","埼玉","埼玉"};
		System.out.println("");
		System.out.println("ID\t氏名\t性別\t年齢\t住所");
		System.out.println("--------------------------------");
		for(int i=0;i<=name.length-1;i++){
	System.out.print((i+1)+"\t"+name[i]+"\t"+gender[i]+"\t"+age[i]+"\t\t"+addr[i]+"\n");
		}
	}
	public static void view(String a){
		String[] name = {"山田","鈴木","佐々木","田中","小林"};
		String[] gender = {"男性","女性","男性","女性","男性"};
		int[] age = {20,37,45,31,52};
		String[] addr = {"東京","神奈川","東京","埼玉","埼玉"};
		System.out.println("");
		System.out.println("ID\t氏名\t性別\t年齢\t住所");
		System.out.println("------------------------------");
		for(int i=0;i<=name.length-1;i++){
			if(a.equals(addr[i])){
	System.out.print((i+1)+"\t"+name[i]+"\t"+gender[i]+"\t"+age[i]+"\t\t"+addr[i]+"\n");
			}
		}
	}
	public static void view(String a,String g){
		String[] name = {"山田","鈴木","佐々木","田中","小林"};
		String[] gender = {"男性","女性","男性","女性","男性"};
		int[] age = {20,37,45,31,52};
		String[] addr = {"東京","神奈川","東京","埼玉","埼玉"};
		System.out.println("");
		System.out.println("ID\t氏名\t性別\t年齢\t住所");
		System.out.println("------------------------------");
		for(int i=0;i<=name.length-1;i++){
			if(a.equals(addr[i])&&g.equals(gender[i])){
	System.out.print((i+1)+"\t"+name[i]+"\t"+gender[i]+"\t"+age[i]+"\t\t"+addr[i]+"\n");
			}
		}
	}
}
