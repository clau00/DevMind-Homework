package Quiz10;

import java.util.ArrayList;

public class SubsecventaMaxima {
	
	

	public static void main(String[] args) {
		int dim = 5;
		char[][] shape = new char[dim][dim];
		 
		for (int i=0; i<shape.length; i++) {
		  shape[i] = new char[i + 1];
		  for (int j=0; j<shape[i].length; j++) {
		    shape[i][j] = '*';
		  }
		}
		 
		for (int i=0; i<shape.length; i++) {
		  for (int j=0; j<shape[i].length; j++) {
		    System.out.print(shape[i][j]);
		  }
		  System.out.println();
		}
 	}
}
