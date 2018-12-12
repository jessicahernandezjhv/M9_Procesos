package MasHilos;

public class SyncContador {
	public static void main(String[] args) {
		ContadorHilos c = new ContadorHilos();
		
		Fil1 f1 = new Fil1(c);
		Fil1 f2 = new Fil1(c);
		
		f1.start();
		f2.start();
	}
}
