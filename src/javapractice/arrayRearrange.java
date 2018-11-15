package javapractice;

import java.util.Arrays;

public class arrayRearrange {

	public static void main(String[] args) {
		
		int [] a = {1,2,3,-1,-2,-3,-4};
		int pivot = 0;
		Arrays.sort(a);
		
		for(int ara: a) {
			System.out.println(ara);
			if (ara<0) {
				pivot++;
			}			
		}
		System.out.println(pivot);
		int [] neg = new int [pivot-1];
		int [] pos = new int [a.length -pivot-1];
		int [] out = new int [a.length-1];
		int ind = 0;
		for(int i=0; i<pivot*2; i++) {
			 out[ind] =neg[i];
			 out[ind++]=pos[i];
		}
		for(int ara: out) {
			System.out.println(ara);
			
		}

	}

}
