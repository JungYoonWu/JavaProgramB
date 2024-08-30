package kr.ac.kopo.day02.exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Control_Method01 {
	public static void main(String[]args) throws IOException {
		int check = 0;
		
		do {
			
			show("숫자를 입력하세요 : ");
			int num = inputNumberWithValidation();
			show(checkEvenOdd(num) ? ">> 짝수입니다." : ">> 홀수입니다.");
			System.out.println();
			show("계속 하시겠습니까? (0:멈춤/1:계속)");
			check = inputNumberWithValidation();
			System.out.println();
		}while(checkGoStop(check));
	
	}
	
	static boolean checkEvenOdd(int num) {
		return num%2 == 0 ? true : false;
	}
	
	public static int inputNumberWithValidation() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			int num = Integer.parseInt(br.readLine());
			return num;

		}catch(Exception e) {
			show("숫자를 입력하세요 : ");
			return inputNumberWithValidation();
		}
	}
	
	public static void show(String inStr) {
		System.out.print(inStr);
	}
	
	public static boolean checkGoStop(int num) {
		return num == 1;
	}
}
