import javax.swing.JOptionPane;
public class Exercício01 {

	public static void main(String[] args) {
		
		int parImpar=0;
		int numeroInf;
		int numerosDig=0;
		
		do {
			
			numeroInf = Integer.parseInt(JOptionPane.showInputDialog("Informe um número: "));
			
			parImpar = numeroInf % 2;
			
			if(parImpar!=0) {
				JOptionPane.showMessageDialog(null, "Você digitou um número ímpar, não tem "
				+ "direito de digitar mais números.");
			}else {
				numerosDig += 1;
			}
			
		} while (parImpar == 0);
		
		JOptionPane.showMessageDialog(null, "Quantidade de números digitados: " + numerosDig);
		
	}

}
