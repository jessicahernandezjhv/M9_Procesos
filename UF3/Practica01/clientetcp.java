package Practica01;

import java.net.*;
import java.io.*;

public class clientetcp {
	public static void main(String argv[]) {

		/* Comprueba que el programa es ejecutado introduciendo 1 argumento,
		 * si no es así imprime un error y sale del programa, */
		if (argv.length != 1) {
			System.err.println("Us: java clientetcp servidor");
			System.exit(1);
		}

		/* Declaramos e instanciamos la variable que nos permite leer los datos 
		 * introducidos por teclado */
		BufferedReader teclat = new BufferedReader(new InputStreamReader(System.in));

		// Declaramos las variables que vamos a necesitar
		Socket socket;
		InetAddress address;
		String missatge="";
		String missatgeServidor="";

		try {
			/* Coge el primer parámetro introducido por argumentos
			 * (debe ser una URL) y retorna una instancia de tipo dirección IP calculada a partir de ese parametro */
			address = InetAddress.getByName(argv[0]); 

			/* Se abre un socket conectado al servidor y al puerto estándar de echo */
			socket = new Socket(address, 6001);

			// Extraemos los Streams de entrada y de salida del cliente
			DataInputStream in = new DataInputStream(socket.getInputStream());
			DataOutputStream out = new DataOutputStream(socket.getOutputStream());

			// Escribimos este string en el socket que hemos abierto
			out.writeUTF("AVE");

			// Leemos los datos de la petición y los imprimimos por pantalla
			missatgeServidor = in.readUTF();
			System.out.println(missatgeServidor);

			do {
				/* Leemos los datos introducidos por el usuario mediente el teclado
				 * y los escribimos en el socket que hemos abierto */
				missatge = teclat.readLine();
				out.writeUTF(missatge);

				// Leemos los datos de la petición y los imprimimos por pantalla
				missatgeServidor = in.readUTF();
				System.out.println(missatgeServidor);
			} while (!missatge.startsWith("fi"));


			in.close();
			out.close();
			socket.close(); // Se cierra el socket
		} 
		catch (Exception e) {
			System.err.println(e.getMessage());
			System.exit(1);
		}
	}
}
