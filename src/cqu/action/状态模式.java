package cqu.action;

public class ״̬ģʽ {
public static void main(String[] args) {
		State state = new State();
		//state�����õ����ͣ�����ĸı��ʹ�����Է����ı�
		Context context = new Context(state);
		//���õ�һ��״̬
		state.setValue("state1");
		context.method();
		//���õڶ���״̬
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
