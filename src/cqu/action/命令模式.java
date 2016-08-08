package cqu.action;

public class ÃüÁîÄ£Ê½ {
	public static void main(String[] args) {
		Invoker invoker  = new Invoker(new MyCommand(new Reciever()));
		invoker.action();
	}
}

interface Command{
	public void exe() ;
}

class Invoker{
	private MyCommand command;
	public Invoker(MyCommand command) {
		this.command = command;
	}
	
	public void action() {
		command.exe();
	}
}

class MyCommand implements Command{
	private Reciever reciever;
	
	public MyCommand(Reciever reciever) {
		this.reciever = reciever;
	}
	
	@Override
	public void exe() {
		reciever.action();
	}
	
}

class Reciever{
	public void action() {
		System.out.println("The soldier has recieved command.");
	}
}