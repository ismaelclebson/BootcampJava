package secao4.com.ClienteCurso;

import java.nio.file.Path;

public class Curso {
	int cdcurso;
	String nome;
	float valor;
	Path url;

	

	
	public Curso(int cdcurso, String nome, float valor, Path url) {
		super();
		this.cdcurso = cdcurso;
		this.nome = nome;
		this.valor = valor;
		this.url = url;
	}




	@Override
	public String toString(){
		return "Curso [ nome= "+nome +" ]";
	}

}
