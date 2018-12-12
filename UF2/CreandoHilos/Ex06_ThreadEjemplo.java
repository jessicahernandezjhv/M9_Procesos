package CreandoHilos;

public class Ex06_ThreadEjemplo implements Runnable {
	public void run() {
		for (int i = 0; i < 5 ; i++)
			System.out.println(i + " " + Thread.currentThread().getName());
		System.out.println("Termina thread " + Thread.currentThread().getName());
	}
	
	public static void main (String [] args) {
		new Thread ( new Ex06_ThreadEjemplo() , "Pepe").start();
		new Thread ( new Ex06_ThreadEjemplo() , "Juan").start();
		System.out.println("Termina thread main");
	}
}
