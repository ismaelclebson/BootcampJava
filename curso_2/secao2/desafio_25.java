package secao2_2;

public class desafio_25 {

	public class Cliente {
		String idCliente;
		String nome;
		String endereco;
		String telefone;
		String email;
		
		public void fazerPedido() {}
		
		public void cancelarPedido() {}
		

	}
	
	public class Produto{
		int idProduto;
		String nomeProduto;
		String imagem;
		float preco;
		float peso;
		int quantidadeDisponivel;
		
		public void consultarDisponibilidade() {}
		
		public void adicionarEstoque() {}
		
		public void removerEstoque() {}
	
	}
	
	public class Pedido{
		int idPedido;
		int idCliente;
		int idProduto;
		int valorTotal;
		String formaPagamento;
		String observacoes;
		
		public void adicionarProduto() {}
		
		public void removerProduto() {}
		
		public void consultarProduto() {}
		
		public void listaPedido() {}
		
		public void concluirPedido() {}
		
		public void cancelarPedido() {}
		
		
		
	}

}
