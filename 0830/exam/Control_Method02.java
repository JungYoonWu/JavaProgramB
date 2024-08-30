package kr.ac.kopo.day02.exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Control_Method02 {
	public static void main(String[] args) throws IOException {
		int numStudent = getNumberKeyboard("학생 수 : ");
		int [] scores = getScoreLine(numStudent);
		printSumAverage(scores);
	}
	
	public static int getNumberKeyboard(String message) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.print("학생 수 : ");
			return Integer.parseInt(br.readLine());
		}catch(IOException e){
			System.out.println("학생 수를 입력해 주세요.");
			return getNumberKeyboard("학생 수 : ");
		}
	}
	
	public static int[] getScoreLine(int numStudent) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] scLine = new int[numStudent];
		System.out.print("5명의 성적 : ");
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < scLine.length; i++) {
			scLine[i] = Integer.parseInt(st.nextToken());
		}
		return scLine;
	}
	
	public static void printSumAverage(int[] scores) {
		System.out.println(">> 합계 : " + getSum(scores));
		System.out.println(">> 평균 : " + getAverage(scores));
	}
	
	public static int getSum(int[] scores) {
		int sum = 0;
		for(int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		return sum;
	}
	
	
	
	public static int getAverage(int[] scores) {
		return (getSum(scores)/scores.length);
	}
	
	
}
