package com.pkrm.Samples.Threads;

public class SampleThread extends Thread {
	
	public void run()
	{
		System.out.println("Hello from Thread class");
	}
	
	public static void main(String[] args) {
		new SampleThread().start();
	}

}
