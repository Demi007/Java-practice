package classMethod;

import classMethod.human.Human02;

public class ClassMethod02 {
	public static void main(String[] args){
		Human02 kitamura = new Human02();
		System.out.println("名前は" + kitamura.name + "、年齢は" + kitamura.age);

		Human02 teshio = new Human02("イﾋ！" , 25);
		System.out.println("名前は" + teshio.name + "、年齢は" + teshio.age);
	}
}
