package cqu.create;

public class 单例模式 {
	/*持私有实例，防止被引用，static使其具有类属性
	 * 赋值为null延时加载
	*/
	//private static 单例模式 instance = null;
	

	
	//静态工程方法，(防止被覆盖),但此方法存在线程安全问题，使用synchronize效率低，==》使用内部类
/*	public static 单例模式 getInstance() {
		if (instance==null) {
			instance = new 单例模式();
		}
		return instance;
	}*/
	
	//私有构造方法防止被实例化
	private 单例模式() {
	}
	
	//使用私有静态内部类来解决线程安全问题
	/*单例模式使用内部类来维护单例的实现
	 * JVM内部的机制能够保证当一个类被加载的时候
	 * 这个类的加载过程是线程互斥的
	 * */
	private static class SingletonFactory{
		//亦存在当构造函数异常，实例永远得不到创建
		private  static 单例模式 instance = new 单例模式(); 
	}
	
	//获取实例
	public 单例模式 getInstance() {
		return SingletonFactory.instance;
	}
	
	  /* 如果该对象被用于序列化，可以保证对象在序列化前后保持一致 */  
	public Object readResolve(){
		return getInstance();
	}
	
	
	
	
}

