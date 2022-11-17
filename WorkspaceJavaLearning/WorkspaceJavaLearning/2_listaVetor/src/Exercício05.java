import javax.swing.JOptionPane;
public class Exercício05 {

	public static void main(String[] args) {
		
		String vetorSobrenome[] = new String[4];
		int vetorApartamento[] = new int[4];
		int vetorMoradores[] = new int[4];
		double vetorRenda[] = new double[4];
		double rendaMedia=0;
		int search;
		boolean detected;
		int awnser;
		
		for(int i=0;i<4;i++) {
			
			vetorSobrenome[i] = JOptionPane.showInputDialog(null, "Informe o sobrenome da " + (i+1) + "ª família: ");
			vetorApartamento[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o apartamento da " + (i+1) + "ª família: "));
			vetorMoradores[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de moradores no apartamento: "));
			vetorRenda[i] = Double.parseDouble(JOptionPane.showInputDialog("Informe a renda da família: "));
		
		}
		
		do {
		
			detected = false;
			search = Integer.parseInt(JOptionPane.showInputDialog("Informe o apartamento que deseja buscar informações: "));
		
			for(int i=0;i<4;i++) {
				
				if(search == vetorApartamento[i]) {
					
					rendaMedia = (vetorRenda[i] / vetorMoradores[i]);
					JOptionPane.showMessageDialog(null, "Encontrado! Dados da família:\n\nSobrenome: " + vetorSobrenome[i] 
					+ "\nApartamento: " + vetorApartamento[i] + "\nMoradores: " + vetorMoradores[i] + "\n\nRenda média: " + rendaMedia);	
					detected = true;
					
				}else if (search != vetorApartamento[i] && detected==false && i==3) {
					
					JOptionPane.showMessageDialog(null, "Apartamento não encontrado!");
					
				}
				
			}
			
			awnser = Integer.parseInt(JOptionPane.showInputDialog("Deseja consultar outro apartamento?\n\n1 | SIM\n2 | NÃO"));
		
		} while (awnser==1);

	}

}
