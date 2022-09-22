package secao3;

import javax.swing.JOptionPane;

public class Equacao2Grau {

	public static void main(String[] args) {
		
	
		float a, b, c;
		double delta, x1, x2;
		
		a = Float.parseFloat(JOptionPane.showInputDialog("Insira o valor de a:"));
		b = Float.parseFloat(JOptionPane.showInputDialog("Insira o valor de b:"));
		c = Float.parseFloat(JOptionPane.showInputDialog("Insira o valor de c:"));
		
		delta = Math.pow(b, 2) - 4*a*c;
		
		if (delta >= 0) {
			x1 = -b + (Math.sqrt(delta))/a;
			x2 = -b - (Math.sqrt(delta))/a;
			JOptionPane.showMessageDialog(null, "Raiz x1 é "+x1+"\nRaiz x2 é "+x2);
		}else
			JOptionPane.showMessageDialog(null, "Não existem raizes reias");
	}
}
