package cqu.create;

import java.util.ArrayList;
import java.util.List;

//与工厂模式相比，关注复合对象，一次创建多个产品
public class 建造者模式 {
	List<Sender> senders = new ArrayList<>();
	
	public static void main(String[] args) {
		建造者模式 builder = new 建造者模式();
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
