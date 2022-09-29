package secao5;

public record Contato(String nome, String fone, String cidade) {
	
	public static void main(String[] args) {
		Contato alunos = new Contato("Clebson","91988220909","Belém");
		System.out.println(alunos.nome);
		System.out.println(alunos.fone);
		System.out.println(alunos.cidade);
		
	}

}
