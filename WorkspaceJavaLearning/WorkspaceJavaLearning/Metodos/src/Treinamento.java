import javax.swing.JOptionPane;

public class Treinamento {

	public static void main(String[] args) {
		
		double peso = Double.parseDouble(JOptionPane.showInputDialog("Informe seu peso:"));
		
		while (peso<=0) {
			mostraErroPeso();
			peso = Integer.parseInt(JOptionPane.showInputDialog("Informe seu peso:"));
		}
		
		double altura = Double.parseDouble(JOptionPane.showInputDialog("Informe a sua altura:"));
		
		while (altura<=0) {
			mostraErroAltura();
			altura = Double.parseDouble(JOptionPane.showInputDialog("Informe a sua altura:"));
		}
		
		double imc = calculaIndice(peso, altura);
		verificaIndice(imc);

	}
	
public static double calculaIndice (double peso, double altura) {
	
	double imc = peso /(altura*altura);
	return imc;
}

public static void verificaIndice (double imc) {
	
	if (imc<17) {
		JOptionPane.showMessageDialog(null, "Voc� est� muito abaixo do peso! �ndice: "+ String.format("%.2f", imc));
	}else if (imc==17 || imc<=18.49) {
		JOptionPane.showMessageDialog(null, "Voc� est� abaixo do peso! �ndice: "+ String.format("%.2f", imc));
	}else if (imc<=24.99) {
		JOptionPane.showMessageDialog(null, "Voc� est� com o peso adequado! �ndice: "+ String.format("%.2f", imc));
	}else if (imc<=29.99) {
		JOptionPane.showMessageDialog(null, "Voc� est� acima do peso! �ndice: "+ String.format("%.2f", imc));
	}else if (imc<=34.99) {
		JOptionPane.showMessageDialog(null, "Voc� est� com obesidade tipo I! �ndice: "+String.format("%.2f", imc));
	}else if (imc<=39.99) {
		JOptionPane.showMessageDialog(null, "Voc� est� com obesidade tipo II! �ndice: "+ String.format("%.2f", imc));
	}else if (imc>=40) {
		JOptionPane.showMessageDialog(null, "Voc� est� com obesidade tipo III! �ndice: "+ String.format("%.2f", imc));
	}
}

public static void mostraErroPeso() {
	JOptionPane.showMessageDialog(null, "O peso digitado � inv�lido!");
}

public static void mostraErroAltura() {
	JOptionPane.showMessageDialog(null, "O peso digitado � inv�lido!");
}

}
