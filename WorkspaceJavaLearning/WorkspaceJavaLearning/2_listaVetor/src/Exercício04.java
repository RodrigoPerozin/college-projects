import javax.swing.JOptionPane;
public class Exerc�cio04 {

	public static void main(String[] args) {
		
		int vetorInteiros[] = new int[10];
		int valorSearch;
		boolean detected = false;
		
		for(int i=0;i<10;i++) {
			vetorInteiros[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o " + (i+1) + "� valor inteiro: "));
		}
		
		valorSearch = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor a ser procurado: "));
		
		for(int i=0;i<10;i++) {
			
			if(vetorInteiros[i] == valorSearch) {
				JOptionPane.showMessageDialog(null, "Valor encontrado!\n\nPosi��o do vetor: " + i + "\n\nConte�do do vetor: " + vetorInteiros[i]);
				detected = true;
			}else if ( detected == false && vetorInteiros[i] != valorSearch && i==9) {
				JOptionPane.showMessageDialog(null, "Valor n�o encontrado!");
			}
			
		}

	}

}
