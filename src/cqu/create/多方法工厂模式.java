package cqu.create;

public class 多方法工厂模式 {
	public static void main(String[] args) {
		SendFactory1 factory1 = new SendFactory1();
		Sender mail = factory1.proceduMail();
		Sender massage = factory1.proceduMag();
		mail.send();
		massage.send();
	}
}

class SendFactory1{
	public Sender proceduMail() {
		return new Mail();
	}
	
	public Sender proceduMag() {
		return new Massage();
	}
}