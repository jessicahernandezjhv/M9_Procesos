package Exemples;

public class EX06_TicTac {
	public static void main(String[] args) throws InterruptedException {
	    Thread tic = new EX06_BucleTIC();
	    Thread tac = new EX06_BucleTAC();
	    tic.start();
	    Thread.sleep(100);
	    tac.start();
	  }
	}