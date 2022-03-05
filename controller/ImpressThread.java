package controller;

public class ImpressThread extends Thread {
	
	public void run() {
		System.out.println("Thread TID: " + this.getId());
	}
}
