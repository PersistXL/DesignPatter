package cqu.action;

public class 状态模式 {
public static void main(String[] args) {
		State state = new State();
		//state是引用的类型，外面的改变会使其属性发生改变
		Context context = new Context(state);
		//设置第一种状态
		state.setValue("state1");
		context.method();
		//设置第二种状态
		state.setValue("state2");
		context.method();
	}
}

class State {
	
	private String value;
	
	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public void method1(){
		System.out.println("execute the first opt! 1111111111111111111111111");
	}
	
	public void method2(){
		System.out.println("execute the second opt!  2222222222222222222222");
	}
}


class Context {

	private State state;

	public Context(State state) {
		this.state = state;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public void method() {
		if (state.getValue().equals("state1")) {
			state.method1();
		} else if (state.getValue().equals("state2")) {
			state.method2();
		}
	}
}
