package cqu.action;

public class 中介者模式 {
	public static void main(String[] args) {
		Mediator mediator = new MyMediator();
		mediator.createMediator();
		mediator.workAll();
	}
}

interface Mediator {
	public void createMediator();
	public void workAll();
}

class MyMediator implements Mediator {
	//两个相互依赖的类的实例
	private User user1;
	private User user2;
	
	public User getUser1() {
		return user1;
	}

	public User getUser2() {
		return user2;
	}

	@Override
	public void createMediator() {
		user1 = new User1(this);
		user2 = new User2(this);
	}

	@Override
	public void workAll() {
		user1.work();
		user2.work();
	}
}

abstract class User {
	
	private Mediator mediator;
	
	public Mediator getMediator(){
		return mediator;
	}
	
	public User(Mediator mediator) {
		this.mediator = mediator;
	}

	public abstract void work();
}

class User2 extends User {

	public User2(Mediator mediator){
		super(mediator);
	}
	
	@Override
	public void work() {
		System.out.println("user2 exe!");
	}
}

class User1 extends User {

	public User1(Mediator mediator){
		super(mediator);
	}
	
	@Override
	public void work() {
		System.out.println("user1 exe!");
	}
}