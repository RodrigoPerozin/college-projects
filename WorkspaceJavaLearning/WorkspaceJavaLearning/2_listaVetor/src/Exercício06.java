import javax.swing.JOptionPane;
public class Exerc�cio06 {

	public static void main(String[] args) {
		
		int vetorUm[] = new int[5];
		int vetorDois[] = new int[5];
		int vetorSoma[] = new int[5];
		String resultado = "";
		
		for(int i=0;i<5;i++) {
			vetorUm[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o " + (i+1) + "� n�mero da lista 1: "));
		}
		
		for(int i=0;i<5;i++) {
			vetorDois[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o " + (i+1) + "� n�mero da lista 2: "));
		}
		
		for(int i=0;i<5;i++) {
			vetorSoma[i] = vetorUm[i] + vetorDois[i];
			resultado += "Posi��o " + (i+1) + " da lista 3: " + vetorSoma[i] + "\n";
		}
		
		JOptionPane.showMessageDialog(null, resultado);
		
	}

}
