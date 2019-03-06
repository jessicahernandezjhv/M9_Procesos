package MasHilos;

public class Ex3_Examen extends Thread {
	
	   public class HiloThread extends Thread {
		   public HiloThread() {
		          super();
		     }
		   
	       public void run() {
	           System.out.println("Soc el fil thread");
	       }
	   }

	   public class HiloRunnable implements Runnable {
	       public void run() {
	           System.out.println("Soc el fil runnable");
	       }
	   }

	   public static void main(String[] args) {
		   new Thread (huha.new HiloRunnable()).start();
		   new HiloThread().start();
		   
	       //Ex3_Examen container = new Ex3_Examen();
	       //Thread runnable = new Thread(container.new HiloRunnable());
	       //Ex3_Examen.HiloThread thread = container.new HiloThread();
	       //runnable.start();
	       //thread.start();
	   }

	}
