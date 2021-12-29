
public class ClassMethod01 {
	public static void main(String[] args) {
		Human01 kitamura = new Human01();
		System.out.println("名前は" + kitamura.name + "、年齢は" + kitamura.age + "です");
		
		Human01 siryuu = new Human01("野球終電マン" , 23);
		System.out.println("名前は" + siryuu.name + "、年齢は" + siryuu.age + "です");
		
		Human01 takayama = new Human01("Mr.証明写真" , 26);
		System.out.println("名前は" + takayama.name + "、年齢は" + takayama.age + "です");
				}
}
