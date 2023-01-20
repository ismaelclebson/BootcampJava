package secao_u.com.netbiis.lojavirtual.DAO;

public class Cliente {
    long cpf;
	String nome;
	String email;
	
	
	public Cliente(long cpf, String nome, String email) {
		super();
		this.cpf = cpf;
		this.nome = nome;
		this.email = email;
	}


	public long getCpf() {
		return cpf;
	}


	public void setCpf(long cpf) {
		this.cpf = cpf;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "Cliente [ cpf="+cpf+" nome= "+nome +" email= "+email+" ]";
	}
}
