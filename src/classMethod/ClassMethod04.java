package classMethod;

import classMethod.human.Human04;

public class ClassMethod04 {
	public static void main(String[] args) {
		Human04 demi = new Human04("デミ");
		Human04.staticMethodPrint();
		System.out.println(Human04.GREETING);
		demi.instanceMethodPrint();
	}
}
