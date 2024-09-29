package _0927.inter;

public class CountTest {

	public static void main(String[] args) {
		Countable [] countable = {new Bird("뻐꾸기", 5), new Bird("독수리", 2), new Tree("사과나무", 10), new Tree("밤나무", 7)};
		
		for(Countable c : countable) {
			c.count();
		}
		
		System.out.println();
		
		for(Countable c : countable) {
			if(c instanceof Bird) {
				((Bird) c).fly();
			}else if(c instanceof Tree) {
				((Tree) c).ripen();
			}
		}
	}
}
