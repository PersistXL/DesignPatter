package cqu.construction;

public class 桥接模式 {
	public static void main(String[] args) {
		DriverManager driverManager  = new MyDriver();
		//使用Mysql数据库
		MySqlDriver mySqlDriver = new MySqlDriver();
		driverManager.setDriver(mySqlDriver);
		driverManager.show();
		
		//使用Oracle数据库时
		OracleDriver oracleDriver = new OracleDriver();
		driverManager.setDriver(oracleDriver);
		driverManager.show();
		
	}
}

abstract class DriverManager{
	private Driver driver;
	
	public void show() {
		
	}

	public Driver getDriver() {
		return driver;
	}

	public void setDriver(Driver driver) {
		this.driver = driver;
	}
}

class MyDriver extends DriverManager{
	/*
	 * 继承父类的set方法，在具体使用时设置Driver具体实现
	 */
	
	public void show() {
		getDriver().show();
	}
}


interface Driver{
	public void show() ;
}

class MySqlDriver implements Driver{
	@Override
	public void show() {
		System.out.println("This is MySQL Driver working.");
	}
}

class OracleDriver implements Driver{
	@Override
	public void show() {
		System.out.println("This is OracleDriver Driver working.");
	}
}

