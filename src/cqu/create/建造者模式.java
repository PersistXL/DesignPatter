package cqu.create;

import java.util.ArrayList;
import java.util.List;

//�빤��ģʽ��ȣ���ע���϶���һ�δ��������Ʒ
public class ������ģʽ {
	List<Sender> senders = new ArrayList<>();
	
	public static void main(String[] args) {
		������ģʽ builder = new ������ģʽ();
		builder.produceMail(10);
		builder.produceMsg(10);
		for(Sender sender:builder.senders){
			sender.send();
		}
	}
	
	public void produceMail(int count) {
		for(int i=0;i<count;i++){
			senders.add(new Mail());
		}
	}
	
	public void produceMsg(int count) {
		for(int i=0;i<count;i++){
			senders.add(new Massage());
		}
	}
}
