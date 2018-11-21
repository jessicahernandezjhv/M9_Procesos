package Exemples;

public class EX06_BucleTIC  extends Thread {
	  @Override
	  public void run() {
	    for (;;) {
	      System.out.print("TIC ");
	      try {
	        sleep(200);
	      } catch (InterruptedException e) {
	        // TODO Auto-generated catch block
	        e.printStackTrace();
	      }
	    }
	  }
	}
