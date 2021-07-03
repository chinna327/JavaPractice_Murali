package javapractice;

import java.util.Scanner;

public class StringRepatedCount {

	public static void main(String[] args) {
		System.out.println("Enter actual string");
		Scanner sc = new Scanner(System.in);
		String ent = sc.nextLine();
		System.out.println("Enter which you need to count string");
		String rep = sc.next();

		int count = ent.split(rep).length;

		System.out.println("String number of times repeated  " + count);
		sc.close();

	}

}
