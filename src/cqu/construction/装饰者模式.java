package cqu.construction;

public class 装饰者模式 {

	public static void main(String[] args) {
		Sourc sourc = new Sourc();
		Decorator decorator = new Decorator(sourc);
		
		decorator.method();
	}
	
}

interface Sourceable{
	public void method();
}

class Sourc implements Sourceable{
	@Override
	public void method() {
		System.out.println("This is Sourceable's subclass method");
	}
}

class Decorator implements Sourceable{
	Sourc sourc;
	public Decorator(Sourc sourc) {
		this.sourc = sourc;
	}
	
	@Override
	public void method() {
		System.out.println("Before method!");
		sourc.method();
		System.out.println("After method!");
	}
	
}
