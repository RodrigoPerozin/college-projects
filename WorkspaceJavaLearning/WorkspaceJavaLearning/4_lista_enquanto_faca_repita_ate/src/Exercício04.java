import javax.swing.JOptionPane;
public class Exerc�cio04 {

	public static void main(String[] args) {
		
		int numberChoose=0;
		int result=1;
		int danielResults=0;
		int jeanResults=0;
		int whiteResults=0;
		int nullResults=0;
		String finalResult="";
		
		result = Integer.parseInt(JOptionPane.showInputDialog("Tem algu�m para votar?\n\n1 | SIM\n2 | N�O\n"));
		
		while(result==1){
	
			numberChoose = Integer.parseInt(JOptionPane.showInputDialog("Voto Para a Presid�ncia do JEC:\nFormato: C�digo | Candidato\n\n"
			+ "15 | Daniel\n75 | Jean\n0 | Voto em branco\nOutros | Voto nulo\n"));
			
			switch (numberChoose) {
				case 15:
					danielResults += 1;
				break;
				case 75:
					jeanResults += 1;
				break;
				case 0:
					whiteResults += 1;
				break;
				default:
					nullResults += 1;
			}
			
			result = Integer.parseInt(JOptionPane.showInputDialog("Tem algu�m mais para votar?\n\n1 | SIM\n2 | N�O\n"));
		
		}
		
		JOptionPane.showMessageDialog(null, "Resultado dos votos:\n\nDaniel | " + danielResults + "\nJean | " + jeanResults + "\nVotos em branco | "
		+ whiteResults + "\nVotos nulos | " + nullResults + "\n");
		
		if(danielResults==0 && jeanResults==0 && whiteResults==0 && nullResults==0) {
			finalResult = "Elei��o cancelada! N�o teve votantes sulficientes para iniciar uma elei��o!";
		}else if(danielResults==jeanResults){
			finalResult = "Empate! Jean e Daniel tiveram o mesmo n�mero de votos!";
		}else if(danielResults>jeanResults) {
			finalResult = "Candidato eleito! Daniel foi eleito com " + danielResults + " votos!";
		}else {
			finalResult = "Candidato eleito! Jean foi eleito com " + jeanResults + " votos!";
		}
		
		JOptionPane.showMessageDialog(null, "Resultado final da elei��o:\n\n" + finalResult);

	}

}
