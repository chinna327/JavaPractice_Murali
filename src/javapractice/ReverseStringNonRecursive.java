package javapractice;

import java.util.Scanner;

public class ReverseStringNonRecursive {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.next();
		StringBuffer rev = new StringBuffer(str);
		rev.reverse();
		System.out.println(rev);
		s.close();
		}

}
