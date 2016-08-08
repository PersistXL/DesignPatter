package cqu.create;

public class ���󹤳��� {
	public static void main(String[] args) {
		Provider provider = new MailFactory();
		Sender mail = provider.produce();
		mail.send();
		
		Provider provid = new SmgFactory();
		Sender mag = provid.produce();
		mag.send();
	}
}

//��ÿ�������ֿ���ʵ�֣�ÿ��ʵ�����Ӧһ������
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
