package secao2_2;

import javax.swing.JOptionPane;

public class desafio_24 {

	public static void main(String[] args) {
		int numero1, numero2;
		String operacoes[] = {"ADICAO","SUBTRACAO","MULTIPLICACAO","DIVISAO"};
		numero1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o primeiro numero"));
		numero2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o segundo numero"));
		
		Object opcao = JOptionPane.showInputDialog(null, "Qual a operação?", "Calculadora",
				JOptionPane.QUESTION_MESSAGE, null, operacoes, "");
		
		JOptionPane.showMessageDialog(null, switch ((String) opcao){
		case "ADICAO" -> numero1 + numero2;
		case "SUBTRACAO" -> numero1 - numero2;
		case "MULTIPLICACAO" -> numero1 * numero2;
		case "DIVISAO" -> {
			if (numero2!=0) {
				double resultado = (double)numero1 / numero2;
				yield resultado;
			}else {
				double resultado = -1;
				yield resultado;
			}
		}
		default -> "Ocorreu algum problema...";
		});

	}
}
