import javax.swing.JOptionPane;
public class Exerc�cio06 {

	public static void main(String[] args) {
		
		int membersSize=0;
		int age=0, ageAdd=0, ageAverage=0;
		int smoker=0, trueSmoker=0, falseSmoker=0;
		double netSalary=0, salaryAdd=0, salaryAverage=0;
		int clubTime=0, clubMore=0, clubPercent=0;
		int awnser=0; // 1 or 2
		
		awnser = Integer.parseInt(JOptionPane.showInputDialog("Tem algu�m para registrar?\n\n1 - SIM\n2 - N�O"));
		
		while(awnser==1) {
			
			age = Integer.parseInt(JOptionPane.showInputDialog("Informe a sua idade: "));
			ageAdd += age;
			
			smoker = Integer.parseInt(JOptionPane.showInputDialog("Informe se voc� � fumante:\n\n1 - SIM\n2 - N�O"));
			if(smoker==1) {
				trueSmoker++;
			}else {
				falseSmoker++;
			}
			
			netSalary = Integer.parseInt(JOptionPane.showInputDialog("Informe seu sal�rio l�quido: "));
			salaryAdd += netSalary;
			
			clubTime = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantos meses voc� frequenta o clube: "));
			if(clubTime>3) {
				clubMore++;
			}
			
			membersSize++;
			awnser = Integer.parseInt(JOptionPane.showInputDialog("Tem mais algu�m para registrar?\n\n1 - SIM\n2 - N�O"));
			
		}
		
		if((awnser!=2 && ageAdd!=0) || (awnser==2 && ageAdd!=0)) {
			
			ageAverage  = ageAdd / membersSize;
			salaryAverage  = salaryAdd / membersSize;
			clubPercent = (clubMore*100)/membersSize;
			System.out.print(clubMore + " " + clubPercent + " " + membersSize);
			
			JOptionPane.showMessageDialog(null, "M�dia das idades: " + ageAverage + "\nM�dia dos sal�rios: " + String.format("%.2f", salaryAverage) 
			+ "\nS�o fumantes: " + trueSmoker + "\nN�o s�o fumantes: " + falseSmoker + "\n\nPorcentagem de pessoas de frequentam"
			+ " o clube a mais de 3 meses: " + clubPercent + "%.");
		
		}
		
	}

}
