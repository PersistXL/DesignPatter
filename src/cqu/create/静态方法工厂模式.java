package cqu.create;

public class ��̬��������ģʽ {
	public static void main(String[] args) {
		Sender mail = SendFactory2.proceduMail();
		mail.send();
		Sender massage =  SendFactory2.proceduMag();
		massage.send();
	}
}

class SendFactory2{
	public static Sender proceduMail() {
		return new Mail();
	}
	
	public static Sender proceduMag() {
		return new Massage();
	}
}