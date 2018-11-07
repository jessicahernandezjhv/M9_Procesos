package CreandoHilos;

public class Ex03_FileSimple2 implements Runnable {
	public void run() {
		for (int i = 0 ; i<5; i++) {
			System.out.println("En el fil...");
		}
	}
}
