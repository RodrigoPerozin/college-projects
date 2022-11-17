import javax.swing.JOptionPane;

public class EntradaSaida {
		
		public static int solicitaOperacao() {
			
			int operacao = Integer.parseInt(JOptionPane.showInputDialog("Escolha a op��o desejada:\n"
					+ "1 - Soma\n"
					+ "2 - Subtra��o\n"
					+ "3 - Multiplica��o\n"
					+ "4 - Divis�o"));
			
			return operacao;
		}
		
		public static double solicitaNumero(String ordem) {
			
			double num = Double.parseDouble(JOptionPane.showInputDialog("Informe o "+ordem+" n�mero:"));
			
			return num;
		}
		
		public static void mostraResultado(double resultado, int operacao) {
			
			String op="";
			
			if(operacao==1) {
				op="soma";
			}else if(operacao==2) {
				op="subtra��o";
			}else if(operacao==3) {
				op="multiplica��o";
			}else {
				op="divis�o";
			}
			
			JOptionPane.showMessageDialog(null, "O resultado da "+op+" �: "+resultado);
			
		}

}
