package javapractice;

import java.util.Arrays;
import java.util.Scanner;

public class anagram {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Strings");
		String str = s.next();
		String str2 = s.next();

		boolean flg  = isanagram(str, str2);
		if (flg) {
			System.out.println("Strings are Anagram");
		}else {
			System.out.println("Strings are not Anagram");
		}
	}
		
	static boolean isanagram(String st, String st2)
	{
		if (st.length()==st2.length()) {
			
			char [] c1 = st.toCharArray();
			char [] c2 = st2.toCharArray();
			Arrays.sort(c1);
			Arrays.sort(c2);
			if(Arrays.equals(c1, c2)) {
				return true;
			}		
			
		}else {
			return false;
		}		
		return false;
	}
}
