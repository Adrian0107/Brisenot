package tarea6;

public class Proceso3 implements Runnable{
	
	@Override
	public void run() {
		for(int i=11; i<=15; i++) {
			System.out.println("Niño "+i);
		}
	}


}
