import javax.swing.JOptionPane;
public class Exercício03 {

	public static void main(String[] args) {
		
		int numberOne;
		int choose;
		int numberEven;
		int otherNumber=0;
		String result="";
		
		numberOne = Integer.parseInt(JOptionPane.showInputDialog("Infome um número: "));
		
		do {
		
			choose = Integer.parseInt(JOptionPane.showInputDialog("Menu de Interações:\n\n"
			+ "1 - Verificar se o número é múltiplo de algum outro número.\n"
			+ "2 - Verificar se o número é par.\n"
			+ "3 - Verificar se o número está entre 0 e 1000.\n"
			+ "4 - Sair."));
			
			switch(choose) {
				
				case 1:
					
					otherNumber = Integer.parseInt(JOptionPane.showInputDialog("Informe o 'outro número': "));
					if((numberOne%otherNumber)==0) {
						result = "Sim, o número " + numberOne + " é múltiplo de " + otherNumber;
					}else {
						result = "Não, o número " + numberOne + " não é múltiplo de " + otherNumber;
					}
					
				break;
				
				case 2:
					
					numberEven = numberOne % 2;
					if(numberEven==0) {
						result = "O número é par!";
					}else {
						result = "O número não é par!";
					}
					
				break;
				
				case 3:
					
					if(numberOne >=0 && numberOne <=1000) {
						result = "O número " + numberOne + " está no intervalo de 0 a 1000!";
					}else {
						result = "O número " + numberOne + " não está no intervalo de 0 a 1000!";
					}
					
				break;
				
				case 4:
					System.exit(0);
				break;
				
				default:
					
					result = "Escolha um item que esteja no menu!";
			
			}
			
			JOptionPane.showMessageDialog(null, result);

		} while (choose!=4);
	}

}
