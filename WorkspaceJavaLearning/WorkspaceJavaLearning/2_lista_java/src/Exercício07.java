import javax.swing.JOptionPane;
public class Exerc�cio07 {

	public static void main(String[] args) {
		
		int months[] = new int[12];
		int yearAverage=0;
		int monthsEvenAve=0;
		int monthsSemester=0;
		int monthMoreSells=0;
		int moreSells=0;
		int monthLessSells=0;
		int lessSells=0;
		
		for(int i=0;i<12;i++) {
			
			months[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o total de vendas do " + (i+1) + "� m�s: "));
			System.out.print(months[i] + " | ");
			yearAverage += months[i];
			
			if(i==0) {
				lessSells = months[i];
			}
			
			if(months[i]>moreSells) {
				moreSells = months[i];
				monthMoreSells = i+1;
			}
			
			if(months[i]<lessSells) {
				lessSells = months[i];
				monthLessSells = i;
			}
			
			if(((i+1)%2)==0) {
				monthsEvenAve += months[i];
			}
			
			if(i>5) {
				monthsSemester += months[i];
			}
		
		}
		
		JOptionPane.showMessageDialog(null, "\nM�s com mais vendas: " + monthMoreSells + "\nM�s com menos vendas: "
		+ (monthLessSells+1) + "\nM�dia das vendas do ano: " + (yearAverage/12) + "\nM�dia das vendas dos meses pares: "
		+ (monthsEvenAve/6) + "\nM�dia das vendas do 2� semestre: " + (monthsSemester/6));

	}

}
