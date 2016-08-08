package cqu.construction;

public class 接口适配器模式 {
	public static void main(String[] args) {
		Targetable target1 = new SubTarget1(); 
		Targetable target2 = new SubTarget2(); 
		
		target1.method1();
		target1.method2();
		target2.method1();
		target2.method2();
		
	}
}


abstract class InterfaceAdapter implements Targetable{
	@Override
	public void method1() {}
	public void method2() {}
} 

class SubTarget1 extends InterfaceAdapter{
	@Override
	public void method1() {
		System.out.println("This sub One");
	}
}

class SubTarget2 extends InterfaceAdapter{
	@Override
	public void method2() {
		System.out.println("This sub Two");
	}
}