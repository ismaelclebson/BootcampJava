package secao3_2.sisdesafio;

public class Cliente {
	
	private long idCliente;
	private String nome;
	private String endereco;
	
	
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
