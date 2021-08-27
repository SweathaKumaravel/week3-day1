package org.system;

public class Desktop extends Computer {

	public void desktopSize() {
		System.out.println("desktop range start from 20.7inch to 30inch");
	}
	public static void main(String[] args) {
		System.out.println("call method using computer obj");
		Computer com=new Computer();
		com.computerModel();
		
		System.out.println("call method into the desktop using single inheritance");
		Desktop desk=new Desktop();
		desk.desktopSize();
		
	}

}
