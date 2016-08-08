package cqu.action;

public class 责任链模式 {
	public static void main(String[] args) {
		MyHandler h1 = new MyHandler("h1");
		MyHandler h2 = new MyHandler("h2");
		MyHandler h3 = new MyHandler("h3");

		h1.setHandler(h2);
		h2.setHandler(h3);

		h1.operator();
	}
}

interface Handler {
	public void operator();
}

abstract class AbstractHandler {
	//引用handler的对象
	private Handler handler;
	
	public Handler getHandler() {
		return handler;
	}
	public void setHandler(Handler handler) {
		this.handler = handler;
	}
}

class MyHandler extends AbstractHandler implements Handler {

	private String name;

	public MyHandler(String name) {
		this.name = name;
	}

	//在此处对请求进行处理
	@Override
	public void operator() {
		System.out.println(name+"  deal!");
		if(getHandler()!=null){
			getHandler().operator();
		}
	}
}

