import javax.swing.JOptionPane;
public class Exerc�cio02 {

	public static void main(String[] args) {
		
		int civilAdulthood;
		int age;
		String result;
		
		civilAdulthood = Integer.parseInt(JOptionPane.showInputDialog("Informe a maioridade civil do seu estado/pa�s: "));
		age = Integer.parseInt(JOptionPane.showInputDialog("Informe a sua idade: "));
		
		if(age>=civilAdulthood) {
			result = "Voc� � maior de idade!";
		}else {
			result = "Voc� � menor de idade!";
		}
		
		JOptionPane.showMessageDialog(null, result);
		
	}

}
