import javax.swing.JOptionPane;
public class Exercício05 {

	public static void main(String[] args) {
		
		int numberOne;
		int numberTwo;
		int soma=0;
		int somaInf=0;
		
		numberOne = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro número: "));
		numberTwo = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo número: "));
		soma = numberOne + numberTwo;
		
		do{
		
			System.out.print(soma + "\n");
			
			somaInf = Integer.parseInt(JOptionPane.showInputDialog("Informe a soma dos dois números que você informou: "));
			
			if(somaInf!=soma) {
				JOptionPane.showMessageDialog(null, "Tente novamente!");
			}
			
		} while(somaInf!=soma);

		JOptionPane.showMessageDialog(null, "Resultado correto!");
		
	}

}
