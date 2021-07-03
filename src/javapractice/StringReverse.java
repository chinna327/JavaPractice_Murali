package javapractice;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String ent = sc.next();
		String rev = "";

		for (int i = ent.length() - 1; i >= 0; i--) {
			rev = rev + ent.charAt(i);
		}
		System.out.println("String reversed  " + rev);
		
		sc.close();
	}
	
}
