import javax.swing.JOptionPane;
public class Exercício01 {

	public static void main(String[] args) {
		
		String msg = "";
		
		for(int i=1;i<=10;i++) {
			msg += "A careca do Silvio brilha, brilha a careca do Silvio\n";
		}
		
		JOptionPane.showMessageDialog(null, msg);

	}

}