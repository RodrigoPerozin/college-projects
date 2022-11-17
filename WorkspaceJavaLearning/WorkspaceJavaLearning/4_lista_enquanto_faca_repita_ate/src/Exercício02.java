import javax.swing.JOptionPane;
public class Exercício02 {

	public static void main(String[] args) {
		
		int awnser=0;
		int firstValue=0;
		int secondValue=0;
		int symbol=0;
		int result=0;
		String finalResult="";
		
		firstValue = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro valor: "));
		finalResult += firstValue + " ";
		
		do {
			
			symbol = Integer.parseInt(JOptionPane.showInputDialog("Informe o número correspondente"
			+ " ao calculo desejado:\n\n1 -> +\n2 -> -\n3 -> *\n4 -> ÷\n "));
			secondValue = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo valor: "));
			
			if(symbol==1) {
				result = firstValue + secondValue;
				finalResult += "+ ";
			}else if(symbol==2) {
				result = firstValue - secondValue;
				finalResult += "- ";
			}else if(symbol==3) {
				result = firstValue * secondValue;
				finalResult += "x ";
			}else if(symbol==4) {
				result = firstValue / secondValue;
				finalResult += "÷ ";
			}
			
			finalResult += secondValue + " = " + result + " ";
			firstValue=result;
			awnser = Integer.parseInt(JOptionPane.showInputDialog("Deseja continuar calculando?\n\n1 - SIM\n2 - NÃO\n"));
			
			
		} while (awnser==1);
		
		JOptionPane.showMessageDialog(null, "O resutado do calculo é:\n\n" + finalResult + "\n");

	}

}
