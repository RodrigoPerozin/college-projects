import javax.swing.JOptionPane;
public class Exercício02 {

	public static void main(String[] args) {

		double notes[] = new double[4];
		double sumNotes=0;
		double aritAverage;
		String result="";
		
		JOptionPane.showMessageDialog(null, "Tabela dos conceitos:\n\n9.0 ou maior = Conceito A\n"
		+ "entre 8.0 e 8.9 = Conceito B\nentre 7.0 e 7.9 = Conceito C\nmenor que 7.0 = Conceito D");
		
		for(int i=0; i<4;i++) {
			notes[i] = Double.parseDouble(JOptionPane.showInputDialog("Informe a " + (i+1) + "ª nota: "));
			sumNotes += notes[i];
		}
		
		aritAverage = sumNotes / 4;
		
		if(aritAverage>=9) {
			result = "Conceito A";
		}else if(aritAverage>=8 && aritAverage<=8.9) {
			result = "Conceito B";
		}else if(aritAverage>=7 && aritAverage<=7.9) {
			result = "Conceito C";
		}else {
			result = "Conceito D";
		}

		JOptionPane.showMessageDialog(null, "O conceito do aluno ficou como:\n\n" + result);
		
	}

}
