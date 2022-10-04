package secao4;

import javax.swing.JOptionPane;

public class euler {

	public static void main(String[] args) {
		double e=0,x;
		
		x = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor de n:"));
		
		for (int i=1;i<=100;i++) {
			e = e + Math.pow(x, i)/i;
		}
		JOptionPane.showMessageDialog(null, "Valor de e^"+x+"="+e);
	}

}
