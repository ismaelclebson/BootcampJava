package secao4_2;

public enum GorjetaGarcom {
    Ruim(0), Regular(0.18), Bom(0.2), Excelente(0.22);

    double valor;

    private GorjetaGarcom(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
	
}
