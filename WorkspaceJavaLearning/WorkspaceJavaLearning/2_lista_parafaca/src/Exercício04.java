import javax.swing.JOptionPane;
public class Exercício04 {

	public static void main(String[] args) {
		
		int firstNumber;
		int secondNumber;
		int resultado;
		long soma=0;
		
		firstNumber = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro número do intervalo de números: "));
		secondNumber = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo número do intervalo de números: "));
		
		if(firstNumber<0 || secondNumber<0) {
			JOptionPane.showMessageDialog(null, "Há algo de errado com o intervalo informado! Tente novamente!");
		}else {
			for(int i=firstNumber; i <= secondNumber; i++) {
				
				resultado = i%2;
				
				if(resultado==0) {
					soma += i;
				}
				
			}
			
			JOptionPane.showMessageDialog(null, "Soma dos valores pares presentes no intervalo de " + firstNumber + " até " + secondNumber + ":  " + soma);
			
		}

	}

}
