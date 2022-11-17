package view;

import javax.swing.JOptionPane;
import javax.swing.JComboBox;

public class Graphics {

	public static int requestMenuOption(boolean accountExist) {
		
		String[] options1 = {"Criar conta bancária", "Sair"};
		String[] options2 = {"Criar conta bancária", "Depositar", "Sacar", "Exibir Saldo", "Exibir dados de uma conta", "Gerar Extrato", "Sair"};
		
		JComboBox<String> comboMenu;
		
		if(!accountExist) {
			comboMenu = new JComboBox<String>(options1);
		}else {
			comboMenu = new JComboBox<String>(options2);
		}
		
		int confirm1 = JOptionPane.showConfirmDialog(null, comboMenu, "Menu Inicial", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
		int index = comboMenu.getSelectedIndex();
		
		if(confirm1 == JOptionPane.CANCEL_OPTION) {
			
			int confirm2 = JOptionPane.showConfirmDialog(null, "Deseja realmente sair do programa?", "Encerrar programa", JOptionPane.OK_CANCEL_OPTION);
			if(confirm2 == JOptionPane.CANCEL_OPTION) {
				index = 7;
			}else {
				index = 6;
			}
			
		}else if(comboMenu.getItemCount()==2 && comboMenu.getSelectedIndex() == 1){
			index = 6;
		}
		
		return index;
	}
	
	public static String requestOwner() {
		
		String owner = verifyString("Informe o nome do titular da conta:");
		
		return owner;
	}
	
	public static int requestType() {
		
		String[] types = {"Conta poupança", "Conta corrente"};
		
		JComboBox<String> comboTypes = new JComboBox<String>(types);
		
		int confirm1 = JOptionPane.showConfirmDialog(null, comboTypes, "Tipo de conta", JOptionPane.OK_CANCEL_OPTION);
		
		if(confirm1 == JOptionPane.CANCEL_OPTION) {
			return -1;
		}else {
			return (comboTypes.getSelectedIndex()+1);
		}
	
	}
	
	public static double requestMoney(String action) {
		
		double amount = Double.parseDouble(verifyString("Informe o valor "+action+":"));
		
		if(amount == JOptionPane.CANCEL_OPTION || amount==-1 || amount<0) {
			return -1;
		}else {
			return amount;
		}
	}
	
	public static String requestAccount(String[] accounts, String action) {
		
		JComboBox<String> comboAccounts = new JComboBox<String>(accounts);
		
		int confirm1 = JOptionPane.showConfirmDialog(null, comboAccounts, action, JOptionPane.OK_CANCEL_OPTION);
		if(confirm1 == JOptionPane.CANCEL_OPTION) {
			return null;
		}else {
			return comboAccounts.getSelectedItem().toString();
		}
		
	}
	
	public static int requestStatement() {
		
		String[] statements = {"Extrato completo", "Extrato de depósitos", "Extrato de saques"};
		int option = JOptionPane.showOptionDialog(null, "Selecione qual extrato você deseja exibir:", "Extrato a exibir", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, statements, statements[0]);
		
		if(option == -1) {
			return -1;
		}else {
			return option;
		}
		
	}
	
	public static void showBalance(double balance, String owner) {
		JOptionPane.showMessageDialog(null, "Saldo atual da conta "+owner+":\n\nR$"+String.format("%.2f", balance));
	}
	
	public static void showAccountInfo(String owner, String accType, double balance) {
		JOptionPane.showMessageDialog(null, "Informações da conta:\n\nTitular da conta: "+owner+"\nTipo de conta: "+accType+"\nSaldo atual: R$"+String.format("%.2f", balance));
	}
	
	public static void showStatement(String statement, String title) {
		if(statement=="") {
			statement="No momento não há nenhum extrato a ser exibido!";
		}
		JOptionPane.showMessageDialog(null, statement, title, JOptionPane.INFORMATION_MESSAGE);
	}

	public static void showMsgExit() {
		
		JOptionPane.showMessageDialog(null, "Programa encerrado! Até a próxima.");
		
	}

	public static void showMsgFailedOperation() {
		
		JOptionPane.showMessageDialog(null, "Operação cancelada!");
		
	}

	public static void showMsgAccount() {
	
		JOptionPane.showMessageDialog(null, "Conta criada com sucesso!");
		
	}
	
	public static void showMsgDeposit() {
		
		JOptionPane.showMessageDialog(null, "Depósito efetuado com sucesso!");
		
	}
	
	public static void showMsgFailedWithdraw() {
	
		JOptionPane.showMessageDialog(null, "Falha ao efetuar saque, verifique se a conta não está/estará em R$1000 negativos!");
		
	}
	
	public static void showMsgWithdraw() {
		
	JOptionPane.showMessageDialog(null, "Saque efetuado com sucesso!");
		
	}
	
	public static String verifyString(String question) {
		
		String result = JOptionPane.showInputDialog(question);
		if(result==null || result.length()==0) {
			return "-1";
		}else {
			return result;
		}
		
	}
	
}
