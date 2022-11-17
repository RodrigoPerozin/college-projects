import javax.swing.JOptionPane;
public class Exercício03 {

	public static void main(String[] args) {
		
		double totalShop = getTotalShop();
		showResult(totalShop);

	}

public static double getTotalShop() {
	
	double totalShop = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor total da compra: "));
	
	return totalShop;
}

public static void showResult(double totalShop) {
	
	String result = "";
	
	if(totalShop<=100) {
		result = "O valor da compra permaneceu o mesmo: R$";
	}else if(totalShop>100 && totalShop<=200) {
		totalShop = totalShop - (totalShop*0.2);
		result = "O valor da compra recebeu 20% de desconto: R$";
	}else if(totalShop>200) {
		totalShop = totalShop - (totalShop*0.3);
		result = "O valor da compra recebeu 30% de desconto: R$";
	}
	
	result += String.format("%.2f", totalShop);
	
	JOptionPane.showMessageDialog(null, result);

}
	
}
