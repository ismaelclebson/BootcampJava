package secao4_2;

public class Professor extends Funcionario implements Autenticavel, Cidadao, Contribuinte{
	
	@Override
	public void getBonificacao() {
		
	
	}

	@Override
	public void pagaIR() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getCPF() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getRG() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean autentica(String senha) {
		// TODO Auto-generated method stub
		return false;
	}

}
