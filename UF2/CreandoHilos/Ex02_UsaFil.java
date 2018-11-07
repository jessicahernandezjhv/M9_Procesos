package CreandoHilos;

public class Ex02_UsaFil {

	public static void main (String[] args) {
		Ex01_FilSimple fs = new Ex01_FilSimple();
		fs.start();

		for (int i = 0; i <5; i++) {
			System.out.println("Fora del fil...");
		}
	}
}
