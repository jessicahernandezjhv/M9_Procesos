package MasHilos;

//Creamos la clase que hereda de Thread
public class Ex03_ExamenProcesos extends Thread {
	public class HiloThread extends Thread {
		public void run() {

			System.out.println("Soc el fil Thread.");
		}
	}

	//Creamos la clase que implementa de Runnable
	public class HiloRunnable implements Runnable {
		public void run() {

			System.out.println("Soc el fil Runnable.");
		}
	}


	//Creamos el main donde se llaman a las dos classes.
	public static void main(String[] args) {

		//Inicializamos hilos.
		Ex03_ExamenProcesos tupper = new Ex03_ExamenProcesos();
		Thread filRunnable = new Thread(tupper.new HiloRunnable());
		Ex03_ExamenProcesos.HiloThread thread = tupper.new HiloThread();

		//lanzamos los hilos.
		filRunnable.start();
		thread.start();

	}
}