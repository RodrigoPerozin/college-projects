import javax.swing.JOptionPane;
public class Exerc�cio01 {

	public static void main(String[] args) {
		
		int vetorInteiros[] = new int[5];
		
		vetorInteiros[0] = 1;
		vetorInteiros[1] = 2;
		vetorInteiros[2] = 3;
		vetorInteiros[3] = 4;
		vetorInteiros[4] = 5;
		
		for(int i=0;i<=4;i++) {
			JOptionPane.showMessageDialog(null, "A posi��o " + i + " do vetor cont�m o valor: " + vetorInteiros[i]);
		}

	}

}
