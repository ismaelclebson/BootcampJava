package secao4.com.abctreinamentos;

import java.util.HashSet;
import java.util.Set;

public class Cliente {
	
	Set<Curso> cursos;

	public static void main(String[] args) {
		Curso java8 = new Curso("java8");
		Curso oracle12c = new Curso("oracle12c");
		
		Set<Curso> cursosA = new HashSet<>();
		Set<Curso> cursosB = new HashSet<>();
		
		cursosA.add(java8);
		cursosA.add(oracle12c);
	
		cursosB.add(java8);
		
		//interseção
		cursosB.retainAll(cursosA);
		System.out.println("A - B");
		System.out.println(cursosB);
		
		Cliente A = new Cliente();
		A.setCursos(cursosA);
		Cliente B = new Cliente();
		B.setCursos(cursosB);
		
		System.out.println(A.getCursos());
		System.out.println(B.getCursos());
	}

	public Set<Curso> getCursos() {
		return cursos;
	}

	public void setCursos(Set<Curso> cursos) {
		this.cursos = cursos;
	}


	
	
}

