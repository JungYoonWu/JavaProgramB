package kr.ac.kopo.day01.exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exam03 {
	static final double PI = 3.14;
	
	public static void main(String[]args) throws IOException{
		
		System.out.print("원의 반지름을 입력하세요(cm):");
		double r = inputNumberWithValidation();
		double size = r*r*PI;
		
		System.out.printf("원의 넓이는 %.2fcm입니다.",size);
	}
	
	public static double inputNumberWithValidation() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			double num = Double.parseDouble(br.readLine());
			return num;
			
		}catch(Exception e) {
			System.out.print("숫자를 입력하세요 : ");
			return inputNumberWithValidation();
		}
	}
}
