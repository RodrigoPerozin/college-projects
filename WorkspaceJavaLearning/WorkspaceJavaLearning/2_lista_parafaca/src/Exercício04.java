import javax.swing.JOptionPane;
public class Exerc�cio04 {

	public static void main(String[] args) {
		
		int firstNumber;
		int secondNumber;
		int resultado;
		long soma=0;
		
		firstNumber = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro n�mero do intervalo de n�meros: "));
		secondNumber = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo n�mero do intervalo de n�meros: "));
		
		if(firstNumber<0 || secondNumber<0) {
			JOptionPane.showMessageDialog(null, "H� algo de errado com o intervalo informado! Tente novamente!");
		}else {
			for(int i=firstNumber; i <= secondNumber; i++) {
				
				resultado = i%2;
				
				if(resultado==0) {
					soma += i;
				}
				
			}
			
			JOptionPane.showMessageDialog(null, "Soma dos valores pares presentes no intervalo de " + firstNumber + " at� " + secondNumber + ":  " + soma);
			
		}

	}

}
