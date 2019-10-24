package AplicatiiSiAlgoritmiCuMatrici;

import java.util.Random;

public class Ex3GoldMiners {

							//	  0		1	 2     3    4     5    6     7	
	private static int[] dirX = {-1,   -1,   0,   +1,  +1,   +1,   0,   -1};
	private static int[] dirY = { 0,   +1,  +1,   +1,   0,   -1,  -1,   -1};
	private static String[] dir = {"N", "NE", "E", "SE", "S", "SV", "V", "NV"}; 
	private static final int limitValues = 10;	
	private static final int limitDimensions = 10;
	private static Random random = new Random();
	
	public static String formatInt(int n) {
		if(n / 10 == 0) {
			return " " + n;
		}else {
			return "" + n;
		}
	}
	
	public static String formatStr(String s) {
		if(s.length() > 1) {
			return s;
		}else {
			return " " + s;
		}
	}
	
	private static int gatherResources(int[][] matrix, int[] n, int[][] parcurs) {
		int positionX = 0;
		int positionY = 0;
		System.out.print("\t Robotul parcurge: (" + positionX + ", " + positionY + ") -> ");
		
		int amount = matrix[positionX][positionY];
		matrix[positionX][positionY] = 0;
		parcurs[positionX][positionY] += 1;
		
		for(int i=0; i<n.length; i++) {
			int neighI = positionX + dirX[n[i]];
			int neighJ = positionY + dirY[n[i]];
			
			if(neighI >= 0 && neighI < matrix.length &&
			   neighJ >= 0 && neighJ < matrix[0].length) {
				System.out.print("(" + neighI + ", " + neighJ + ")");
				if(i == n.length - 1) {
					System.out.print(". \n");
				}else {
					System.out.print(" -> ");
				}
				amount += matrix[neighI][neighJ];
				matrix[neighI][neighJ] = 0;
				parcurs[neighI][neighJ] += 1;
				positionX = neighI;
				positionY = neighJ;
			}
		}
		System.out.println();
		return amount;
	}
	
	private static void mostVisitedBoxes(int[][] matrix) {
		int max = matrix[0][0];
		for(int i=0; i<matrix.length; i++) {
			for(int j=0; j<matrix[0].length; j++) {
				if(matrix[i][j] > max) {
					max = matrix[i][j];
				}
			}
		}
		System.out.print("\t Casutele cele mai vizitate: ");
		for(int i=0; i<matrix.length; i++) {
			for(int j=0; j<matrix[0].length; j++) {
				if(matrix[i][j] == max) {
					System.out.print("(" + i + ", " + j + ") ");
				}
			}
		}
		System.out.println("\n\n");
	}
	
	private static int[][] generateMatrix(int n, int m){
		int[][] result = new int[n][m];
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				result[i][j] = random.nextInt(limitValues-1)+1;
			}
		}
		return result;
	}
	
	private static int[][] generateMatrix(int n, int m, int value){
		
		int[][] result = new int[n][m];
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				result[i][j] = value;
			}
		}
		return result;
	}
	
	private static int[] generateNeighborsId(int[][] a) {
		int n = random.nextInt(a.length + a[0].length) + 1;
		int[] result = new int[n];
		for(int i=0; i<n; i++) {
			result[i] = random.nextInt(8);
		}
		return result;
	}
	
	public static void printMatrice(int[][] a) {
		for(int i=0; i<a.length; i++) {
			System.out.print("\t");
			for(int j=0; j<a[0].length; j++) {
				System.out.print(formatInt(a[i][j]) + " ");
			}
			System.out.println();
		}
		System.out.println();		
	}
	
	public static void printNeighbors(int[] a) {
		System.out.print("\t {");
		for(int i=0; i<a.length; i++) {
			if(i == a.length - 1) {
				System.out.print(formatInt(a[i]));
			}else {
				System.out.print(formatInt(a[i]) + " ");
			}
		}
		
		System.out.print("} \n \t {");
		
		for(int i=0; i<a.length; i++) {
			if(i == a.length - 1) {
				System.out.print(formatStr(dir[a[i]]));
			}else {
				System.out.print(formatStr(dir[a[i]]) + " ");
			}
		}	
		System.out.print("} \n");
	}
	
	public static void main(String[] args) {
		int n = random.nextInt(limitDimensions - 3) + 3,
				m = random.nextInt(limitDimensions - 3) + 3;
		
		int[][] a = generateMatrix(n, m);
		int[] neighbors = generateNeighborsId(a);
		
		System.out.println("\t Matricea initiala: ");
		printMatrice(a);
		System.out.println("\t Vecinii sunt:");
		printNeighbors(neighbors);
		
		int[] n1 = {3,3,7,7};
		
		int[][] b = generateMatrix(n, m, 0);
		
		int amount = gatherResources(a, neighbors, b);
		System.out.println("\t Cantitatea totala culeasa " + amount);
		mostVisitedBoxes(b);
		
		System.out.println("\t Matricea parcursa: ");
		printMatrice(a);
		
		System.out.println("\t Intensitatea celulelor parcurse: ");
		printMatrice(b);
	}
}
