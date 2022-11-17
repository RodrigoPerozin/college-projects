package view;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class Graphics {

	public static int showOptionMenu(boolean productExist){
		
		String[] options1 = {"Cadastrar produto", "Sair"};
		String[] options2 = {"Cadastrar produto", "Dar entrada de produto no estoque","Vender um produto", "Exibir produtos cadastrados", "Exibir produtos em estoque","Exibir cupons", "Exibir lucro das vendas", "Sair"};
		
		JComboBox<String> comboMenu = null;
		
		if(!productExist) {
			comboMenu = new JComboBox<String>(options1);
		}else {
			comboMenu = new JComboBox<String>(options2);
		}
		
		int confirm1 = JOptionPane.showConfirmDialog(null, comboMenu, "Menu da Loja", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
		int index = comboMenu.getSelectedIndex();
		
		if(comboMenu.getItemCount()==2 && index==1 || confirm1 == JOptionPane.CANCEL_OPTION){
			index = 7;
		}
		
		return index;
	}

	public static void showExitMsg() {
		
		JOptionPane.showMessageDialog(null, "Programa encerrado! Até a próxima.");
		
	}

	public static int getProductId() {
		
		int id = Integer.parseInt(verifyString("Informe o código do produto a ser cadastrado:"));
		
		if(id<0) {
			return -1;
		}
		
		return id;
	}

	private static String verifyString(String msg) {
		
		String value = JOptionPane.showInputDialog(msg);
		
		if(value==null || value.length()==0 || value.isBlank()) {
			return "-1";
		}
		
		return value;
	}

	public static void showMsgFailedOperation(int status) {
		
		if(status==-1) {
			JOptionPane.showMessageDialog(null, "Operação cancelada!");
		}else if(status==-2) {
			JOptionPane.showMessageDialog(null, "Operação cancelada! Este código de produto já está cadastrado!");
		}else if(status==-3) {
			JOptionPane.showMessageDialog(null, "Operação cancelada! Não há produtos em estoque!");
		}else if(status==-4){
			JOptionPane.showMessageDialog(null, "Operação cancelada! Nenhuma venda foi realizada!");
		}else {
			JOptionPane.showMessageDialog(null, "Operação cancelada! Não há produtos cadastrados!");
		}
		
	}

	public static String getProductDescription() {
		
		String description = verifyString("Informe a descrição do produto a ser cadastrado:");
		
		return description;
	}

	public static double getProductPrice() {
		
		double price = Double.parseDouble(verifyString("Informe o preço do produto a ser cadastrado:"));
		
		return price;
	}

	public static int getProductId(String[] options) {
		
		JComboBox<String> comboProduct = new JComboBox<String>(options);
		
		int confirm1 = JOptionPane.showConfirmDialog(null, comboProduct, "Selecione o código do produto", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
		int id = Integer.parseInt(comboProduct.getSelectedItem().toString());
		if(confirm1 == JOptionPane.CANCEL_OPTION){
			id=-1;
		}
		
		return id;
	}
	
	public static String getProductDescription(String[] options) {
		
		JComboBox<String> comboProduct = new JComboBox<String>(options);
		
		int confirm1 = JOptionPane.showConfirmDialog(null, comboProduct, "Selecione o produto para venda", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
		String description = comboProduct.getSelectedItem().toString();
		if(confirm1 == JOptionPane.CANCEL_OPTION){
			description="-1";
		}
		
		return description;
	}

	public static int getAmount(String description) {
		
		int amount = Integer.parseInt(verifyString("Informe a quantidade de '"+description+"' a dar entrada no estoque:"));
		
		return amount;
	}
	
	public static int getAmountSell(String description, int amount) {
		
		int amountToSell = Integer.parseInt(verifyString("Informe a quantidade de '"+description+"' a ser vendido(a) ("+amount+" Disponíveis):"));
		
		return amountToSell;
	}

	public static void showMsgProductRegister(String description) {
		
		JOptionPane.showMessageDialog(null, "Produto '"+description+"' registrado com sucesso!");
		
	}

	public static void showMsgProductStock(String description) {
		
		JOptionPane.showMessageDialog(null, "A entrada de '"+description+"' no estoque foi efetuada com sucesso!");
		
	}

	public static void showMsgProductSell() {
		
		JOptionPane.showMessageDialog(null, "Venda realizada com sucesso! Você pode ver o cupom dessa venda acessando o menu da loja!");
		
	}

	public static void showMsgStatement(String toShow, String title) {
		
		JOptionPane.showMessageDialog(null, toShow, title, JOptionPane.INFORMATION_MESSAGE);
		
	}
	
}
