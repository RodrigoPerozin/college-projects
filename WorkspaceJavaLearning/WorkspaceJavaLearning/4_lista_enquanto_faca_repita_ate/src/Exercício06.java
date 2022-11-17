import javax.swing.JOptionPane;
public class Exercício06 {

	public static void main(String[] args) {

		int awnser=0;
		int idadeSoma=0;
		int idadeInf=0;
		int numPessoas=0;
		int sexo=0;
		double salario=0;
		double salarioSoma=0;
		int mulheres=0;
		
		do {
			
			idadeInf = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade:"));
			sexo = Integer.parseInt(JOptionPane.showInputDialog("Informe seu sexo:\n\n1 | HOMEM\n2 | MULHER\n"));
			salario = Double.parseDouble(JOptionPane.showInputDialog("Informe seu salário (confia): "));
			
			idadeSoma += idadeInf;
			numPessoas += 1;
			salarioSoma += salario;
			
			if(sexo==2 && salario <= 1000) {
				mulheres += 1;
			}
			
			
			awnser = Integer.parseInt(JOptionPane.showInputDialog("Deseja continuar?\n\n1 | SIM\n2 | NÃO\n"));
			
		} while(awnser==1);
		
		JOptionPane.showMessageDialog(null, "Resultados:\n\nMédia dos salários: R$" + String.format("%.2f", (salarioSoma/numPessoas))
		+ "\nMédia das idades: " + (idadeSoma/numPessoas) + "\nMulheres com salário até R$1000,00: " + mulheres);

	}

}
