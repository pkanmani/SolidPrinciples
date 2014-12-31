package com.pkrm.Samples.Threads;

public class SampleRunnable implements Runnable {
	public void run() {
		System.out.println("Hello from a runnable Thread");
	}
public static void main(String[] args) {
	new Thread(new SampleRunnable()).start();
	

}

}
