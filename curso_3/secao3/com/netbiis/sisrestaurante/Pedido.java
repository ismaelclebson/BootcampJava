package secao3.com.netbiis.sisrestaurante;

import java.util.LinkedHashSet;

public class Pedido{
	long idPedido;
	Cliente cliente;
	//Produto produto[];
	private LinkedHashSet<Produto> listaProdutos;
	String formaPagamento;
	













	public Pedido(long idPedido, Cliente cliente, LinkedHashSet<Produto> listaProdutos, String formaPagamento) {
		super();
		this.idPedido = idPedido;
		this.cliente = cliente;
		this.listaProdutos = listaProdutos;
		this.formaPagamento = formaPagamento;
	}








	public long getIdPedido() {
		return idPedido;
	}








	public void setIdPedido(long idPedido) {
		this.idPedido = idPedido;
	}








	public Cliente getCliente() {
		return cliente;
	}







	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}







	public LinkedHashSet<Produto> getListaProduto() {
		return listaProdutos;
	}






	public void setProduto(LinkedHashSet<Produto> listaProdutos) {
		this.listaProdutos = listaProdutos;
	}







	public String getFormaPagamento() {
		return formaPagamento;
	}






	public void setFormaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
	}





	
	
}
