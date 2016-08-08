package cqu.action;

public class 解释器模式 {
	public static void main(String[] args) {
		// 计算9+2-8的值
		int result = new Minus1().interpret((new Context1(new Plus1()
				.interpret(new Context1(9, 2)), 8)));
		System.out.println(result);
	}
}

interface Expression {
	public int interpret(Context1 context);
}

class Plus1 implements Expression {

	@Override
	public int interpret(Context1 context) {
		return context.getNum1()+context.getNum2();
	}
}

class Minus1 implements Expression {

	@Override
	public int interpret(Context1 context) {
		return context.getNum1()-context.getNum2();
	}
}

class Context1 {
	
	private int num1;
	private int num2;
	
	public Context1(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	
}