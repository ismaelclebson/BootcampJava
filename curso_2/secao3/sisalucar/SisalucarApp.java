package secao3_2.sisalucar;

import java.time.LocalDate;

public class SisalucarApp {
	
	static int totalCarros = 0;

	public static void main(String[] args) {
		Carro carro1 = new Carro();
		carro1.idCarro = 1;
		carro1.modelo = "gol";
		carro1.placa = "jdk-0001";
		carro1.cor = "Vermelho";
		carro1.ano = 2013;
		carro1.valorDiaria = 99.90f;
		carro1.fabricante = "volkswagem";
		
		totalCarros = totalCarros +1;
		
		//Carro carro2 = new Carro();
		
		Cliente cliente1 = new Cliente();
		cliente1.idCliente = 1;
		cliente1.cpf = "12345678-90";
		cliente1.nome = "Pedro Luiz";
		cliente1.cnh = "XYZ0001";
		
		//Cliente cliente2 = new Cliente();
		SisalucarApp sisalucar = new SisalucarApp();
		sisalucar.realizarLocacao(carro1.idCarro, cliente1.idCliente, carro1.valorDiaria);
		gerarRelatorioLocacao(carro1, LocalDate.now(), LocalDate.now().plusDays(5));
	}
	public void realizarLocacao(int idCarro, int idCliente, float valorDiaria) {
		Lotacao locacao = new Lotacao();
		locacao.idCarro=idCarro;
		locacao.idCliente=idCliente;
		locacao.idLotacao=1;
		locacao.dataInicio=LocalDate.now();
		locacao.dataFim=LocalDate.now().plusDays(2);
		locacao.valorLocado=2*valorDiaria;
	}
	public static void gerarRelatorioLocacao(Carro carro1, LocalDate ...datas) {
		float totalFaturado = carro1.valorDiaria;
	}

}
