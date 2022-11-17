import javax.swing.JOptionPane;
public class Exercício03 {

	public static void main(String[] args) {
		
		double ganhoBruto=0;
		double gasto=0;
		double saldo=0;
		String status="";
		
		for(int i=0; i<6; i++) {
			
			ganhoBruto += Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o ganho bruto da sua empresa no " + (i+1) + "° mês: "));
			gasto += Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o gasto do " + (i+1) + "° mês do semestre: "));
		
		}
		
		saldo = ganhoBruto - gasto;
		
		if(saldo==0){
			status = "O saldo final da empresa ficou em R$00,00.";
		}else if(saldo > 0) {
			status = "A empresa teve lucro.";
		}else {
			status = "A empresa teve prejuízo.";
		}
		
		JOptionPane.showMessageDialog(null, "Ganho bruto semestral: R$" + String.format("%.2f", ganhoBruto) + "\nGasto semestral: R$"
		+ String.format("%.2f", gasto) + "\nSaldo financeiro: R$" + String.format("%.2f", saldo) + "\n\nStatus: " + status);
		
	}

}
