package tarea6;

public class ClasePrincipal {
	
	public static void main(String[] args) {
		Proceso1 hilo1= new Proceso1();
		Thread hilo2= new Thread(new Proceso2());
		Thread hilo3=new Thread(new Proceso3());
		 System.out.println("El orden de entrada de los niños sera:" );
		hilo1.start();
		hilo2.start();
		hilo3.start();
		
	}
}
