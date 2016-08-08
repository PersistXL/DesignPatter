package cqu.action;

public class ����¼ģʽ {
	public static void main(String[] args) {
		Original original = new Original("ƻ��");
		System.out.println(original.getValue());
		Storage storage=new Storage( original.createMemento());
		original.setValue("����");
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

	//����״̬
	public  Memento createMemento(){
		return new Memento(value);
	}
	
	//�ָ�״̬
	public void restoreMemento(Memento memento){
		this.value = memento.getValue();
	}
}

class Memento {
	//�洢������Ҫ���ݵ�����
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
	//ֻ����洢���������޸�
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
