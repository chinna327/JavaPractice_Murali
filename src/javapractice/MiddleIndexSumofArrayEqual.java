package javapractice;

public class MiddleIndexSumofArrayEqual {

	public static void main(String[] args) {
		int [] n = {2,4,4,5,4,1};
		int index =0;
		boolean flg = false;
		while (flg == false) {
		flg = find(n,index);
		index++;
		if((index>n.length)&&(flg ==false)) {
			System.out.println("The array is not having proper values ");
			System.exit(0);
		}
		
		};
		index--;
		
		System.out.println("index is "+ index);
		
		
	}

	static boolean find(int[] n, int index){
		
		int start = index;
		int cs = 0, ce =0;
		for (int i=0;i<start; i++) {
			cs = cs+n[i];
		}
		
		for (int i=n.length-1;i>=start; i--) {
			ce = ce+n[i];
		}
		
		if(cs==ce) {
				return true;
		}else {
			return false;
		}
		
		
	}
}
