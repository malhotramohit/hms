package practice;

import java.util.Scanner;

public class Forloop {
	public static void main(String[]args) {
		Scanner input =  new Scanner(System.in);
		Scanner input1 = new Scanner(System.in);
	
		System.out.println("Enter the minimal number");
		int a= input.nextInt();
		System.out.println("Enter the maximal number");
		int b= input1.nextInt();
		for(int i=a;i<b;i++) 
		{
			for(int g=a;g<b;g++) {
				System.out.print("*");
			}
			System.out.println();
		}
		}
	}

