package secao4_2.sisalucar;

public class Carro extends Veiculo {

	private int idCarro;
	private String placa;
	private String fabricante;
	private String modelo;
	private int ano;
	private String cor;
	private float valorDiaria;
	
	
	
	public int getIdCarro() {
		return idCarro;
	}

	public void setIdCarro(int idCarro) {
		this.idCarro = idCarro;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public float getValorDiaria() {
		return valorDiaria;
	}

	public void setValorDiaria(float valorDiaria) {
		this.valorDiaria = valorDiaria;
	}

	public Carro(int idCarro, String placa, String fabricante, String modelo, int ano, String cor, float valorDiaria) {
		super();
		this.idCarro = idCarro;
		this.placa = placa;
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.ano = ano;
		this.cor = cor;
		this.valorDiaria = valorDiaria;
	}
	
	public Carro(){
		
	}
	
	public int getPassageiro() {
		return 4;
	}
	public void acelera(int limiteVelocidade) {
		System.out.println("Obedeça o limite de velocidade que é "+limiteVelocidade);
	}
	
	public static void main(String[] args) {
		
		Carro carro1 = new Carro(1, "AVC-001", "volkswagen", "luxo", 2001, "preto", 99.90f);
		Carro carro2 = new Carro();

		carro1.acelera();
		carro1.freia();
		carro1.getPassageiro();
		carro1.getVelocidade();
		carro1.autonomia = 40;
	}
	
}
