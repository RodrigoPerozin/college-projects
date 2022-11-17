import javax.swing.JOptionPane;
public class Exercício02 {

	public static void main(String[] args) {
		
		int numInf;
		int numResultado;
		int somaNumPar=0;
		int somaNumImpar=0;
		int somaPares=0;
		int somaImpares=0;
	
		for(int i=1; i<=10; i++) {
			
			numInf = Integer.parseInt(JOptionPane.showInputDialog("Insira o " + i + "° número: "));
			
			numResultado = numInf % 2;
			
			if(numResultado == 0) {
				somaNumPar += 1;
				somaPares += numInf;
				
			}else if (numResultado != 0) {
				somaNumImpar += 1;
				somaImpares += numInf;
			}else {
				JOptionPane.showMessageDialog(null, "Houve algum erro ao verificar se o número é par ou ímpar...");
			}
			
		}
		
		JOptionPane.showMessageDialog(null, "Números pares totais: " + somaNumPar + "\n" 
		+ "Números ímpares totais: " + somaNumImpar + "\n" + "Soma dos números pares informados: "
		+ somaPares + "\n" + "Soma dos números ímpares informados: " + somaImpares);

	}

}
