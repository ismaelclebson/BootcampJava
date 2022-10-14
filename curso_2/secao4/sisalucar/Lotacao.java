package secao4_2.sisalucar;

import java.time.LocalDate;

public class Lotacao {
	private int idLotacao;
	private int idCarro;
	private int idCliente;
	private float valorLocado;
	private LocalDate dataInicio;
	private LocalDate dataFim;
	
	
	
	
	public int getIdLotacao() {
		return idLotacao;
	}


	public void setIdLotacao(int idLotacao) {
		this.idLotacao = idLotacao;
	}


	public int getIdCarro() {
		return idCarro;
	}


	public void setIdCarro(int idCarro) {
		this.idCarro = idCarro;
	}


	public int getIdCliente() {
		return idCliente;
	}


	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}


	public float getValorLocado() {
		return valorLocado;
	}


	public void setValorLocado(float valorLocado) {
		this.valorLocado = valorLocado;
	}


	public LocalDate getDataInicio() {
		return dataInicio;
	}


	public void setDataInicio(LocalDate dataInicio) {
		this.dataInicio = dataInicio;
	}


	public LocalDate getDataFim() {
		return dataFim;
	}


	public void setDataFim(LocalDate dataFim) {
		this.dataFim = dataFim;
	}


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
