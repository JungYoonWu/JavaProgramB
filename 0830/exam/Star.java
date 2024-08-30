package kr.ac.kopo.day02.exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Star {

	public static void main(String[]args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		
		printStar01(num);
		System.out.println();
		printStar02(num);
		System.out.println();
		printStar03(num);
		System.out.println();
		printStar04(num);
		System.out.println();
		printStar05(num);
		System.out.println();
		printStar06(num);
	}
	
	static void printStar01(int num) {
		for(int i = 0; i < num; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	static void printStar02(int num) {
		for(int i = 0; i < num; i++) {
			for(int j = num; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	static void printStar03(int num) {
		for(int i = 0; i < num; i++) {
			
			for(int j = num - 1; j > i; j--) {
				System.out.print(" ");
			}
			
			for(int k = 0; k <= i; k++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
	
	static void printStar04(int num) {
		for(int i = 0; i < num; i++) {
			
			for(int k = 0; k < i; k++) {
				System.out.print(" ");
			}
			
			for(int j = num; j > i; j--) {
				System.out.print("*");
			}
			
			System.out.println();
		}
			
	}
	
	static void printStar05(int num) {
		for(int i = 0; i < num; i++) {
			
			for(int j = num - 1; j > i; j--) {
				System.out.print(" ");
			}
			
			for(int k = 0; k < 2*i+1 ; k++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
	
	static void printStar06(int num) {
		for(int i = 0; i < num; i++) {
			
			for(int k = 0; k < i; k++) {
				System.out.print(" ");
			}
			
			for(int j = 2*(num-i)-1; j > 0; j--) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}

	
	
}
