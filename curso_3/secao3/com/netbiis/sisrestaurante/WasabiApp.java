package secao3.com.netbiis.sisrestaurante;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;

public class WasabiApp {


	public static void main(String[] args) {

		WasabiAppDAO<Cliente> tbClientes = new WasabiAppDAO<>();
		WasabiAppDAO<Produto> tbProdutos = new WasabiAppDAO<>();
		WasabiAppDAO<Pedido> tbPedidos = new WasabiAppDAO<>();

		Cliente cliente1 = new Cliente(1, "Clebson Silva", "Passagem Elvira", "0009.495.372-41");
		tbClientes.gravarCliente(cliente1);

		
		Produto produto1 = new Produto(1, "imagen1.jpg", 35f, "Combo 2 de peixe", "arroz, feijao, farofa e filé");
		Produto produto2 = new Produto(2, "imagen2.jpg", 40f, "Combo 1 de Temaki", "arroz, feijao, farofa e bife");
		Produto produto3 = new Produto(3, "imagen3.jpg", 60f, "Combo 5 Rodizio", "Todos tipos de sushi e hotsushi");
		Produto produto4 = new Produto(4, "imagen4.jpg", 120f, "Combo 3 Cadeirada", "Ovos, caldo, peixe, camarao...");
		//Produto lista_produtos[] = {produto1, produto2, produto3, produto4};
		LinkedHashSet<Produto> listaProdutos = new LinkedHashSet<>();
		listaProdutos.add(produto1);
		listaProdutos.add(produto2);
		listaProdutos.add(produto3);
		listaProdutos.add(produto4);
		
		tbProdutos.gravarProduto(listaProdutos);

		Pedido pedido1 = new Pedido(1, cliente1, listaProdutos, "Dinheiro");

		tbPedidos.gravarPedido(pedido1);

	}
	
}


