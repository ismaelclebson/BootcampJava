package com.netbiis.sisrestaurante;

public class Produto {

	long idProduto;
	String imagem;
	float preco;
	String nomeProduto;
	String descricao;
	
	
	public Produto(long idProduto, String imagem, float preco, String nomeProduto, String descricao) {
		super();
		this.idProduto = idProduto;
		this.imagem = imagem;
		this.preco = preco;
		this.nomeProduto = nomeProduto;
		this.descricao = descricao;
	}



	public long getIdProduto() {
		return idProduto;
	}


	public void setIdProduto(long idProduto) {
		this.idProduto = idProduto;
	}


	public String getImagem() {
		return imagem;
	}


	public void setImagem(String imagem) {
		this.imagem = imagem;
	}


	public float getPreco() {
		return preco;
	}


	public void setPreco(float preco) {
		this.preco = preco;
	}


	public String getNomeProduto() {
		return nomeProduto;
	}


	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
	
}
