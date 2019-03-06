package MasHilos;

public class Fil1 extends Thread {

	public void run() {

		System.out.print("run");

	}



	public static void main(String[] args) {

		Fil1 thread = new Fil1();

		new Thread(thread).start();

		new Thread(thread).start();

	}

}