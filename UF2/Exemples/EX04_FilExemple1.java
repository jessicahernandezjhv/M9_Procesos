package Exemples;

public class EX04_FilExemple1 extends Thread {
	private int c;  //comptador de cada fil
	private int fil;
	
	/*
	 * Mètode constructor
	 */
	
	public EX04_FilExemple1 (int fil) {
		this.fil = fil;
		System.out.println("CREANT EL FIL: " + fil);
	}
	
	public void run() {
		c = 0;
		while (c <= 5) {
			System.out.println("Fil: "+ fil + " c = " + c);
			c++;
		}
	}
	
	public static void main (String[] args) {
		EX04_FilExemple1 f = null;
		for (int i = 0; i < 3; i++) {
			f = new EX04_FilExemple1(i+1); //crear fil
			f.start();
		}
		System.out.println("3 fils creats...");
	}
}
