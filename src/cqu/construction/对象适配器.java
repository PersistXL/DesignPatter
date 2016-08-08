package cqu.construction;

public class ���������� {
	public static void main(String[] args) {
		Source source = new Source();
		Wrapper wrapper = new Wrapper(source);
		wrapper.method1();
		wrapper.method2();
	}
}

class Wrapper implements Targetable{
	//�������˼�룬����һ������ʵ��
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
		System.out.println("This is Wrapper ��չ�Ĺ��ܡ�");
	}
}