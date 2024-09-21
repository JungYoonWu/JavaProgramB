package _0922;

public class Ball extends Circle{

	public Ball(double radius) {
		super(radius);
	}
	
	@Override
	public double getArea() {
		return 4 * PI * radius * radius;
	}
}
