import javax.swing.JOptionPane;
public class Exercício02 {

	public static void main(String[] args) {
		
		int matrizInteiros[][] = new int[3][3];
		String mostraLinha="";
		int resposta;
		
		for(int l=0;l<3;l++) {
			for(int c=0;c<3;c++) {
				matrizInteiros[l][c] = Integer.parseInt(JOptionPane.showInputDialog("Informe o conteúdo da coluna " + (c+1) + " linha " + (l+1) + ": "));
			}
		}
		
		resposta = Integer.parseInt(JOptionPane.showInputDialog("Informe o número da linha que deseja ver: "));
		while(resposta>3 || resposta<=0) {
			JOptionPane.showMessageDialog(null, "Informe uma linha válida!");
			resposta = Integer.parseInt(JOptionPane.showInputDialog("Informe o número da linha que deseja ver: "));
		}
		
		for(int c=0;c<3;c++) {
			mostraLinha += matrizInteiros[resposta-1][c] + "  ";
		}
		
		System.out.print(":: " + mostraLinha + " ::");
		JOptionPane.showMessageDialog(null, mostraLinha);

	}

}
