package secao4_2;

import javax.swing.JOptionPane;

public class ValorGorjeta {

    static GorjetaGarcom ValorGorjeta;

    public static void main(String[] args) {
    	
    	double conta = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o valor da conta"));
    	
        Object selectedValue = JOptionPane.showInputDialog(null, "Qualidade do serviço", "Gorjeta",
                JOptionPane.INFORMATION_MESSAGE, null, GorjetaGarcom.values(), GorjetaGarcom.Excelente);

        ValorGorjeta = (GorjetaGarcom) selectedValue;

        double gorjeta = 5;

        switch (ValorGorjeta) {
            case Ruim -> gorjeta = ValorGorjeta.getValor();
            case Regular -> gorjeta = ValorGorjeta.getValor();
            case Bom -> gorjeta = ValorGorjeta.getValor();
            case Excelente -> gorjeta = ValorGorjeta.getValor(); 
        }
        JOptionPane.showMessageDialog(null, gorjeta*conta);
    

}

}
