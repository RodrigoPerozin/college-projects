import javax.swing.JOptionPane;
import java.util.Random;
public class Exerc�cio06 {

	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(null, "Bem vindo ao jogo de adivinha��o!\n\nComo jogar:\n\n1 -"
		+ "Voc� tem 5 chances.\n2 - Acerte o n�mero no intervalo de 1 a 50.\n\nBoa sorte!");
		
		Random randomNumber = new Random();
		int valorAleatorio = randomNumber.nextInt(49)+1;
		int valorChutado;
		System.out.print(valorAleatorio);
		
		for(short i=5; i>0; i--) {
			
			valorChutado = Integer.parseInt(JOptionPane.showInputDialog("Informe seu chute (" + i + " chutes restantes): "));
			
			if(valorChutado==valorAleatorio) {
				JOptionPane.showMessageDialog(null, "Voc� ganhou! Adivinhou o n�mero secreto " + valorAleatorio + "!");
				i=0;
			}else if(valorChutado<1 || valorChutado>50) {
				JOptionPane.showMessageDialog(null, "Voc� est� chutando fora do intervalo!");
				i++;
			}else if(i==1 && valorChutado!=valorAleatorio) {
				JOptionPane.showMessageDialog(null, "Infelizmente voc� perdeu!");
			}
			
		}
		
	}
	
}
