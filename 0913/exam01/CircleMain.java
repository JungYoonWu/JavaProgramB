package kr.ac.kopo.day03.exam01;

import java.util.Scanner;

public class CircleMain {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("원의 반지름 : ");
		double radius = input.nextDouble();
		Circle circle = new Circle(radius);
		
		System.out.printf("반지름이 %.1f인 원의 넓이는 %.2f입니다.",radius, circle.getArea(radius));
		
	}
}
