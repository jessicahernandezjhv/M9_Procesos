package Exemples;

public class EX06_BucleTAC extends Thread{
	  @Override
	  public void run() {
	    for (;;) {
	      System.out.print("TAC ");
	      try {
	        sleep(200);
	      } catch (InterruptedException e) {
	        // TODO Auto-generated catch block
	        e.printStackTrace();
	      }
	    }
	  }
	}
