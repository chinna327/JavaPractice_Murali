package javapractice;

import java.util.Scanner;

public class ReverseStringWithRecursive {
	static String  rev = "";
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = s.nextLine();
		String rev = reverseString(str);
		System.out.println("reverseed is "+rev);
		s.close();
	}
	
	static String reverseString(String st){		
		
	 if (st.length()>0){			
		rev = rev + st.charAt(st.length()-1);
		reverseString(st.substring(0, st.length()-1));	
					}
				
		return  rev;
	}

}
