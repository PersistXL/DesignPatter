package cqu.action;

public class ²ßÂÔÄ£Ê½ {
	public static void main(String[] args) {
		String string = "2+8";
		ICalculator calculator = new Plus();
		System.out.println(calculator.calculate(string));
	}
}

interface ICalculator{
	public int  calculate(String str);
}

abstract class Calculator{
	public int[] split(String str,String opt) {
		String[] arr = str.split(opt);
		int[] arrInt = new int[2];
		arrInt[0] = Integer.parseInt(arr[0]);
		arrInt[1] = Integer.parseInt(arr[1]);
		
		return arrInt;
	}
}

class Plus extends Calculator implements ICalculator{
	@Override
	public int calculate(String str) {
		int[] data = split(str, "\\+");
		return data[0]+data[1];
	}
}
class Minus extends Calculator implements ICalculator{
	@Override
	public int calculate(String str) {
		int[] data = split(str, "-");
		return data[0]-data[1];
	}
}
class Multiply extends Calculator implements ICalculator{
	@Override
	public int calculate(String str) {
		int[] data = split(str, "\\*");
		return data[0]*data[1];
	}
}
