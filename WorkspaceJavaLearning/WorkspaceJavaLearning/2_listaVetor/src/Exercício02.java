import javax.swing.JOptionPane;

public class Exerc�cio02 {

	public static void main(String[] args) {
		
		int vetorInteiros[] = new int[5];
		
		for(int i=0;i<=4;i++) {
			vetorInteiros[i] = (i+1);
		}
		
		for(int i=0;i<=4;i++) {
			JOptionPane.showMessageDialog(null, "A posi��o " + i + " do vetor cont�m o valor: " + vetorInteiros[i]);
		}

	}

}
