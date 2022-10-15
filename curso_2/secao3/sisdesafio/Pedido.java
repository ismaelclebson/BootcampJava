package secao3_2.sisdesafio;

public class Pedido {
	Cliente cliente;
	Produto produto[];
	float valorvenda;
	
	public Pedido(Cliente cliente, Produto[] produto) {
		super();
		this.cliente = cliente;
		this.produto = produto;

	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Produto[] getProduto() {
		return produto;
	}

	public void setProduto(Produto[] produto) {
		this.produto = produto;
	}

	public float getValorvenda() {
		return valorvenda;
	}

	public void setValorvenda(float valorvenda) {
		this.valorvenda = valorvenda;
	}
	
	public float calcularVendaCliente(){
		for(Produto produto: this.produto)
			this.valorvenda = this.valorvenda + produto.getValor();
		return this.valorvenda;
	}
	
}
