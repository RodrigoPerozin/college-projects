import javax.swing.JOptionPane;

public class Exerc�cio01 {

	public static void main(String[] args) {
		
		int bornYear = getBornYear();
		showAtualAge(bornYear);
		

	}

public static void showAtualAge(int bornYear) {
	JOptionPane.showMessageDialog(null, "A sua idade atual �: " + getAtualAge(bornYear));
}
	
public static int getBornYear() {
	
	int bornYear = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano do seu nascimento:"));
	
	return bornYear;
}

public static int getAtualAge(int bornYear) {
	
	int atualAge = 2020 - bornYear;
	
	return atualAge;
}

}
