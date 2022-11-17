import javax.swing.JOptionPane;
public class Exercício06 {

	public static void main(String[] args) {
		
		int membersSize=0;
		int age=0, ageAdd=0, ageAverage=0;
		int smoker=0, trueSmoker=0, falseSmoker=0;
		double netSalary=0, salaryAdd=0, salaryAverage=0;
		int clubTime=0, clubMore=0, clubPercent=0;
		int awnser=0; // 1 or 2
		
		awnser = Integer.parseInt(JOptionPane.showInputDialog("Tem alguém para registrar?\n\n1 - SIM\n2 - NÃO"));
		
		while(awnser==1) {
			
			age = Integer.parseInt(JOptionPane.showInputDialog("Informe a sua idade: "));
			ageAdd += age;
			
			smoker = Integer.parseInt(JOptionPane.showInputDialog("Informe se você é fumante:\n\n1 - SIM\n2 - NÃO"));
			if(smoker==1) {
				trueSmoker++;
			}else {
				falseSmoker++;
			}
			
			netSalary = Integer.parseInt(JOptionPane.showInputDialog("Informe seu salário líquido: "));
			salaryAdd += netSalary;
			
			clubTime = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantos meses você frequenta o clube: "));
			if(clubTime>3) {
				clubMore++;
			}
			
			membersSize++;
			awnser = Integer.parseInt(JOptionPane.showInputDialog("Tem mais alguém para registrar?\n\n1 - SIM\n2 - NÃO"));
			
		}
		
		if((awnser!=2 && ageAdd!=0) || (awnser==2 && ageAdd!=0)) {
			
			ageAverage  = ageAdd / membersSize;
			salaryAverage  = salaryAdd / membersSize;
			clubPercent = (clubMore*100)/membersSize;
			System.out.print(clubMore + " " + clubPercent + " " + membersSize);
			
			JOptionPane.showMessageDialog(null, "Média das idades: " + ageAverage + "\nMédia dos salários: " + String.format("%.2f", salaryAverage) 
			+ "\nSão fumantes: " + trueSmoker + "\nNão são fumantes: " + falseSmoker + "\n\nPorcentagem de pessoas de frequentam"
			+ " o clube a mais de 3 meses: " + clubPercent + "%.");
		
		}
		
	}

}
