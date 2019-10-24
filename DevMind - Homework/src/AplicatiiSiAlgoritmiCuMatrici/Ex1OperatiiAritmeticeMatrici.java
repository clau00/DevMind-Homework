package AplicatiiSiAlgoritmiCuMatrici;

import java.util.Scanner;

public class Ex1OperatiiAritmeticeMatrici {
	private static Scanner sc = new Scanner(System.in);
	
	
	public static String formatInt(int n) {
		if(n / 10 == 0) {
			return "  " + n;
		}else {
			return " " + n;
		}
	}

	public static int[][] adunareMatrici(int[][] a, int [][] b){
		if(a.length != a[0].length || a.length != b.length || a.length != b[0].length) {
			System.out.println("\t Matricele au dimensiuni diferite. \n");
		}
		
		int[][] result = new int[a.length][a.length];
		
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<b.length; j++) {
				result[i][j] = a[i][j] + b[i][j];
			}
		}
		return result;
	}
	
	public static int[][] scadereMatrici(int[][] a, int [][] b){
		if(a.length != a[0].length || a.length != b.length || a.length != b[0].length) {
			System.out.println("\t Matricele au dimensiuni diferite. \n");
		}
		
		int[][] result = new int[a.length][a.length];
		
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<b.length; j++) {
				result[i][j] = a[i][j] - b[i][j];
			}
		}
		return result;
	}
	
	public static int[][] inmultireMatrici(int[][] a, int [][] b){
		if(a.length != a[0].length || a.length != b.length || a.length != b[0].length) {
			System.out.println("\t Matricele au dimensiuni diferite. \n");
		}
		
		int[][] result = new int[a.length][a.length];
		int r = 0;
		
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a.length; j++) {
				for(int k=0; k<a.length; k++) {
					result[i][j] += a[i][k] * b[k][j];
				}
			}
		}
		return result;
	}
	
	public static int[][] inmultireMatriceCuScalar(int[][] a, int x){		
		int[][] result = new int[a.length][a.length];
		int r = 0;
		
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a.length; j++) {
				result[i][j] = a[i][j] * x;
			}
		}
		return result;
	}
	
	public static int[][] generareMatrice(){
		System.out.println("\t Introduceti dimensiunea matricei patratice: ");
		int n = sc.nextInt();
		
		int[][] result = new int[n][n];
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.println("\t Introduceti elem. (" + i + ", " + j + ") al matricei: ");
				result[i][j] = sc.nextInt();
			}
		}
		return result;
	}
	
	public static void printMatrice(int[][] a) {
		for(int i=0; i<a.length; i++) {
			System.out.print("\t ");
			for(int j=0; j<a.length; j++) {
				System.out.print(formatInt(a[i][j]));
			}
			System.out.println();
		}
		System.out.println();		
	}
	
	public static void printMatrice(int[][] a, int[][] b) {
		System.out.println("\t Prima matrice \t |  A doua matrice \n");
		for(int i=0; i<a.length; i++) {
			System.out.print("\t ");
			for(int j=0; j<a.length; j++) {
				System.out.print(formatInt(a[i][j]));
			}
			System.out.print("\t |  ");
			for(int j = 0; j<b.length; j++) {
				System.out.print(formatInt(b[i][j]));
			}
			System.out.println();
		}
		System.out.println();		
	}
	
	public static void main(String[] args) {
		int[][] a = generareMatrice();
		int[][] b = generareMatrice();
		
		printMatrice(a, b);
		
		System.out.println("\t Adunarea matricelor: ");
		int[][] aPlusB = adunareMatrici(a, b);
		printMatrice(aPlusB);
		
		System.out.println("\t Scaderea matricelor: ");
		int[][] aMinusB = scadereMatrici(a, b);
		printMatrice(aMinusB);
		
		System.out.println("\t Inmultirea matricelor: ");
		int[][] aInmultitB = inmultireMatrici(a, b);
		printMatrice(aInmultitB);
		
		System.out.println("\t Inmultirea primei matrice cu un scalar. Introduceti un numar. ");
		int n = sc.nextInt();
		int[][] aInmultitX = inmultireMatriceCuScalar(a, n);
		printMatrice(aInmultitX);
		
	}
}
