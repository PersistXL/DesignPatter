package cqu.action;

import java.util.Enumeration;
import java.util.Vector;

public class �۲���ģʽ {
	public static void main(String[] args) {
		Subject sub = new MySubject();
		sub.add(new Observer1());
		sub.add(new Observer2());
		
		sub.operation();
	}

}

/*
 * ���������Ĺ۲��ߣ����ǽ��ܱ��۲��ߵ���Ϣ
 * ������Ӧ�ĸ���update()
 */

interface Observer {
	public void update();
}

class Observer1 implements Observer {

	@Override
	public void update() {
		System.out.println("observer1 has received!");
	}
}

class Observer2 implements Observer {

	@Override
	public void update() {
		System.out.println("observer2 has received!");
	}

}

/*
 * ���屻�۲��ߣ������۲��߼��ϣ����ڹ���۲�����Ϣ
 * 
 */

interface Subject {
	
	/*���ӹ۲���*/
	public void add(Observer observer);
	
	/*ɾ���۲���*/
	public void del(Observer observer);
	
	/*֪ͨ���еĹ۲���*/
	public void notifyObservers();
	
	/*����Ĳ���*/
	public void operation();
}

//operation������������ʵ�֣���ɾ���Ĳ���
abstract class AbstractSubject implements Subject {
	private Vector<Observer> vector = new Vector<Observer>();
	@Override
	public void add(Observer observer) {
		vector.add(observer);
	}

	@Override
	public void del(Observer observer) {
		vector.remove(observer);
	}

	@Override
	public void notifyObservers() {
		Enumeration<Observer> enumo = vector.elements();
		while(enumo.hasMoreElements()){
			enumo.nextElement().update();
		}
	}
}

class MySubject extends AbstractSubject {

	@Override
	public void operation() {
		System.out.println("update self!");
		notifyObservers();
	}

}