import javax.swing.JOptionPane;
public class Exerc�cio03 {

	public static void main(String[] args) {
		
		int numberOne;
		int choose;
		int numberEven;
		int otherNumber=0;
		String result="";
		
		numberOne = Integer.parseInt(JOptionPane.showInputDialog("Infome um n�mero: "));
		
		do {
		
			choose = Integer.parseInt(JOptionPane.showInputDialog("Menu de Intera��es:\n\n"
			+ "1 - Verificar se o n�mero � m�ltiplo de algum outro n�mero.\n"
			+ "2 - Verificar se o n�mero � par.\n"
			+ "3 - Verificar se o n�mero est� entre 0 e 1000.\n"
			+ "4 - Sair."));
			
			switch(choose) {
				
				case 1:
					
					otherNumber = Integer.parseInt(JOptionPane.showInputDialog("Informe o 'outro n�mero': "));
					if((numberOne%otherNumber)==0) {
						result = "Sim, o n�mero " + numberOne + " � m�ltiplo de " + otherNumber;
					}else {
						result = "N�o, o n�mero " + numberOne + " n�o � m�ltiplo de " + otherNumber;
					}
					
				break;
				
				case 2:
					
					numberEven = numberOne % 2;
					if(numberEven==0) {
						result = "O n�mero � par!";
					}else {
						result = "O n�mero n�o � par!";
					}
					
				break;
				
				case 3:
					
					if(numberOne >=0 && numberOne <=1000) {
						result = "O n�mero " + numberOne + " est� no intervalo de 0 a 1000!";
					}else {
						result = "O n�mero " + numberOne + " n�o est� no intervalo de 0 a 1000!";
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
