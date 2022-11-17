import javax.swing.JOptionPane;
public class Exercício03 {

	public static void main(String[] args) {
		
		int number[] = new int[3];
		int lowestNumber=0;
		
		for(int i=0; i<3; i++) {
			number[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o " + (i+1) + "° número: "));
			
			if(i==0) {
				lowestNumber = number[0];
			}else if(number[i]<lowestNumber) {
				lowestNumber = number[i];
			}

		}
		
		JOptionPane.showMessageDialog(null, "O menor número informado é: " + lowestNumber);
		
	}

}
