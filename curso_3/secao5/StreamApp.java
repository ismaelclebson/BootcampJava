package secao5;

import java.util.ArrayList;
import java.util.List;

public class StreamApp {
	
	static List<String> funcionarios;
	
	public static void filtrar(String letra) {
		funcionarios.stream().filter(s -> s.startsWith(letra)).forEach(System.out::println);
	}
	public static void ordenar(String letra) {
		funcionarios.stream().sorted().filter(s -> s.startsWith(letra)).forEach(System.out::println);
	}
	public static void contar(String letra) {
		long contador = funcionarios.stream().filter(s -> s.startsWith(letra)).count();
		System.err.println(contador);
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
		contar("P");

	}

}
