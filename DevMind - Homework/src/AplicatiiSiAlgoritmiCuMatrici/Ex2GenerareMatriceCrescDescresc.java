package AplicatiiSiAlgoritmiCuMatrici;

import java.util.Scanner;
import java.util.Random;

public class Ex2GenerareMatriceCrescDescresc {
	
	private static final int dimensionLimit = 10;
	
	private static Scanner sc = new Scanner(System.in);
	private static Random random = new Random();
	
	public static String formatInt(int n) {
		if(n / 10 == 0) {
			return "  " + n;
		}else {
			return " " + n;
		}
	}

	public static int[][] generareMatriceDescrescatoareOrizontal(){
		
		int n = random.nextInt(dimensionLimit - 3) + 3,
				m = random.nextInt(dimensionLimit - 3) + 3;
		int[][] result = new int[n][m];
		
		boolean leftToRightDirection = false;
		int crtValue = n * m;
		
		for(int i=0; i<n; i++) {
			leftToRightDirection = !leftToRightDirection;
			for(int j=0; j<m; j++) {
				if(leftToRightDirection) {
					result[i][m - j - 1] = crtValue;
				}else {
					result[i][j] = crtValue;
				}
				crtValue--;
			}
		}
		return result;
	}
	
	public static int[][] generareMatriceCrescatoareVertical(){
		
		int n = random.nextInt(dimensionLimit - 3) + 3,
				m = random.nextInt(dimensionLimit - 3) + 3;
		int[][] result = new int[n][m];
		
		boolean upToDownDirection = false;
		int crtValue = 1;
		for(int j=0; j<m; j++) {
			upToDownDirection = !upToDownDirection;
			for(int i=0; i<n; i++) {
				if(upToDownDirection) {
					result[i][j] = crtValue;
				}else {
					result[n - i - 1][j] = crtValue;
				}
				crtValue++;
			}
		}
		return result;
	}	
	
	public static void printMatrice(int[][] m) {
		for(int i=0; i<m.length; i++) {
			for(int j=0; j<m[0].length; j++) {
				System.out.print(formatInt(m[i][j]) + " ");
			}
			System.out.println();
		}
		System.out.println();		
	}
	
	public static void main(String[] args) {
		int[][] a = generareMatriceDescrescatoareOrizontal();
		printMatrice(a);
		
		int[][] b = generareMatriceCrescatoareVertical();
		printMatrice(b);
	}
}
