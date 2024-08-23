package kr.ac.kopo.day01.exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exam01 {

	public static void main(String[]args) throws IOException{
		
		System.out.println("가로길이와 세로길이를 입력하세요.");
		
		System.out.print("직사각형의 가로 길이 : ");
		double width = inputNumberWithValidation();
		
		System.out.print("직사각형의 세로 길이 : ");
		double height = inputNumberWithValidation();
		
		double size = width * height;
		
		//System.out.printf("직사각형의 넓이는 " + size + "cm입니다.");
		System.out.printf("직사각형의 넓이는 %.1fcm입니다.", size);
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
