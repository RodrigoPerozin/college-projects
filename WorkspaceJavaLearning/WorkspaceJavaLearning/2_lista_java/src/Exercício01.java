import javax.swing.JOptionPane;
public class Exercício01 {

	public static void main(String[] args) {
		
		int values[];
		int size;
		int negativeNumbers=0;
		
		size = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de valores a serem informados: "));
		values = new int[size];
		
		for(int i=0;i<size;i++) {
			values[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor do " + (i+1) + "° valor: "));
			if(values[i]<0) {
				negativeNumbers++;
			}
		}
		
		JOptionPane.showMessageDialog(null, "A quantidade de números negativos é " + negativeNumbers);

	}

}
