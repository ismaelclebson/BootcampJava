package secao3;

import javax.swing.JOptionPane;

public class Moeda {

	public static void main(String[] args) {
		double valor, valor_convertido;
		int tipo_moeda;
		
		valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o valor"));
		tipo_moeda = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira tipo de moeda: 1-Libra, 2-Dolar, 3-Euro"));

		switch(tipo_moeda) {
		
			case 1:/*Libra*/{
				valor_convertido = valor/5;
				JOptionPane.showMessageDialog(null, "O valor convertido é de "+valor_convertido);
				break;
			}
			case 2:/*Dólar*/{
				valor_convertido = valor/4;
				JOptionPane.showMessageDialog(null, "O valor convertido é de "+valor_convertido);
				break;
			}
			case 3:/*Euro*/{
				valor_convertido = valor/4.4;
				JOptionPane.showMessageDialog(null, "O valor convertido é de "+valor_convertido);
				break;
			}
			default: 
				JOptionPane.showMessageDialog(null, "Opção incorreta!");
		}
	}

}
