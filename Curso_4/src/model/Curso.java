package model;
// Generated 12 de nov. de 2022 19:24:24 by Hibernate Tools 4.3.6.Final

/**
 * Curso generated by hbm2java
 */
public class Curso implements java.io.Serializable {

	private int idCurso;
	private String nome;
	private String url;

	public Curso() {
	}

	public Curso(int idCurso, String nome, String url) {
		this.idCurso = idCurso;
		this.nome = nome;
		this.url = url;
	}

	public int getIdCurso() {
		return this.idCurso;
	}

	public void setIdCurso(int idCurso) {
		this.idCurso = idCurso;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}
