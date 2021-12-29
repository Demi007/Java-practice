package classMethod;

import classMethod.human.Human03;

public class ClassMethod03 {
	public static void main(String[] args) {
		Human03 demi = new Human03();
		
		System.out.println("私の名前は、" + demi.name + "です！");
		String profile = demi.getProfile();
		System.out.println(profile + "です！");
		
		demi.greet("秀典");
		demi.greet(null);
	}
}
