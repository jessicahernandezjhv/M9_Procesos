package MasHilos;

public class Fil2 extends Thread {
	
	private ContadorHilos counter2;
	
	public Fil2 (ContadorHilos c2) {
		counter2 = c2;
	}
	
	public void run() {
		for (int i=0; i<100; i++) {
			counter2.increment();
		}
		
		System.out.println(counter2.getC());
	}

}
