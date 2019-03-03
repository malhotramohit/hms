package practice;

import java.util.Scanner;

public class ArrayTest {
	public static void main(String[] args) {
		//create the array
		Scanner a_input= new Scanner(System.in);
		
		System.out.println("Enter the size of the Array");
		int a= a_input.nextInt();
		int[] DP =  new int[a];
		for(int i=0;i<a;i++) {
			System.out.println("Enter the values ");
			DP[i] = a_input.nextInt(); 
		}
		for (int j = 0; j < DP.length; j++) {
			System.out.print(DP[j]+" ");
		}
		// put values in the array
		
		//DP[0] = 23;
		//DP[1] = 24;
		//DP[2] = 25;
		//DP[3] = 28;
		//DP[4] = 89;
		
		//print them
		//System.out.println(DP[2]);
		//System.out.println(DP[3]);
		//System.out.println(DP[4]);
	}
}
