package secao3;

import javax.swing.JOptionPane;

public class Triangulo {

	public static void main(String[] args) {
		int a, b, c;
		
		a = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira a"));
		b = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira b"));
		c = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira c"));
		if ((a < b + c) && (b < a + c) && (c < b + a)) {
			if ((a == b) && (b == c)) {
				JOptionPane.showMessageDialog(null, "Triângulo equilátero");
			}else
			{
				if ((a==b)||(b==c)||(a==c))
				JOptionPane.showMessageDialog(null, "Triângulo isósceles");
				else
				JOptionPane.showMessageDialog(null, "Triângulo escaleno");	
			}
			
		}else JOptionPane.showMessageDialog(null, "Não forma um Triângulo!");

	}
}