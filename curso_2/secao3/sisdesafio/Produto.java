package secao3_2.sisdesafio;

public class Produto {
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
