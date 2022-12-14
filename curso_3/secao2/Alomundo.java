package secao2;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JApplet;

public class Alomundo extends JApplet {
	
	@Override
	public void init() {
		System.out.println("Inicializando...");
	}

	@Override
	public void paint(Graphics g) {
		this.setBackground(Color.GREEN);
		g.setColor(Color.BLUE);
		this.setSize(400,100);
		g.setFont(new Font("Time New Roman", Font.BOLD, 14));
		g.drawString("Versão JVM:"+System.getProperty("java.version"), 20, 20);
		g.drawString("Versão 3.0:"+System.getProperty("os.name"), 50, 50);
	}
	
	
	@Override
	public void start() {
		System.out.println("Executando...");
	}
	
	@Override
	public void stop() {
		System.out.println("Parando...");
	}
	
	@Override
	public void destroy() {
		System.out.println("Eliminando...");
	}
}
