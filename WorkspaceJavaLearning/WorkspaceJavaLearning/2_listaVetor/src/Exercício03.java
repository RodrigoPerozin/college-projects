import javax.swing.JOptionPane;
public class Exerc�cio03 {

	public static void main(String[] args) {
		
		String vetorResAluno[] = new String[10];
		String vetorResProf[] = new String[10];
		int notaAluno=0;
	
		JOptionPane.showMessageDialog(null, "Gabarito do aluno...");
		for(int i=0;i<10;i++) {
			vetorResAluno[i] = JOptionPane.showInputDialog("Informe a alternativa assinalada na quest�o " + (i+1) + ": ");
			while(!vetorResAluno[i].equals("a") && !vetorResAluno[i].equals("b") && !vetorResAluno[i].equals("c") && !vetorResAluno[i].equals("d")) {
				vetorResAluno[i] = JOptionPane.showInputDialog("Informe a alternativa assinalada na quest�o " + (i+1) + ": ");
				JOptionPane.showMessageDialog(null, "Insira uma alternativa v�lida!");
			}
		}
		
		JOptionPane.showMessageDialog(null, "Gabarito do professor...");
		for(int i=0;i<10;i++) {
			vetorResProf[i] = JOptionPane.showInputDialog("Informe a alternativa correta para a quest�o " + (i+1) + ": ");
			while(!vetorResProf[i].equals("a") && !vetorResProf[i].equals("b") && !vetorResProf[i].equals("c") && !vetorResProf[i].equals("d")) {
				vetorResProf[i] = JOptionPane.showInputDialog("Informe a alternativa correta para a quest�o " + (i+1) + ": ");
				JOptionPane.showMessageDialog(null, "Insira uma alternativa v�lida!");
			}
		}
		
		for(int i=0;i<10;i++) {
			
			if(vetorResAluno[i].equals(vetorResProf[i])==true) {
				notaAluno++;
			}
			
		}
		
		JOptionPane.showMessageDialog(null, "O aluno tirou " + notaAluno + " na prova.");
		
	}

}
