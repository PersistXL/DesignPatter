package cqu.create;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ԭ��ģ�� implements Cloneable,Serializable{
	private static final long serialVersionUID = 1L;
	private String string;
	
	public String getString() {
		return string;
	}
	public void setString(String string) {
		this.string = string;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	//ǳ����
	public ԭ��ģ�� clone() throws CloneNotSupportedException {
		//�˴�����Object��clone���������ǳ����
		ԭ��ģ�� prototype = (ԭ��ģ��) super.clone();
		return prototype;
	}   
	
	//���
	public Object  deepClone() throws Exception {
		//�ѵ�ǰ����д������
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(bos);
		objectOutputStream.writeObject(this);
		
		//�����ж�������
		ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
		ObjectInputStream objectInputStream = new ObjectInputStream(bis);
		
		return  objectInputStream.readObject();
	}
	
}
