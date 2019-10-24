package RecursivitateArray;

public class Stringuri {
	public static int getNumberOfEncounters(String s, char n) {
		int cnt = 0;
		for(int i=0; i<s.length(); i++) {
			if(Character.toLowerCase(n) == Character.toLowerCase(s.charAt(i))) {
				cnt ++;
			}
		}
		return cnt;
	}
	
	public static boolean areAnagrams(String s1, String s2) {
		s1.toLowerCase();
		s2.toLowerCase();
		boolean isAnagram = false;
		
		for(int i=0; i<s1.length(); i++) {
			if(!Character.isLetter(s1.charAt(i)) || s1.indexOf(s1.charAt(i)) != i){
				continue;
			}
			
			if(getNumberOfEncounters(s1, s1.charAt(i)) == getNumberOfEncounters(s2, s1.charAt(i))){
				isAnagram = true;	
			}else {
				isAnagram = false;
				break;
			}
		}
		
		return isAnagram;
	}
	
	public static int convertStringToNumber(String numberStr) {
		  char[] digits = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
		  int numValue = 0;
		 
		  char[] str = numberStr.toCharArray();
		  // your code goes here
		 for(int i=0; i<str.length; i++) {
			 numValue = numValue * 10 + str[i] - '0';
		 }
		  
		  return numValue;
		}
	
	public static void main(String args[]) {
		String s1 = "William Shakespeare !";
		String s2 = "I am a weakish speller";
		
		System.out.println(areAnagrams(s1, s2));
		
		System.out.println(1 + convertStringToNumber("432443"));
	}
}
