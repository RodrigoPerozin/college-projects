import javax.swing.JOptionPane;
public class Exercício08 {

	public static void main(String[] args) {
		
		double notes[][] = new double[4][3];
		double highestNote=0;
		double lowestNote=0;
		double noteDisAverage=0;
		String highestNoteDis="";
		String lowestNoteDis="";
		String disciplineName="";
		String showResult="";
		int option=0;
		
		for(int l=0;l<4;l++) {
			for(int c=0;c<3;c++) {
				switch(c) {
					case 0:
						disciplineName ="Matemática";
					break;
					case 1:
						disciplineName ="Física";
					break;
					case 2:
						disciplineName ="Química";
					break;
				}
				notes[l][c] = Double.parseDouble(JOptionPane.showInputDialog("Informe a " + (l+1) + "ª nota de " + disciplineName + ": "));
			}
		}
		
		lowestNote = notes[0][0];
		highestNote = notes[0][0];
		
		do {
			
		option = Integer.parseInt(JOptionPane.showInputDialog(null, "Menu de intereações:\n\n1 - Ver todas as notas das disciplinas.\n2 - Ver a maior nota e em qual disciplina."
		+ "\n3 - Ver a menor nota e em qual disciplina.\n4 - Ver a média das notas de alguma disciplina.\n5 - Ver as notas de um dos bimestres.\n6 - Encerrar."));
		
		switch(option) {
		case 1:
			
			for(int c=0;c<3;c++) {
				
				if(c==0) {
					showResult += "Notas de matemática:\n\n";
				}else if(c==1) {
					showResult +="Notas de física:\n\n";
				}else if(c==2) {
					showResult +="Notas de química:\n\n";
				}
				
				for(int l=0;l<4;l++) {
					showResult += String.format("%.2f", (notes[l][c])) + "   ";
				}
				
				showResult += "\n\n";
			}
			
			JOptionPane.showMessageDialog(null, showResult);
			showResult="";
			
			
		break;
		case 2:
			
			for(int l=0;l<4;l++) {
				for(int c=0;c<3;c++) {
					
					if(c==0) {
						disciplineName ="matemática";
					}else if(c==1) {
						disciplineName ="física";
					}else if(c==2) {
						disciplineName ="química";
					}
					
					if(notes[l][c] > highestNote) {
						highestNote = notes[l][c];
						highestNoteDis = disciplineName;
					}
				}
			}
			
			JOptionPane.showMessageDialog(null, "A maior nota foi " + String.format("%.2f", highestNote) + " em " + highestNoteDis + "!");
			
		break;
		case 3:
			
			for(int c=0;c<3;c++) {
				
				if(c==0) {
					disciplineName = "matemática";
				}else if(c==1) {
					disciplineName = "física";
				}else if(c==2) {
					disciplineName = "química";
				}
				
				for(int l=0;l<4;l++) {
					
					if(notes[l][c] < lowestNote) {
						lowestNote = notes[l][c];
						lowestNoteDis = disciplineName;
						System.out.print(disciplineName + " --- " + lowestNoteDis);
					}
					
				}
			}
			
			if(lowestNoteDis=="") {
				lowestNoteDis="matemática";
			}
			
			JOptionPane.showMessageDialog(null, "A menor nota foi " + String.format("%.2f", lowestNote) + " em " + lowestNoteDis + "!");
			
		break;
		case 4:
			
			option = Integer.parseInt(JOptionPane.showInputDialog("Informe a disciplina que deseja ver a média das notas:\n\n1 - Matemática\n2 - Física\n3 - Química"));
			while(option<1 || option>3) {
				JOptionPane.showMessageDialog(null, "Informe um item válido!");
				option = Integer.parseInt(JOptionPane.showInputDialog("Informe a disciplina que deseja ver a média das notas:\n\n1 - Matemática\n2 - Física\n3 - Química"));
			}
			
			for(int l=0;l<4;l++) {
				noteDisAverage += notes[l][option-1];
			}
			
			if(option==1) {
				disciplineName ="matemática";
			}else if(option==2) {
				disciplineName ="física";
			}else if(option==3) {
				disciplineName ="química";
			}
			
			JOptionPane.showMessageDialog(null, "A média das notas de " + disciplineName + " é: " + String.format("%.2f", (noteDisAverage/4)));
			noteDisAverage=0;
			
		break;
		case 5:
			
			option = Integer.parseInt(JOptionPane.showInputDialog("Informe o bimestre que você deseja visualizar(1, 2, 3 ou 4):"));
			while(option<1 || option>4) {
				JOptionPane.showMessageDialog(null, "Informe um item válido!");
				option = Integer.parseInt(JOptionPane.showInputDialog("Informe o bimestre que você deseja visualizar(1, 2, 3 ou 4):"));
			}
			
			for(int c=0;c<3;c++) {
				
				if(c==0) {
					showResult += "Nota de matemática:\n\n";
				}else if(c==1) {
					showResult +="Nota de física:\n\n";
				}else if(c==2) {
					showResult +="Nota de química:\n\n";
				}
				
				showResult += String.format("%.2f", (notes[option-1][c])) + "\n\n";
			}
			
			JOptionPane.showMessageDialog(null, showResult);
			
			showResult="";
			
		break;
		case 6:
		break;
		default:
			JOptionPane.showMessageDialog(null, "Informe um item válido!");
		}
		
		} while(option!=6);
		
		System.exit(0);
	}
}
