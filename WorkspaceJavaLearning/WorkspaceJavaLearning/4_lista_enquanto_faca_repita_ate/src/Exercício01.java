import javax.swing.JOptionPane;
public class Exerc�cio01 {

	public static void main(String[] args) {
		
		int parImpar=0;
		int numeroInf;
		int numerosDig=0;
		
		do {
			
			numeroInf = Integer.parseInt(JOptionPane.showInputDialog("Informe um n�mero: "));
			
			parImpar = numeroInf % 2;
			
			if(parImpar!=0) {
				JOptionPane.showMessageDialog(null, "Voc� digitou um n�mero �mpar, n�o tem "
				+ "direito de digitar mais n�meros.");
			}else {
				numerosDig += 1;
			}
			
		} while (parImpar == 0);
		
		JOptionPane.showMessageDialog(null, "Quantidade de n�meros digitados: " + numerosDig);
		
	}

}
