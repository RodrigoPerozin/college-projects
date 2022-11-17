import javax.swing.JOptionPane;
public class Exercício02 {

	public static void main(String[] args) {
		
		int civilAdulthood;
		int age;
		String result;
		
		civilAdulthood = Integer.parseInt(JOptionPane.showInputDialog("Informe a maioridade civil do seu estado/país: "));
		age = Integer.parseInt(JOptionPane.showInputDialog("Informe a sua idade: "));
		
		if(age>=civilAdulthood) {
			result = "Você é maior de idade!";
		}else {
			result = "Você é menor de idade!";
		}
		
		JOptionPane.showMessageDialog(null, result);
		
	}

}
