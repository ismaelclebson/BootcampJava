package secao3_2.sisalucar;

import java.time.LocalDate;

public class Lotacao {
	int idLotacao;
	int idCarro;
	int idCliente;
	float valorLocado;
	LocalDate dataInicio;
	LocalDate dataFim;
	
	
	public Lotacao(int idLotacao, int idCarro, int idCliente, float valorLocado, LocalDate dataInicio,
			LocalDate dataFim) {
		super();
		this.idLotacao = idLotacao;
		this.idCarro = idCarro;
		this.idCliente = idCliente;
		this.valorLocado = valorLocado;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
	}
	
	
	public Lotacao() {
		
	}
	
}
