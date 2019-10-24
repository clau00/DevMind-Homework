package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class ConvertStrings {
	private static int parseInt(String str) {
		int nr = 0;
		for(int i=0; i<str.length(); i++) {
			if(Character.isDigit(str.charAt(i))) {
				nr = nr * 10 + str.charAt(i) - '0';
			}else {
				System.out.println("\t Numarul contine si altceva in afara de cifre!");
				return -111111;
			}
		}
		return nr;
	}
	
	private static double parseDouble(String str) {
		String str1 = str.substring(0,str.indexOf('.'));
		String str2 = str.substring(str.indexOf('.')+1);
		
		int nr1 = parseInt(str1);
		int nr2 = parseInt(str2);
		
		return nr1 + nr2 / Math.pow(10d, str2.length());
	}
	
	private static boolean parseBoolean(String str) {
		if(str.equals("true")) {
			return true;
		}else {
			return false;
		}
	}
	
	private static void printArray(String[] array) {
		for(int i=0; i<array.length; i++) {
			System.out.println(array[i] + " ");
		}
	}
	
	private static String secondWordInArray(String[] array) {
		if(array.length == 0) {
			return "";
		}
		
		return array[1];
	}
	
	private static String lastButOneInArray(String[] array) {
		if(array.length == 0) {
			return "";
		}
		
		return array[array.length - 2];
	}
	
	private static String transformString(String str) {
		StringBuilder result = new StringBuilder(str);
		
		for(int i=0; i<result.length(); i++) {
			if(Character.isLetter(result.charAt(i))) {
				if(Character.isUpperCase(result.charAt(i))) {
					result.setCharAt(i, Character.toLowerCase(result.charAt(i)));
				}else {
					result.setCharAt(i, Character.toUpperCase(result.charAt(i)));
				}
			}
		}
		String newStr = result.toString();
		return newStr;
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		String str = "12345";
		System.out.println(2 + 2 + parseInt(str));
		
		str = "123re1";
		System.out.println(parseInt(str));
		
		str = "123.456698";
		System.out.println(1.1 + parseDouble(str));
		
		str = "false";
		if(str.equals("false") || str.equals("true")) {
			System.out.println(str);
		}else {
			System.out.println("\t Nu ati introdus un boolean");
		}
		
		System.out.println("    ======================================================================= \n"
						 + "\t Exercitiul 2: \n"
						 + "\t Introudceti un numar natural, reprezentand numarul de cuvinte! \n");
		
		int n = sc.nextInt();
		String[] array = new String[n];
		for(int i=0; i<array.length; i++) {
			System.out.print("\t Introduceti cuvantul " + (i+1) + " din " + n + ": ");
			array[i] = sc.next();
		}
		
		Arrays.sort(array);
		System.out.println("\n\t String secondWordInArray(String[]) -> " + secondWordInArray(array) + "\n");
		System.out.println("\t String lastButOneInArray(String[]) -> " + lastButOneInArray(array) + "\n");
		
		System.out.println("    ======================================================================= \n");
		
		System.out.println("    ======================================================================= \n"
				 + "\t Exercitiul 3: \n");
	
		str = "The number 1 deadliest animal on the PLANET Earth is the @Mosquito!";
		
		System.out.println("\t" + str);
		System.out.println("\t" + transformString(str));
		System.out.println("    ======================================================================= \n");
	}
}
