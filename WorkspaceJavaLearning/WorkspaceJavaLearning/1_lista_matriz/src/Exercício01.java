import javax.swing.JOptionPane;
public class Exercício01 {

	public static void main(String[] args) {
		
		String matrizInteiros[][] = new String[2][2];
		String mostraMatriz="";
		
		for(int l=0;l<2;l++) {
			for(int c=0;c<2;c++) {
				matrizInteiros[l][c] = JOptionPane.showInputDialog("Informe o conteúdo(número inteiro) da coluna " + (c+1) + " na linha " + (l+1) + ": ");
				mostraMatriz += matrizInteiros[l][c] + "  ";
			}
			mostraMatriz += "\n";
		}
		
		JOptionPane.showMessageDialog(null, mostraMatriz);

	}

}
