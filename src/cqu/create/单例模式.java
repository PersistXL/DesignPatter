package cqu.create;

public class ����ģʽ {
	/*��˽��ʵ������ֹ�����ã�staticʹ�����������
	 * ��ֵΪnull��ʱ����
	*/
	//private static ����ģʽ instance = null;
	

	
	//��̬���̷�����(��ֹ������),���˷��������̰߳�ȫ���⣬ʹ��synchronizeЧ�ʵͣ�==��ʹ���ڲ���
/*	public static ����ģʽ getInstance() {
		if (instance==null) {
			instance = new ����ģʽ();
		}
		return instance;
	}*/
	
	//˽�й��췽����ֹ��ʵ����
	private ����ģʽ() {
	}
	
	//ʹ��˽�о�̬�ڲ���������̰߳�ȫ����
	/*����ģʽʹ���ڲ�����ά��������ʵ��
	 * JVM�ڲ��Ļ����ܹ���֤��һ���౻���ص�ʱ��
	 * �����ļ��ع������̻߳����
	 * */
	private static class SingletonFactory{
		//����ڵ����캯���쳣��ʵ����Զ�ò�������
		private  static ����ģʽ instance = new ����ģʽ(); 
	}
	
	//��ȡʵ��
	public ����ģʽ getInstance() {
		return SingletonFactory.instance;
	}
	
	  /* ����ö����������л������Ա�֤���������л�ǰ�󱣳�һ�� */  
	public Object readResolve(){
		return getInstance();
	}
	
	
	
	
}

