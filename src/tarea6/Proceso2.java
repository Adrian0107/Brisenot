package tarea6;

public class Proceso2 implements Runnable {
	
	@Override
	public void run() {
		for(int i=6; i<=10; i++) {
			System.out.println("Niño "+i);
		}
	}

}
