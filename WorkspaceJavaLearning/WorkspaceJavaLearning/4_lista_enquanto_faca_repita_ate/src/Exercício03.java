import javax.swing.JOptionPane;
public class Exerc�cio03 {

	public static void main(String[] args) {
		
		double nota=0;
		int numeroRec=0;
		
		nota = Double.parseDouble(JOptionPane.showInputDialog("Insira a nota que voc� tirou na prova:"));
		
		while(nota<7) {
			numeroRec++;
			nota = Double.parseDouble(JOptionPane.showInputDialog("Insira a nota que voc� tirou na " + numeroRec +"� prova de recupera��o:"));
		}
		
		if(numeroRec==0) {
			JOptionPane.showMessageDialog(null, "O estudante n�o precisou de recupera��o!");
		}else {
			JOptionPane.showMessageDialog(null, "O estudante precisou fazer " + numeroRec +" provas de recupera��o!");
		}
		
	}

}
