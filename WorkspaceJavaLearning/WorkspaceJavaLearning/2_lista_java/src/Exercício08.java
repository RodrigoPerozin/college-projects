import javax.swing.JOptionPane;
public class Exerc�cio08 {

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
						disciplineName ="Matem�tica";
					break;
					case 1:
						disciplineName ="F�sica";
					break;
					case 2:
						disciplineName ="Qu�mica";
					break;
				}
				notes[l][c] = Double.parseDouble(JOptionPane.showInputDialog("Informe a " + (l+1) + "� nota de " + disciplineName + ": "));
			}
		}
		
		lowestNote = notes[0][0];
		highestNote = notes[0][0];
		
		do {
			
		option = Integer.parseInt(JOptionPane.showInputDialog(null, "Menu de interea��es:\n\n1 - Ver todas as notas das disciplinas.\n2 - Ver a maior nota e em qual disciplina."
		+ "\n3 - Ver a menor nota e em qual disciplina.\n4 - Ver a m�dia das notas de alguma disciplina.\n5 - Ver as notas de um dos bimestres.\n6 - Encerrar."));
		
		switch(option) {
		case 1:
			
			for(int c=0;c<3;c++) {
				
				if(c==0) {
					showResult += "Notas de matem�tica:\n\n";
				}else if(c==1) {
					showResult +="Notas de f�sica:\n\n";
				}else if(c==2) {
					showResult +="Notas de qu�mica:\n\n";
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
						disciplineName ="matem�tica";
					}else if(c==1) {
						disciplineName ="f�sica";
					}else if(c==2) {
						disciplineName ="qu�mica";
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
					disciplineName = "matem�tica";
				}else if(c==1) {
					disciplineName = "f�sica";
				}else if(c==2) {
					disciplineName = "qu�mica";
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
				lowestNoteDis="matem�tica";
			}
			
			JOptionPane.showMessageDialog(null, "A menor nota foi " + String.format("%.2f", lowestNote) + " em " + lowestNoteDis + "!");
			
		break;
		case 4:
			
			option = Integer.parseInt(JOptionPane.showInputDialog("Informe a disciplina que deseja ver a m�dia das notas:\n\n1 - Matem�tica\n2 - F�sica\n3 - Qu�mica"));
			while(option<1 || option>3) {
				JOptionPane.showMessageDialog(null, "Informe um item v�lido!");
				option = Integer.parseInt(JOptionPane.showInputDialog("Informe a disciplina que deseja ver a m�dia das notas:\n\n1 - Matem�tica\n2 - F�sica\n3 - Qu�mica"));
			}
			
			for(int l=0;l<4;l++) {
				noteDisAverage += notes[l][option-1];
			}
			
			if(option==1) {
				disciplineName ="matem�tica";
			}else if(option==2) {
				disciplineName ="f�sica";
			}else if(option==3) {
				disciplineName ="qu�mica";
			}
			
			JOptionPane.showMessageDialog(null, "A m�dia das notas de " + disciplineName + " �: " + String.format("%.2f", (noteDisAverage/4)));
			noteDisAverage=0;
			
		break;
		case 5:
			
			option = Integer.parseInt(JOptionPane.showInputDialog("Informe o bimestre que voc� deseja visualizar(1, 2, 3 ou 4):"));
			while(option<1 || option>4) {
				JOptionPane.showMessageDialog(null, "Informe um item v�lido!");
				option = Integer.parseInt(JOptionPane.showInputDialog("Informe o bimestre que voc� deseja visualizar(1, 2, 3 ou 4):"));
			}
			
			for(int c=0;c<3;c++) {
				
				if(c==0) {
					showResult += "Nota de matem�tica:\n\n";
				}else if(c==1) {
					showResult +="Nota de f�sica:\n\n";
				}else if(c==2) {
					showResult +="Nota de qu�mica:\n\n";
				}
				
				showResult += String.format("%.2f", (notes[option-1][c])) + "\n\n";
			}
			
			JOptionPane.showMessageDialog(null, showResult);
			
			showResult="";
			
		break;
		case 6:
		break;
		default:
			JOptionPane.showMessageDialog(null, "Informe um item v�lido!");
		}
		
		} while(option!=6);
		
		System.exit(0);
	}
}
