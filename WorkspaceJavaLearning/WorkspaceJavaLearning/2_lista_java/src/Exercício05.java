import javax.swing.JOptionPane;
public class Exercício05 {

	public static void main(String[] args) {
		
		double totalCopper=0;
		double totalZinc=0;
		double amountBrass=0;
		
		amountBrass = Double.parseDouble(JOptionPane.showInputDialog("Informe a quantidade de latão em kg: "));
		
		totalCopper = amountBrass * 0.7;
		totalZinc = amountBrass * 0.3;
		
		JOptionPane.showMessageDialog(null, "São necessários " + totalCopper + " kg de cobre e " + totalZinc + " kg"
		+ " de zinco para fabricar " + amountBrass + " kg de latão.");

	}

}
