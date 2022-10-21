package secao2;

import java.applet.Applet;
import java.awt.Graphics;

import javax.swing.JOptionPane;

public class Avaliacao extends Applet {
	
	private static final long serialVersionUID = 1L;
	
	@Override
	public void paint(Graphics g) {
		String notas = JOptionPane.showInputDialog("Insira a nota");
		float nota = Float.parseFloat(notas);
		
		if (nota < 0 || nota > 100 ) {
			JOptionPane.showMessageDialog(null, "Nota inválida! Favor informar nota de 0 a 100");
			paint(null);
			
		}
		else {
			if(nota >= 90)
				JOptionPane.showMessageDialog(null, "Excelente");
			else if (nota>=70)
				JOptionPane.showMessageDialog(null, "Bom");
			else if (nota >= 50)
				JOptionPane.showMessageDialog(null, "Regular");
			else
				JOptionPane.showMessageDialog(null, "Insuficiente");
			System.exit(0);
		}
	}
}
