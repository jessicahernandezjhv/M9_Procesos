package CreandoHilos;

public class Ex04_UsaFil2 {
	public static void main (String[] args) {
		Ex03_FileSimple2 fs = new Ex03_FileSimple2();
		Thread t = new Thread(fs);
		
		t.start();
		
		for (int i=0; i<5; i++) {
			System.out.println("Fora del fil...");
		}
	}
}
