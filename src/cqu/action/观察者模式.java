package cqu.action;

import java.util.Enumeration;
import java.util.Vector;

public class 观察者模式 {
	public static void main(String[] args) {
		Subject sub = new MySubject();
		sub.add(new Observer1());
		sub.add(new Observer2());
		
		sub.operation();
	}

}

/*
 * 定义依赖的观察者，他们接受被观察者的信息
 * 发生相应的更新update()
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
 * 定义被观察者，包含观察者集合，用于管理观察者信息
 * 
 */

interface Subject {
	
	/*增加观察者*/
	public void add(Observer observer);
	
	/*删除观察者*/
	public void del(Observer observer);
	
	/*通知所有的观察者*/
	public void notifyObservers();
	
	/*自身的操作*/
	public void operation();
}

//operation让子类来进行实现，完成具体的操作
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