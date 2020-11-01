package tarea6;

public class Proceso1 extends Thread{

	 @Override
	 public void run() {
		 for (int i=1; i<=5; i++) {
			 System.out.println("Niño "+i);
		 }
	 }
}
