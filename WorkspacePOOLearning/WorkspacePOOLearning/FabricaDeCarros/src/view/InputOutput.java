package view;

import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import model.Car;

public class InputOutput {

	public static int callGetOptionMenu(boolean carExist) {
		
		String[] options1 = {
				"Fabricar carros",
				"Vender um carro",
				"Ver informações dos carros",
				"Sair"
		};
		
		String[] options2 = {
				"Fabricar carros",
				"Sair"
		};
		
		JComboBox<String> comboOptionMenu;
		
		if(!carExist) {
			comboOptionMenu = new JComboBox<String>(options2);
		}else {
			comboOptionMenu = new JComboBox<String>(options1);
		}
		
		int confirm = JOptionPane.showConfirmDialog(null, comboOptionMenu, "Informe a ação desejada:", JOptionPane.OK_CANCEL_OPTION);
		
		int index = comboOptionMenu.getSelectedIndex();
		
		if(confirm==JOptionPane.CANCEL_OPTION){
			
			int confirm2 = JOptionPane.showConfirmDialog(null, "Deseja realmente sair do programa?", null, JOptionPane.OK_CANCEL_OPTION);
			if(confirm2==JOptionPane.OK_OPTION) {
				index=3;
			}else {
				index = 4;
			}
			
		}else if(comboOptionMenu.getItemCount()==2 && index==1) {
	
			index = 3;
			
		}

		return index;
	}

	public static void showMsgBye() {
		
		JOptionPane.showMessageDialog(null, "Fábrica de carros encerrada. Até a próxima!");
		
	}

	public static int callGetCarAmount() {
		
		int amount = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de carros que deseja fabricar:"));
		while(amount < 1) {
			JOptionPane.showMessageDialog(null, "Informe uma quantidade de carros válida!");
			amount = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de carros que deseja fabricar:"));
		}
		
		return amount;
	}

	public static String callGetCarModel(int carCount) {
			
		String model = JOptionPane.showInputDialog("Informe o modelo do "+carCount+"° carro:");
		while(model=="" || model.length()>30) {
			JOptionPane.showMessageDialog(null, "Informe um modelo de carro válido!");
			model = JOptionPane.showInputDialog("Informe o modelo do "+carCount+"° carro:");
		}
		
		return model;
	}

	public static String callGetCarColor(int carCount) {
		
		String color = JOptionPane.showInputDialog("Informe a cor do "+carCount+"° carro:");
		while(color=="" || color.length()>30) {
			color = JOptionPane.showInputDialog("Informe a cor do "+carCount+"° carro:");
		}
		
		return color;
	}

	public static void showMsgCarCreated() {
		
		JOptionPane.showMessageDialog(null, "Carro(s) criado(s) com sucesso!");
		
	}

	public static void showMsgCarSelled() {
		
		JOptionPane.showMessageDialog(null, "Carro vendido com sucesso!");
		
	}

	public static int callGetCarSell(String[] carsAvaliable) {
		
		JComboBox<String> comboCars = new JComboBox<String>(carsAvaliable);
		
		int confirm = JOptionPane.showConfirmDialog(null, comboCars, "Informe o carro a ser vendido:", JOptionPane.OK_CANCEL_OPTION);
		int index = comboCars.getSelectedIndex();
		if(confirm!=-1) {
			return index;
		}else {
			return -1;
		}
		
	}

	public static void showMsgFailedSell() {

		JOptionPane.showMessageDialog(null, "A venda do carro falhou!");
		
	}

	public static void showCarsInfo(ArrayList<Car> carList) {
		
		String info = "Informações dos carros:\n\n";
		
		for(Car car : carList) {
		
			info += "Carro: "+car.getModel()+"\nCor: "+car.getColor()+"\n\n";
			
		}
		
		info += "Total de carros: "+carList.size();
		
		JOptionPane.showMessageDialog(null, info);
		
	}

	
	
}
