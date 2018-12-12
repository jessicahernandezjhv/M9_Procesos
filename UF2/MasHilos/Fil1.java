package MasHilos;

public class Fil1 extends Thread {
	
	private ContadorHilos counter;
	
	public Fil1 (ContadorHilos c) {
		counter = c;
	}
	
	public void run() {
		for (int i=0; i<100; i++) {
			counter.increment();
		}
		
		System.out.println(counter.getC());
	}

}
