package secao5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StreamApp {
	
	static List<String> funcionarios;
	static int cont = 0;
	
	public static void filtrar(String letra) {
		funcionarios.forEach(s->{
			if (s.startsWith(letra))
				System.out.println(s);
				
		});
		//funcionarios.stream().filter(s -> s.startsWith(letra)).forEach(System.out::println);
	}
	public static void ordenar(String letra) {
		Collections.sort(funcionarios);
		funcionarios.forEach(s->{
		if (s.startsWith(letra))
				System.out.println(s);
		});
		//funcionarios.stream().sorted().filter(s -> s.startsWith(letra)).forEach(System.out::println);
	}
	public static void contar(String letra) {
		
		//long contador = funcionarios.stream().filter(s -> s.startsWith(letra)).count();
		funcionarios.forEach(s -> {
		if (s.startsWith(letra))
			cont++;
		});
		System.out.println(cont);
		//System.err.println(contador);
	}

	public static void main(String[] args) {
		
		funcionarios = new ArrayList<>();
		funcionarios.add("Clebson");
		funcionarios.add("José");
		funcionarios.add("Alan");
		funcionarios.add("Luis");
		funcionarios.add("Alana");
		funcionarios.add("Pedro");
		funcionarios.add("João");
		//filtrar("C");
		//ordenar("A");
		contar("C");

	}

}
