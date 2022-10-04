package secao3;

import javax.swing.JOptionPane;

public class FormaPagamento {

	public static void main(String[] args) {
		double valor, valorPagar;
		int tipo_pagamento;
		
		valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o valor"));
		tipo_pagamento = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira tipo de moeda: 1-à vista, 2-à vista crédito, 3-2 vezes sem juros,4-3 vezes com juros"));

		switch(tipo_pagamento) {
		
			case 1:{
				valorPagar = valor*0.9;
				JOptionPane.showMessageDialog(null, "O valor a pagar é de "+valorPagar);
				break;
			}
			case 2:{
				valorPagar = valor*0.95;
				JOptionPane.showMessageDialog(null, "O valor a pagar é de "+valorPagar);
				break;
			}
			case 3:{
				valorPagar = valor/2;
				JOptionPane.showMessageDialog(null, "Pagará 2 vezes de "+valorPagar);
				break;
			}
			case 4:{
				valorPagar = (valor*1.1)/3;
				JOptionPane.showMessageDialog(null, "Pagará 3 vezes de "+valorPagar);
				break;
			}
			default: 
				JOptionPane.showMessageDialog(null, "Opção incorreta!");
		}
	}

}
