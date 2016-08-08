package cqu.construction;

public class �Ž�ģʽ {
	public static void main(String[] args) {
		DriverManager driverManager  = new MyDriver();
		//ʹ��Mysql���ݿ�
		MySqlDriver mySqlDriver = new MySqlDriver();
		driverManager.setDriver(mySqlDriver);
		driverManager.show();
		
		//ʹ��Oracle���ݿ�ʱ
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
	 * �̳и����set�������ھ���ʹ��ʱ����Driver����ʵ��
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

