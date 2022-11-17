import javax.swing.JOptionPane;
public class Exercício03 {

	public static void main(String[] args) {
		
		int matrizInteiros[][] = new int[2][3];
		int mostraSoma=0;
		
		for(int l=0;l<2;l++) {
			for(int c=0;c<3;c++) {
				matrizInteiros[l][c] = Integer.parseInt(JOptionPane.showInputDialog("Informe o conteúdo da coluna " + (c+1) + " linha " + (l+1) + ": "));
				mostraSoma += matrizInteiros[l][c];
			}
		}
		
		JOptionPane.showMessageDialog(null, "A soma de todos os elementos dessa matriz é:" + mostraSoma);

	}

}
