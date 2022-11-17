import javax.swing.JOptionPane;
public class Principal {

	public static void main(String[] args) {
		
		int continuar;
		double resultado=0;
		
		
		do {
			
			double num1 = solicitaNumero("1�");
			double num2 = solicitaNumero("2�");
			int operacao = solicitaOperacao();
			
			switch(operacao) {
				case 1:
					resultado=calculaSoma(num1, num2);
					break;
				case 2:
					resultado=calculaSubtracao(num1, num2);
					break;
				case 3:
					resultado=calculaMultiplicacao(num1, num2);
					break;
				case 4:
					
					while(num2==0) {
						num2=solicitaNumero("2�");
					}
					resultado=calculaDivisao(num1, num2);
					break;
				default:
					JOptionPane.showMessageDialog(null, "Opera��o inv�lida! A calculadora ser� encerrada!");
					System.exit(0);
			}
			
			mostraResultado(resultado, operacao);
			continuar = Integer.parseInt(JOptionPane.showInputDialog("1 - SIM | 2 - N�O"));
			
		} while (continuar==1);
		
	}
	
	static int solicitaOperacao(){

		int operacao = Integer.parseInt(JOptionPane.showInputDialog("Escolha a opera��o desejada:\n"
				+ "1 - Soma\n"
				+ "2 - Subtra��o\n"
				+ "3 - Multiplica��o\n"
				+ "4 - Divis�o"));
		return operacao;
		
	}
	
	static double solicitaNumero(String ordem) {
		
		double num = Double.parseDouble(JOptionPane.showInputDialog("Informe o "+ordem+" n�mero:"));
		
		return num;
		
	}
	
	static double calculaSoma(double num1, double num2) {
		
		double soma = num1 + num2;
		return soma;
				
	}
	
	static double calculaSubtracao(double num1, double num2) {
		
		double sub = num1 - num2;
		return sub;
				
	}
	
	static double calculaMultiplicacao(double num1, double num2) {
		
		double mult = num1 * num2;
		return mult;
				
	}
	
	static double calculaDivisao(double num1, double num2) {
		
		double divi = num1 / num2;
		return divi;
				
	}
	
	static void mostraResultado(double resultado, int operacao) {
		
		String op="";
		
		if(operacao==1) {
			op="soma";
		}else if(operacao==2) {
			op="subtra��o";
		}else if(operacao==3) {
			op="multiplica��o";
		}else{
			op="divis�o";
		}
		
		JOptionPane.showMessageDialog(null, "O resultado da " + op + " �: " + resultado);
		
	}
	
}
