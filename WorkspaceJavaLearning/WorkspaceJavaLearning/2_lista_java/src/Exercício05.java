import javax.swing.JOptionPane;
public class Exerc�cio05 {

	public static void main(String[] args) {
		
		double totalCopper=0;
		double totalZinc=0;
		double amountBrass=0;
		
		amountBrass = Double.parseDouble(JOptionPane.showInputDialog("Informe a quantidade de lat�o em kg: "));
		
		totalCopper = amountBrass * 0.7;
		totalZinc = amountBrass * 0.3;
		
		JOptionPane.showMessageDialog(null, "S�o necess�rios " + totalCopper + " kg de cobre e " + totalZinc + " kg"
		+ " de zinco para fabricar " + amountBrass + " kg de lat�o.");

	}

}
