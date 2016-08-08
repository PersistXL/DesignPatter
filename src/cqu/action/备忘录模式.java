package cqu.action;

public class 备忘录模式 {
	public static void main(String[] args) {
		Original original = new Original("苹果");
		System.out.println(original.getValue());
		Storage storage=new Storage( original.createMemento());
		original.setValue("橘子");
		System.out.println(original.getValue());
		original.restoreMemento(storage.getMemento());
		System.out.println(original.getValue());
	}
}

class Original {
	private String value;
	
	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Original(String value) {
		this.value = value;
	}

	//保存状态
	public  Memento createMemento(){
		return new Memento(value);
	}
	
	//恢复状态
	public void restoreMemento(Memento memento){
		this.value = memento.getValue();
	}
}

class Memento {
	//存储对象需要备份的属性
	private String value;

	public Memento(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}

class Storage {
	//只负责存储，不进行修改
	private Memento memento;
	
	public Storage(Memento memento) {
		this.memento = memento;
	}

	public Memento getMemento() {
		return memento;
	}

	public void setMemento(Memento memento) {
		this.memento = memento;
	}
}
