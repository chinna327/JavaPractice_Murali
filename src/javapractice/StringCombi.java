package javapractice;
import java.util.Scanner;
public class StringCombi {
	static String temstr = "";
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
			String Str = sc.next();
			 temstr = Str; 
				int count=0;
				do{
					for (int i =0; i < Str.length()-1; i++){
						temstr = swap (temstr , i);
						System.out.println(temstr);
					}
					count++;
				}while (count<Str.length());
			sc.close();
	}
	private static String swap(String temstr, int i) {
		char [] ca = temstr.toCharArray();
		char t = ca[i];
		ca[i] = ca[i+1];
		ca[i+1] = t;
		temstr = String.valueOf(ca);
		return temstr;
	}



	

}
