package kr.ac.kopo.day01.exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exam04 {

	public static void main(String[] args) throws IOException{
		
		System.out.print("변수 a에 넣을 숫자 입력 : ");
		int a = inputNumberWithValidation();
		
		System.out.print("변수 b에 넣을 숫자 입력 : ");
		int b = inputNumberWithValidation();
		
		int []numArr = {a, b};
		
		swapping(numArr);
		
		System.out.println();
		System.out.println("Swapping 결과 >");
		System.out.println("변수 a의 값 = " + numArr[0]);
		System.out.println("변수 b의 값 = " + numArr[1]);
	}
	
	public static void swapping(int[]numArr) {
		int temp = 0;
		temp = numArr[0];
		numArr[0] = numArr[1];
		numArr[1] = temp;
	}
	
	public static int inputNumberWithValidation() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			int num = Integer.parseInt(br.readLine());
			return num;

		}catch(Exception e) {
			System.out.print("숫자를 입력하세요 : ");
			return inputNumberWithValidation();
		}
	}
}
