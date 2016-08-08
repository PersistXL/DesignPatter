package cqu.construction;

public class ¿‡  ≈‰ƒ£ Ω {
	public static void main(String[] args) {
		Targetable targetable = new Adapter();
		targetable.method1();
		targetable.method2();
	}
}

class Source{
	public void method1() {
		System.out.println("This is original source's method!");
	}
}

interface Targetable{
	public void method1() ;
	public void method2() ;
}

class Adapter extends Source implements Targetable{
	@Override
	public void method2() {
		System.out.println("This is adapter's method2 implements Targetable.");
	}
}