package com.netbiis.sisrestaurante;

public class Pedido{
	long idPedido;
	long idCliente;
	float valorTotal;
	float valorPrato;
	String formaPagamento;
	
	
	public Pedido(long idPedido, long idCliente, float valorTotal, float valorPrato, String formaPagamento) {
		super();
		this.idPedido = idPedido;
		this.idCliente = idCliente;
		this.valorTotal = valorTotal;
		this.valorPrato = valorPrato;
		this.formaPagamento = formaPagamento;
	}


	public long getIdPedido() {
		return idPedido;
	}


	public void setIdPedido(long idPedido) {
		this.idPedido = idPedido;
	}


	public long getIdCliente() {
		return idCliente;
	}


	public void setIdCliente(long idCliente) {
		this.idCliente = idCliente;
	}


	public float getValorTotal() {
		return valorTotal;
	}


	public void setValorTotal(float valorTotal) {
		this.valorTotal = valorTotal;
	}


	public float getValorPrato() {
		return valorPrato;
	}


	public void setValorPrato(float valorPrato) {
		this.valorPrato = valorPrato;
	}


	public String getFormaPagamento() {
		return formaPagamento;
	}


	public void setFormaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
	}

	
	
}
