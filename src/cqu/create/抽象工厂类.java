package cqu.create;

public class 抽象工厂类 {
	public static void main(String[] args) {
		Provider provider = new MailFactory();
		Sender mail = provider.produce();
		mail.send();
		
		Provider provid = new SmgFactory();
		Sender mag = provid.produce();
		mag.send();
	}
}

//把每个工厂分开来实现，每个实例类对应一个工厂
interface Provider{
	public Sender produce() ;
}

class MailFactory implements Provider{
	@Override
	public Sender produce() {
		return new Mail();
	}
}

class SmgFactory implements Provider{
	@Override
	public Sender produce() {
		return new Massage();
	}
}
