/*************************/
package com.netbiis.sislanches;
/******************************/
/**
 * <h1>Produto</h1>
 * Este programa implementa classe Produto com seus contrutor e metodos gets e sets.
 * <p>
 * 
 * @author clebson.silva
 * @version 1.0
 * @since 18-10-2022
 */
/*************************/
public class Produto {
/*************************/
	/**
	 * Método
	 * @param idProduto
	 * @param nomePrato
	 * @param valor
	 * @param descricao
	 */
	private long idProduto;
	private String nomePrato;
	private float valor;
	private String descricao;
	

	public Produto(long idProduto, String nomePrato, float valor, String descricao) {

		super();
		this.idProduto = idProduto;
		this.nomePrato = nomePrato;
		this.valor = valor;
		this.descricao = descricao;
		
	}

	
	public long getIdProduto() {
		return idProduto;

	}


	public void setIdProduto(long idProduto) {
		this.idProduto = idProduto;
	}


	public String getNomePrato() {
		return nomePrato;
	}


	public void setNomePrato(String nomePrato) {
		this.nomePrato = nomePrato;
	}


	public float getValor() {
		return valor;
	}


	public void setValor(float valor) {
		this.valor = valor;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
	
	
	
}
