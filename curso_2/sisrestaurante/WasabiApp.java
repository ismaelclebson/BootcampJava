package com.netbiis.sisrestaurante;

public class WasabiApp {

    static float valorFrete = 20.00f;

    public static void main(String[] args) {

        Promocao combo1 = new Promocao(1L, "Farto", 75.00f, "Combo Infarto", "Serve duas pessoas");

        Cliente cliente1 = new Cliente(1L, "Clebson Ismael", "Passagem Elvira", "009.457.896-45");

        WasabiApp wasabiapp = new WasabiApp();
        wasabiapp.realizarPedido(combo1.getNomeProduto(),valorFrete,combo1.getPreco());
        System.out.print("Nome do produto selecionado: " + combo1.getNomeProduto() + "\n" + "Nome do cliente: "
                + cliente1.getNome());

    }

    public float addProduto(float valorTotal, float valorPrato) {
    	valorTotal = valorTotal + valorPrato;
        System.out.print("Valor do pedido com adição de mais um produto: " + valorTotal + "\n");
        return valorTotal;
    }

    public float removerProduto(float valorTotal, float valorPrato) {
        valorTotal = valorTotal - valorPrato;
        System.out.print("Valor do pedido com redução um produto: " + valorPrato + "\n");
        return valorTotal;
    }

    public void realizarPedido(String nomeProduto, float valorFrete, float valorPrato) {
        float valorTotal=0;
		Pedido pedido1 = new Pedido(1L, 1L, valorTotal, valorPrato, "Dinheiro");
        //pedido1.setValorTotal(valorTotal + valorFrete);
        valorTotal = addProduto(valorTotal, valorPrato);
        valorTotal = removerProduto(valorTotal, valorPrato);
        pedido1.setValorTotal(valorTotal + valorFrete);
        if (valorTotal >= 20)
        //pedido1.setValorTotal(1);
        	System.out.print("Valor total do pedido com o frete: " + pedido1.getValorTotal() + "\n");
        else
        	System.out.println("Nenhum produto escolhido!");
    }

}


