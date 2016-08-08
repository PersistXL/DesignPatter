package cqu.construction;

public class 对象适配器 {
	public static void main(String[] args) {
		Source source = new Source();
		Wrapper wrapper = new Wrapper(source);
		wrapper.method1();
		wrapper.method2();
	}
}

class Wrapper implements Targetable{
	//利用组合思想，定义一个对象实例
	Source source;  
	public Wrapper(Source source) {
		this.source = source;
	}
	
	@Override
	public void method1() {
		source.method1();
	}
	
	@Override
	public void method2() {
		System.out.println("This is Wrapper 扩展的功能。");
	}
}