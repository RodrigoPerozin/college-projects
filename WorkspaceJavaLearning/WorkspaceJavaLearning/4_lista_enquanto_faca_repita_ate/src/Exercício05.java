import javax.swing.JOptionPane;
public class Exerc�cio05 {

	public static void main(String[] args) {
		
		int numberOne;
		int numberTwo;
		int soma=0;
		int somaInf=0;
		
		numberOne = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro n�mero: "));
		numberTwo = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo n�mero: "));
		soma = numberOne + numberTwo;
		
		do{
		
			System.out.print(soma + "\n");
			
			somaInf = Integer.parseInt(JOptionPane.showInputDialog("Informe a soma dos dois n�meros que voc� informou: "));
			
			if(somaInf!=soma) {
				JOptionPane.showMessageDialog(null, "Tente novamente!");
			}
			
		} while(somaInf!=soma);

		JOptionPane.showMessageDialog(null, "Resultado correto!");
		
	}

}
