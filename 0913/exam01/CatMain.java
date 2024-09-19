package kr.ac.kopo.day03.exam01;

public class CatMain {

	public static void main(String[] args) {
		Cat cat = new Cat("코숏", "노랑");
		
		System.out.println("나의 고양이는 " + cat.getColor()+ " "+ cat.getBreed()+"입니다.");
		cat.eat("아침");
		cat.meow();
		System.out.println();
		cat.eat("점심");
		cat.scratch();
		cat.meow();
	}
}
