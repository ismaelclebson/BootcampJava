package secao4_2;

public class Funcionario {
	
	public static void main(String[] args) {
		Funcionario joao = new Funcionario();
		Funcionario antonio = new Professor();
		Funcionario andrea = new Administrativo();
		Funcionario pedro = new Diretor();
		pedro.verificarTipoFuncionario(pedro);
	}
	
	void verificarTipoFuncionario(Funcionario objeto) {
		
		if (objeto instanceof Diretor)
			System.out.println("Diretor");
		else if (objeto instanceof Professor)
			System.out.println("Professor");
		else
			System.out.println("Administrativo");
	}
}
