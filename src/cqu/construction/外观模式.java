package cqu.construction;

public class 外观模式 {
	public static void main(String[] args) {
		Computer computer = new Computer();
		computer.start();
		System.out.println("=========忧伤的分割线===========");
		computer.shutdown();
	}
}

class  Computer{
	private CPU cpu;
	private Memory memory;
	private Disk disk;
	
	public Computer() {
		cpu = new CPU();
		memory = new Memory();
		disk = new Disk();
	}
	
	public void start() {
		System.out.println("start the computer!"); 
		cpu.start();
		memory.start();
		disk.start();
		System.out.println("start the computer!"); 
	}
	
	public void shutdown() {
		 System.out.println("begin to close the computer!");  
		 cpu.shutdown();
		 memory.shutdown();
		 disk.shutdown();
		 System.out.println("closed the computer!");
	}
	
}



class CPU{
	public void start() {
		System.out.println("CPU start.");
	}
	
	public void shutdown() {
		System.out.println("CPU shutdown.");
	}
}

class Memory{
	public void start() {
		System.out.println("Memory start.");
	}
	
	public void shutdown() {
		System.out.println("Memory shutdown.");
	}
}

class Disk{
	public void start() {
		System.out.println("Disk start.");
	}
	
	public void shutdown() {
		System.out.println("Disk shutdown.");
	}
}
