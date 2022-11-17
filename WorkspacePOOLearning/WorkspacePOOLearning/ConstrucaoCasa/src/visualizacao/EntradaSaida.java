package visualizacao;

import java.util.ArrayList;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;

import modelo.Aberturas;

public class EntradaSaida {

	public static int solicitaOpcao(boolean cosntruida) {
		
		String[] opcoes1 = {"Construir casa", "Sair do programa"};
		String[] opcoes2 = {"Construir casa", "Movimentar portas ou janelas", "Ver informações da casa", "Sair do programa"};
		JComboBox<String> menu = null;
		int index=3;
		
		if(cosntruida==false) {
			menu = new JComboBox<String>(opcoes1);
		}else{
			menu = new JComboBox<String>(opcoes2);
		}
		
		JOptionPane.showConfirmDialog(null, menu, "Selecione a opcao desejada", JOptionPane.OK_CANCEL_OPTION);
		
		index = menu.getSelectedIndex();
		
		if(menu.getItemCount()==2 && menu.getSelectedIndex()==1) {
			index = 3;
		}
		
		return index;
	}
	
	public static void exibeMsgEncerraPrograma() {
		
		JOptionPane.showMessageDialog(null, "O programa será encerrado!");
		
	}
	
	public static String solicitaDescricao(String descricao, int ordem) {
		
		if(ordem==0) {
			return JOptionPane.showInputDialog("Informe a descrição da " + descricao);
		}else {
			return JOptionPane.showInputDialog("Informe a descrição  da "+ordem+"ª "+descricao);
		}
		
	}
	
	public static String solicitaCor() {
		return JOptionPane.showInputDialog("Informe a cor da casa:");
	}
	
	public static int solicitaQtdeAberturas(String abertura) {
		int qtdeAberturas = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de "+abertura+":"));
		while(qtdeAberturas<1) {
			JOptionPane.showMessageDialog(null, "Informe uma quantidade de "+abertura+" válida!");
			qtdeAberturas = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de "+abertura+":"));
		}
		return qtdeAberturas;
	
	}
	
	public static int solicitaEstado(String tipoAbertura) {
		
		String[] opcoes = {"Fechada", "Aberta"};
		return JOptionPane.showOptionDialog(null, "Informe o estado da "+tipoAbertura,
				"estado",
				JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[1]);
		
	}

	public static String solicitaTipoAbertura() {
		
		String[] opcoes = {"Porta", "Janela"};
		
		int tipoAbertura = JOptionPane.showOptionDialog(null, "Informe qual tipo de abertura deseja mover",
				"Mover Abertura", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[0]);
		
		if(tipoAbertura==0) {
			return "porta";
		}else {
			return "janela";
		}
	}

	public static int solicitaAberturaMover(ArrayList<Aberturas> listaDeAberturas) {
		
		String tipoAbertura = listaDeAberturas.get(0).getClass().getName();
		tipoAbertura = tipoAbertura.replaceAll("modelo.", "");
		int qtdeAbertura = listaDeAberturas.size();
		String[] descricoesAberturas = new String[qtdeAbertura];
		
		for(int i=0; i<qtdeAbertura; i++) {
			descricoesAberturas[i] = listaDeAberturas.get(i).getDescricao();
		}
		
		String msg = "Escolha a "+tipoAbertura+" a ser movimentada";
		JComboBox<String> exibicaoAberturas = new JComboBox<String>(descricoesAberturas);
		int confirmacao = JOptionPane.showConfirmDialog(null, exibicaoAberturas, msg, JOptionPane.OK_CANCEL_OPTION);
		
		if(confirmacao==0) {
			return exibicaoAberturas.getSelectedIndex();
		}else {
			return -1;
		}
	}
	
	public static void exibeMsgAbertura() {
		JOptionPane.showMessageDialog(null, "Nenhuma abertura será movimentada");
	}

	public static void exibeInfoCasa(String informacoes) {
		
		JOptionPane.showMessageDialog(null, informacoes, "Informações da casa", JOptionPane.INFORMATION_MESSAGE);
		
	}
	
}
