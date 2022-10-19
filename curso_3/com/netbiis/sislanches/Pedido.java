/******************************/
package com.netbiis.sislanches;
/******************************/
/**
 * <h1>Pedido</h1>
 * Este programa implementa classe pedido com seus contrutor e metodos gets e sets.
 * <p>
 * 
 * @author clebson.silva
 * @version 1.0
 * @since 18-10-2022
 */
/*************************/
public class Pedido {
/******************************/

	Cliente cliente;
	Produto produto[];
	float valorvenda;
	/**
	 * 
	 * @param cliente
	 * @param produto
	 */
	
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
