package secao_u.com.netbiis.lojavirtual.DAO;

import java.nio.file.Path;

public class Curso {
	int cdcurso;
	String nome;
	float valor;
	String url;

	

	
	public Curso(int cdcurso, String nome, float valor, String url) {
		super();
		this.cdcurso = cdcurso;
		this.nome = nome;
		this.valor = valor;
		this.url = url;
	}





    public int getCdcurso() {
		return cdcurso;
	}




	public void setCdcurso(int cdcurso) {
		this.cdcurso = cdcurso;
	}




	public String getNome() {
		return nome;
	}




	public void setNome(String nome) {
		this.nome = nome;
	}




	public float getValor() {
		return valor;
	}




	public void setValor(float valor) {
		this.valor = valor;
	}




	public String getUrl() {
		return url;
	}




	public void setUrl(String url) {
		this.url = url;
	}




    @Override
    public String toString() {
        return "Curso2[cdCurso="+cdcurso+" nome='"+nome+"' valor="+valor+" url='"+url+"']";
    }

}
