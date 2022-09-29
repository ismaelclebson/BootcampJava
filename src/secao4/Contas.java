package secao4;

import javax.swing.JOptionPane;

public class Contas {

	public static void main(String[] args) {
		
		String tipoConta;
		double valor, valorTotal=0, numeroContas=0;
		
		tipoConta = JOptionPane.showInputDialog(null, "Insira o nome da conta:");
		valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira seu valor: "));
		
		
		while(valor > 0){
			JOptionPane.showInternalMessageDialog(null, "Conta de "+tipoConta+ " é de valor "+valor);
			numeroContas++;
			valorTotal = valorTotal + valor;
			tipoConta = JOptionPane.showInputDialog(null, "Insira o nome da conta:");
			valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira seu valor: "));

		
		}
		JOptionPane.showInternalMessageDialog(null, "O número de contas a pagar é "+numeroContas+" Totalizando o valor de R$"+valorTotal);
	}

}
