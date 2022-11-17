import javax.swing.JOptionPane;

public class Exerc�cio02 {

	public static void main(String[] args) {

		double grades[] = new double[3];
		int option = 0;
		int weight[] = new int[3];
		
		for(int i=0;i<3;i++) {
			grades[i] = Double.parseDouble(JOptionPane.showInputDialog("Informe a " + (i+1) + "� nota: "));
			while(grades[i]<0 || grades[i]>10) {
				JOptionPane.showMessageDialog(null, "Informe uma nota v�lida!");
				grades[i] = Double.parseDouble(JOptionPane.showInputDialog("Informe a " + (i+1) + "� nota: "));
			}
			
		}
		
		option = Integer.parseInt(JOptionPane.showInputDialog("Informe a a��o desejada:\n\n1 - Ver m�dia aritm�tica.\n2 - Ver m�dia ponderada.\n"));
		
		switch(option) {
		case 1:
			double aritimeticAv = getAritmeticAv(grades);
			showFinalResult(aritimeticAv);
		break;
		case 2:
			for(int i=0;i<3;i++) {
				weight[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o peso da " + (i+1) + "� nota(Ex: 10, 20, 70): "));
			}
			double weightedAv = getWeightedAv(grades, weight);
			showFinalResult(weightedAv);
		break;
		}

	}

public static double getAritmeticAv(double[] grades) {
	
	double average = (grades[0] + grades[1] + grades[2]) / grades.length;
	return average;
}

public static double getWeightedAv(double[] grades, int[] weight) {
	
	double average = ((grades[0]*weight[0])+(grades[1]*weight[1])+(grades[2]*weight[2]))
			/(weight[0]+weight[1]+weight[2]);
	
	return average;
}

public static void showFinalResult(double average) {
	
	if(average<7) {
		JOptionPane.showMessageDialog(null, "Aluno reprovado com m�dia " + String.format("%.2f", average) + "!");
	}else {
		JOptionPane.showMessageDialog(null, "Aluno aprovado com m�dia " + String.format("%.2f", average) + "!");
	}

}
	
}
