package cqu.create;

public class 普通工厂 {
	public static void main(String[] args) {
		SendFactory factory = new SendFactory();
		Sender mail = factory.produce("Mail");
		mail.send();
		Sender massage = factory.produce("Massage");
		massage.send();
		Sender others = factory.produce("bb");
		others.send();
	}
}

interface Sender{
	public void send();
}

class Mail implements Sender{
	@Override
	public void send() {
		System.out.println("This is sending Mail");
	}
}

class Massage implements Sender{
	@Override
	public void send() {
		System.out.println("This is Massage");
	}
}

class SendFactory{
	public Sender produce(String ss) {
		if (ss.equals("Mail")) {
			return new Mail();
		}else if (ss.equals("Massage")) {
			return new Massage();
		}else {
			System.out.println("输入类型错误");
			return null;
		}
	}
}