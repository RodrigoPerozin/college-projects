import javax.swing.JOptionPane;
public class Exercício03 {

	public static void main(String[] args) {
		
		double nota=0;
		int numeroRec=0;
		
		nota = Double.parseDouble(JOptionPane.showInputDialog("Insira a nota que você tirou na prova:"));
		
		while(nota<7) {
			numeroRec++;
			nota = Double.parseDouble(JOptionPane.showInputDialog("Insira a nota que você tirou na " + numeroRec +"ª prova de recuperação:"));
		}
		
		if(numeroRec==0) {
			JOptionPane.showMessageDialog(null, "O estudante não precisou de recuperação!");
		}else {
			JOptionPane.showMessageDialog(null, "O estudante precisou fazer " + numeroRec +" provas de recuperação!");
		}
		
	}

}
