package CreandoHilos;

public class Ex05_ThreadEjemplo extends Thread {
    public Ex05_ThreadEjemplo(String str) {
         super(str);
    }

    public void run() {
         for (int i = 0; i < 10 ; i++)
              System.out.println(i + " " + getName());
         System.out.println("Termina thread " + getName());
    }

    public static void main (String [] args) {
         new Ex05_ThreadEjemplo("Pepe").start();
         new Ex05_ThreadEjemplo("Juan").start();
         System.out.println("Termina thread main");
    }
}