package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner in = new Scanner(System.in);
		System.out.println("What is your n value: ");
		int nvalue = in.nextInt() ; 
		
		System.out.println("your n value is: " + nvalue ); 
		int[] numberlist = new int[nvalue] ; 
		
		for (int i = 0; i < nvalue - 1; i++ ) {
			numberlist[i] = i + 2 ; 
			//System.out.println(numberlist[i]); 
			for (int c = 0; c < nvalue - 1; c++) {
				boolean[] numlist = new boolean[nvalue] ; 
			}
		}
}
}
