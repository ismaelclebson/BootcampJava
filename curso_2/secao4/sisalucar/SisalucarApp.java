package secao4_2.sisalucar;

import java.time.LocalDate;

public class SisalucarApp {
	
	static int totalCarros = 0;

	public static void main(String[] args) {
		Carro carro1 = new Carro();
		carro1.idCarro = 1;
		carro1.modelo = "gol";
		carro1.placa = "jdk-0001";
		carro1.setCor("Vermelho");
		carro1.setAno(2013);
		carro1.setValorDiaria(99.90f);
		carro1.setFabricante("volkswagem");
		
		totalCarros = totalCarros +1;
		
		//Carro carro2 = new Carro();
		
		Cliente cliente1 = new Cliente();
		cliente1.setIdCliente(1);
		cliente1.setCpf("12345678-90");
		cliente1.setNome("Pedro Luiz");
		cliente1.setCnh("XYZ0001");
		
		//Cliente cliente2 = new Cliente();
		SisalucarApp sisalucar = new SisalucarApp();
		sisalucar.realizarLocacao(carro1.idCarro, cliente1.getIdCliente(), carro1.getValorDiaria());
		gerarRelatorioLocacao(carro1, LocalDate.now(), LocalDate.now().plusDays(5));
	
	}
	public void realizarLocacao(int idCarro, int idCliente, float valorDiaria) {
		Lotacao locacao = new Lotacao();
		locacao.setIdCarro(idCarro);
		locacao.setIdCliente(idCliente);
		locacao.setIdLotacao(1);
		locacao.setDataInicio(LocalDate.now());
		locacao.setDataFim(LocalDate.now().plusDays(2));
		locacao.setValorLocado(2*valorDiaria);
	}
	public static void gerarRelatorioLocacao(Carro carro1, LocalDate ...datas) {
		float totalFaturado = carro1.getValorDiaria();
	}

}
