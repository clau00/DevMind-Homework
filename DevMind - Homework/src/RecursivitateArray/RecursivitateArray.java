package RecursivitateArray;

public class RecursivitateArray {
	private static int myMathPowR(int x, int y) {
		if(y == 1) {
			return x;
		}
		return x * myMathPowR(x, y-1);
	}
	
	private static int[] sortArray(int[] array) {
		int cnt = array.length-1;
		for(int i=array.length-1; i>=0; i--) {
			if(array[i] != 0) {
				array[cnt] = array[i];
				cnt--;
			}
		}	
		for(int i=0; i<cnt+1; i++) {
			array[i] = 0;
		}
		return array;
	}
	
	private static void printArray(int[] array) {
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
	
	public static void main(String args[]) {
		System.out.println(myMathPowR(2, 6));
		
		int[] array = {4, 2, 0, 1, 0, 0, 3, 0, 1, 1};
		printArray(sortArray(array));
	
	}
}
