package cqu.construction;

public class 代理模式 {
	public static void main(String[] args) {
		Parent parent = new LogProxy();
		parent.method();
	}
}

interface Parent{
	public void method();
}

class Log implements Parent{
	@Override
	public void method() {
		System.out.println("This is Log's method for logging!");
	}
}

class LogProxy implements Parent{
	private Log log;
	
	public LogProxy() {
		super();
		log = new Log();
	}
	
	@Override
	public void method() {
		before();
		log.method();
		after();
	}
	
	private void before() {
		System.out.println("Before logging do something.");
	}
	
	private void after() {
		System.out.println("Logging after,should do something.");
	}
}