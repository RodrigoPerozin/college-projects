import javax.swing.JOptionPane;
public class Exerc�cio05 {

	public static void main(String[] args) {
		
		short idade;
		short pessoasMaior=0;
		
		for(short i=0; i<12; i++) {
			
			idade = Short.parseShort(JOptionPane.showInputDialog("Informe a idade da " + (i+1) + "� pessoa: "));
			
			if(idade>=18) {
				pessoasMaior += 1;
			}
			
		}
		
		JOptionPane.showMessageDialog(null, "De todas as 12 pessoas, " + pessoasMaior + " delas s�o de maior.");

	}

}