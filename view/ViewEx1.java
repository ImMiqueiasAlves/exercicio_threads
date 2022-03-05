package view;
import controller.ImpressThread;

public class ViewEx1 {
	public static void main(String[] args) {
		for(int i=0; i < 5; i++) {
			Thread thread = new ImpressThread();
			thread.start();
		}
	}
}
