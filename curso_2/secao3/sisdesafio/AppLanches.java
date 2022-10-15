package secao3_2.sisdesafio;

import javax.swing.JOptionPane;

public class AppLanches {

	public static void main(String[] args) {
		
		float vendaTotal = 0;
		float vendaCliente = 0;
		// 1 pedido
		Produto[] produtoPrimeiroCliente = new Produto[2];
		
		Cliente primeiroCliente = new Cliente(1L, "Clebson Ismael", "Passagem Elvira, 436");
		produtoPrimeiroCliente[0] = new Produto(1L, "Açaí",10.00f, "Médio");
		produtoPrimeiroCliente[1] = new Produto(2L, "Coxinha",3.00f, "Médio");

		Pedido pedidoPrimeiroCliente = new Pedido(primeiroCliente, produtoPrimeiroCliente);
		vendaCliente = pedidoPrimeiroCliente.calcularVendaCliente();
		
		JOptionPane.showInternalMessageDialog(null, "Valor total do primeiro cliente é "+vendaCliente);
		
		vendaTotal = vendaTotal + vendaCliente;
		
		JOptionPane.showInternalMessageDialog(null, "Valor total da venda do restaurante é "+vendaTotal);
	}

}
