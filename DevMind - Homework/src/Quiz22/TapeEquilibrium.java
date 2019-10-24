package Quiz22;

public class TapeEquilibrium {

	public int tapeEq(int[] a) {
		if(a.length == 0) {
			return 0;
		}
		
		int min = Integer.MAX_VALUE;
		int sum1 = a[0];
		int sum2 = 0;
		for(int i=1; i<a.length; i++) {
			sum2 += a[i];
		}
		//System.out.println(sum1);
		//System.out.println(sum2 + "\n");
		for(int p=1; p<a.length; p++) {
			//System.out.println(Math.abs(sum1 - sum2));
			if(Math.abs(sum1 - sum2) < min) {
				min = Math.abs(sum1 - sum2); 
			}
			sum1 += a[p];
			sum2 -= a[p];
		}
		return min;
	}
	
	public static void main(String[] args) {
		int[] a = {3,1,2,4,3};
		
		TapeEquilibrium t = new TapeEquilibrium();
		
		System.out.println(t.tapeEq(a));
	}
}
