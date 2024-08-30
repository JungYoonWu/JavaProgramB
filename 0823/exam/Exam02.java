package kr.ac.kopo.day01.exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exam02 {

	public static void main(String[]args) throws IOException{
		
		System.out.print("정수를 입력하세요 : ");
		int num = inputNumberWithValidation();
		if(checkEvenOdd(num)) {
			System.out.println("짝수");
		}else {
			System.out.println("홀수");
		}
		
	}
	static boolean checkEvenOdd(int num) {
		return num%2 == 0 ? true : false;
/*		if(num%2 == 0) {
			return true;
		}
		
		return false;*/
	}
	
	public static int inputNumberWithValidation() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			int num = Integer.parseInt(br.readLine());
			return num;
			
		}catch(Exception e) {
			System.out.print("정수를 입력하세요 : ");
			return inputNumberWithValidation();
		}
	}
}
