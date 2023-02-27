package percentage_calculator;

import java.util.Scanner;

public class Array_2_Q {
	public static void main(String args[]) {
		
		// Q-> Take an array of names as input from user and print them on screen
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Number of names:");
		int size = sc.nextInt();
     	String names[] = new String[size];
     	// input 
     	System.out.println("Enter Names:");
	   for(int i=0;i<size;i++) {
		
		names[i] = sc.next();
	   }
	   
	   //output
	   for(int i =0;i<size;i++) {
			
			System.out.println("Name " +(i+1)+" is: "+names[i]);
	   }
	}

}
