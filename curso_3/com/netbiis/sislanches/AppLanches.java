/******************************/
package com.netbiis.sislanches;
import javax.swing.JOptionPane;
/******************************/
/**
 * <h1>AppLahnces</h1>
 * Este programa implementa a main para execução das classes e métodos do sistema APPlanches.
 * <p>
 * 
 * @author clebson.silva
 * @version 1.0
 * @since 18-10-2022
 */
/*************************/
public class AppLanches {
/*************************/
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
