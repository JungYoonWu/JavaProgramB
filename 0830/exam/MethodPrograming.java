package kr.ac.kopo.day02.exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class MethodPrograming {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("배열의 크기를 입력하세요 : ");
		int N = inputNumberWithValidation();
		int[] test = new int [N];
		
		fillArr(test, br);
		
		System.out.print("기준값을 입력하세요 : ");
		int stdNum = inputNumberWithValidation();
		
		System.out.println("정수형 배열에 저장된 모든 값 : " + getSum(test));
		System.out.println("정수형 배열에 저장된 숫자 중 가장 큰 값 : " + getMax01(test));
		System.out.println("배열에 저장된 숫자 중 입력된 숫자보다 큰 수는 " + getBiggerCnt(test, stdNum)+"개 있습니다.");
		System.out.println("배열에 저장된 숫자를 역순으로 저장하여 출력" + Arrays.toString(getRevArr(test)));
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
	
	static void fillArr(int[] numArr , BufferedReader br) throws IOException{
		System.out.println("배열에 저장할 숫자를 입력하세요.");
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		for(int i = 0; i < numArr.length; i++) {
			numArr[i] = Integer.parseInt(st.nextToken());
		}
	}

	static int getSum(int[] numArr) {
		int sum = 0;
		
		for(int i = 0; i < numArr.length; i++) {
			sum += numArr[i];
		}
		
		return sum;
	}
	
	static int getBiggerCnt(int[] numArr, int stdNum) {
		int cnt = 0;
		
		for(int i = 0; i < numArr.length; i++) {
			if(numArr[i] > stdNum) {
				cnt++;
			}
		}
		
		return cnt;
	}
	
	static int[] getRevArr(int[] numArr) {
		
		int[] revArr = new int[numArr.length];
		
		for(int i = 0; i < numArr.length; i++) {
			revArr[i] = numArr[numArr.length-1-i];
		}
		
		return revArr;
	}
	
	static int getMax01(int[] numArr) {
		int max = Integer.MIN_VALUE;
		
		for(int i = 0; i < numArr.length; i++) {
			if(max < numArr[i]) {
				max = numArr[i];
			}
		}
		
		return max;
	}
	
	static int getMax02(int[] numArr) {	
		Arrays.sort(numArr);
		return numArr[numArr.length-1];
	}
	
	
}
