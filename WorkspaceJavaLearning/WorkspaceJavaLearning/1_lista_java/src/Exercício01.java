import javax.swing.JOptionPane;
public class Exercício01 {

	public static void main(String[] args) {
		
		int hours ;
		int minutes;
		int seconds;
		int secondsResult;
		
		//1h = 60min = 60s
		
		hours = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de horas: "));
		minutes = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de minutos: "));
		seconds = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de segundos: "));
		
		secondsResult = ((hours*60)*60) + (minutes*60) + seconds;
		
		JOptionPane.showMessageDialog(null, "Total de segundos no horário informado: " + secondsResult);
		
	}

}
