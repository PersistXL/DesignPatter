package cqu.create;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class 原型模型 implements Cloneable,Serializable{
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
	
	//浅复制
	public 原型模型 clone() throws CloneNotSupportedException {
		//此处调用Object的clone函数来完成浅复制
		原型模型 prototype = (原型模型) super.clone();
		return prototype;
	}   
	
	//深复制
	public Object  deepClone() throws Exception {
		//把当前对象写到流里
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(bos);
		objectOutputStream.writeObject(this);
		
		//从流中读出对象
		ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
		ObjectInputStream objectInputStream = new ObjectInputStream(bis);
		
		return  objectInputStream.readObject();
	}
	
}
