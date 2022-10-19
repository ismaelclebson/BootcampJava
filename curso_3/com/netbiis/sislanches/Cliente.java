/******************************/
package com.netbiis.sislanches;
/******************************/
/**
 * <h1>Cliente</h1>
 * Este programa implementa classe cliente com seus contrutor e metodos gets e sets.
 * <p>
 * 
 * @author clebson.silva
 * @version 1.0
 * @since 18-10-2022
 */
/*************************/
public class Cliente {
/*************************/
	
	private long idCliente;
	private String nome;
	private String endereco;
	/**
	 * @param idCliente
	 * @param nome
	 * @param endereco
	 */
	
	
	public Cliente(long idCliente, String nome, String endereco) {
		super();
		this.idCliente = idCliente;
		this.nome = nome;
		this.endereco = endereco;
	
	}


	public long getIdCliente() {
		return idCliente;
	}


	public void setIdCliente(long idCliente) {
		this.idCliente = idCliente;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEndereco() {
		return endereco;
	}


	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	
	
	
}
