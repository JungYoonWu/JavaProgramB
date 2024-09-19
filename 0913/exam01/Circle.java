package kr.ac.kopo.day03.exam01;

public class Circle {

	static final double PI = 3.14;
	double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double getArea(double radius) {
		return PI * radius * radius;
	}
}
