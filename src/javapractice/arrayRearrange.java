package javapractice;

import java.util.Arrays;

public class arrayRearrange {

	public static void main(String[] args) {
		
		//int [] a = {1,2,3,-1,-2,-3,-4,2,31,-10,-12,-11,-15};
		int [] a = {1,2,3,-1,2,-3,4,2,31,-10,12,11,15};
		int pivot = 0;
		Arrays.sort(a);
		System.out.println("After sort");
		for(int ara: a) {
			System.out.println(ara);
			if (ara<0) {
				pivot++;
			}			
		}
		int [] neg = Arrays.copyOfRange(a, 0, pivot);
		int [] pos = Arrays.copyOfRange(a, pivot, a.length);
		int [] out = new int [a.length];
		
		//part 0- find which is small array
		int small=0;
		if (pos.length>neg.length) {
			 small = neg.length;
		}else {
			 small = pos.length;
		}	
		
		//Part 1 - enter all postivie alternatively
		int indexo=0;
		for(int i=0;i<small;i++) {
			out[indexo]= pos[i];
			indexo++;
			indexo++;
		}
		//Part 2 - enter all negative alternatively
		indexo=1;
		for(int i=0;i<small;i++) {
			out[indexo]= neg[i];
			indexo++;
			indexo++;
		}
		indexo--;			
		//Part 3 - enter all remaining  positive/negative remaining directly	
		
		if (pos.length>neg.length) {
			for(int i=indexo;i<a.length;i++) {
				out[i]= pos[small];
				small++;
			}
		}else {
			for(int i=indexo;i<a.length;i++) {
				out[i]= neg[small];
				small++;
			}
		}
		
		System.out.println("Output is ");
		for(int ara: out) {
			System.out.println(+ara);
			
		}

	}

}
