import javax.swing.JOptionPane;
public class Exerc�cio04 {

	public static void main(String[] args) {
		
		int semestre[][] = new int[6][4];
		int vendasSemestre=0;
		int vendasMes[] = new int[6];
		String vendasCadaMes="";
		
		for(int l=0;l<6;l++) {
			for(int c=0;c<4;c++) {
				semestre[l][c] = Integer.parseInt(JOptionPane.showInputDialog("Informe o n�mero de vendas no m�s " + (l+1) + " semana " + (c+1) + ": "));
				vendasSemestre += semestre[l][c];
				vendasMes[l] += semestre[l][c];
			}
			vendasCadaMes += "Vendas totais no m�s " + (l+1) + ": " + vendasMes[l] + "\n";
		}
		
		JOptionPane.showMessageDialog(null, "Total de vendas do semestre: " + vendasSemestre + "\n\nTotal de vendas em cada m�s:\n\n" + vendasCadaMes);

	}

}
