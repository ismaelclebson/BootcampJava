package secao4.com.ClienteCurso;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class LojaVirtual {
	
	static Map<Cliente, List<Curso>> pagamentos = new HashMap<>();
	
	public static void main(String[] args) {
		Curso java8 = new Curso(1, "Java 8 para web", 2000, Paths.get("/java8"));
		Curso oracle12c = new Curso(2, "Oracle 12C", 2500, Paths.get("/oracle12c"));
		Curso php7 = new Curso(3, "Php 4", 1500, Paths.get("/php7"));
		
		
		Cliente clebson = new Cliente("123.456.789-00", "Clebson Silva","lombada@gmail.com");
		Cliente antonio = new Cliente("123.456.789-00", "Antonio Silva","lombada@gmail.com");
		Cliente alana = new Cliente("123.456.789-00", "Alana Silva","lombada@gmail.com");
		Cliente cizina = new Cliente("123.456.789-00", "Cizina Silva","lombada@gmail.com");
		Cliente ismael = new Cliente("123.456.789-00", "Ismael Silva","lombada@gmail.com");
		List<String> clientesList = new LinkedList<>();
		clientesList.add(clebson.getNome());
		clientesList.add(antonio.getNome());
		clientesList.add(alana.getNome());
		clientesList.add(cizina.getNome());
		clientesList.add(ismael.getNome());

		
		List<Curso> cursosClebson = new LinkedList<>();
		
		Scanner entrada = new Scanner(System.in);
		int opcao = 0;
		while(opcao!=4) {
			System.out.println("Qual o curso deseja adquirir: [1 - Java8], [2 - Oracle12c], [3 - php7]");
			opcao = entrada.nextInt();
			if(opcao==1)
				cursosClebson.add(java8);
			else if(opcao==2)
				cursosClebson.add(oracle12c);
			else if(opcao==3)
				cursosClebson.add(php7);
			else
				opcao=4;
			
		}
		entrada.close();
		
		filtrar("C",clientesList);
		ordenar("C",clientesList);
		contar("C",clientesList);
		
		
		cursosClebson.forEach(System.out::println);
		//cursosClebson.forEach(s -> System.out.println(s));
		
		pagamentos.put(clebson, cursosClebson);
		System.out.println(pagamentos);
		
	}
	
	public static void filtrar(String letra, List<String> clientesList) {

		clientesList.stream().filter(s -> s.startsWith(letra)).forEach(System.out::println);
	}
	public static void ordenar(String letra, List<String> clientesList) {

		clientesList.stream().sorted().filter(s -> s.startsWith(letra)).forEach(System.out::println);
	}
	public static void contar(String letra, List<String> clientesList) {
		
		long contador = clientesList.stream().filter(s -> s.startsWith(letra)).count();

		System.err.println(contador);
	} 

}
