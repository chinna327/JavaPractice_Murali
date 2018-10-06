package javapractice;

import java.util.ArrayList;
import java.util.List;

public class DuplicateNumber {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(1);
		numbers.add(3);
		numbers.add(4);
		numbers.add(6);
		numbers.add(7);
		numbers.add(5);
		numbers.add(2);
		numbers.add(2);
		int total = 0;
		int highest = numbers.size()-1;
		for (int i=0; i<=highest; i++){
			total = total +numbers.get(i);
		}
		int duplicate = total - (highest*(highest+1)/2);
		System.out.println(duplicate);

	}

}
