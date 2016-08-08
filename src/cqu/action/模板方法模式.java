package cqu.action;

public class 模板方法模式 {
	public static void main(String[] args) {
		CCalculator calculator = new Pluser();
		String exp = "2+8";
		//直接调用Parent的主方法来实现相应的功能
		int result = calculator.calculate(exp, "\\+");
		System.out.println(result);
	}
}

abstract class CCalculator{
	//定义一个主方法
	public final int  calculate(String exp,String opt) {
		int[] data = split(exp, opt);
		return calculate(data[0], data[1]);
	}
	
	/*
	 *定义被子类覆盖的方法 
	 */
	public abstract int calculate(int data1,int data2);
	
	
	public int[] split(String str,String opt) {
		String[] arr = str.split(opt);
		int[] arrInt = new int[2];
		arrInt[0] = Integer.parseInt(arr[0]);
		arrInt[1] = Integer.parseInt(arr[1]);
		
		return arrInt;
	}
}

class Pluser extends CCalculator{
	@Override
	public int calculate(int data1, int data2) {
		return data1+data2;
	}
}
