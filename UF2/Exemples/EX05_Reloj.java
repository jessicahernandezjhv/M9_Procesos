package Exemples;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.text.SimpleDateFormat;
import java.util.*;

public class EX05_Reloj extends Applet implements Runnable {
	private Thread fil = null;
	private Font fuente;
	private String horaActual = "";
	
	public void init() {
		fuente = new Font("Verdana", Font.BOLD, 26);
	}
	
	public void start() {
		if (fil == null) {
			fil = new Thread(this);
			fil.start();
		}
	}

	@Override
	public void run() {
		Thread filActual = Thread.currentThread();
		while (fil == filActual){
			SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
			Calendar cal = Calendar.getInstance();
			horaActual = sdf.format(cal.getTime());
			repaint();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
			}
		}
	}
	
	public void paint (Graphics g) {
		g.clearRect(1, 1, getSize().width, getSize().height);
		setBackground (Color.white);
		g.setFont(fuente);
		g.drawString(horaActual, 20, 50);
	}
	
}
