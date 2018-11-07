package CreandoHilos;

public class Ex01_FilSimple extends Thread{

	public void run() {
		for (int i = 0; i<5; i++) {
			System.out.println("Estem en el fil...");
		}
	}
}
