package controle;

import java.util.ArrayList;
import visualizacao.EntradaSaida;
import modelo.*;

public class Controladora {

	private Casa casa = null;
	
	public void exibeMenu() {
		
		int opcao;
		
		do {
			
			if(this.casa==null) {
				opcao = EntradaSaida.solicitaOpcao(false);
			}else {
				opcao = EntradaSaida.solicitaOpcao(true);
			}
			
			switch(opcao) {
				
				case 0:
					
					String descricao = EntradaSaida.solicitaDescricao("casa", 0);
					String cor = EntradaSaida.solicitaCor();
					int qtdePortas = EntradaSaida.solicitaQtdeAberturas("portas");
					int qtdeJanelas = EntradaSaida.solicitaQtdeAberturas("janelas");
					
					ArrayList<Aberturas> listaDePortas =  new ArrayList<Aberturas>();
					
					for(int i=0; i<qtdePortas; i++) {
						Porta porta = new Porta();
						porta.setDescricao( EntradaSaida.solicitaDescricao("porta", (i+1)) );
						porta.setEstado(EntradaSaida.solicitaEstado("porta"));
						listaDePortas.add(porta);
					}
					
					ArrayList<Aberturas> listaDeJanelas =  new ArrayList<Aberturas>();
					
					for(int i=0; i<qtdeJanelas; i++) {
						Janela janela = new Janela();
						janela.setDescricao( EntradaSaida.solicitaDescricao("janela", (i+1)) );
						janela.setEstado(EntradaSaida.solicitaEstado("janela"));
						listaDeJanelas.add(janela);
					}
					
					this.casa = new Casa(descricao, cor, listaDePortas, listaDeJanelas);
					
					System.out.print("Descricao da casa:"+ casa.getDescricao()+"\n");
					System.out.print("Cor da casa:"+ casa.getCor()+"\n");
					
					for(Aberturas porta : casa.getListaDePortas()) {
						System.out.print("Descricao da porta:"+ porta.getDescricao()+"\n");
						System.out.print("Estado da porta:"+ porta.getEstado()+"\n");
					}
					
					for(Aberturas janela : casa.getListaDeJanelas()) {
						System.out.print("Descricao da janela:"+ janela.getDescricao()+"\n");
						System.out.print("Estado da janela:"+ janela.getEstado()+"\n");
					}
					
					break;
					
				case 1:
					
					String tipoAbertura = EntradaSaida.solicitaTipoAbertura();
					
					ArrayList<Aberturas> listaDeAberturas = new ArrayList<Aberturas>();
					
					if(tipoAbertura.equals("porta")) {
						listaDeAberturas = this.casa.getListaDePortas();
					}else {
						listaDeAberturas = this.casa.getListaDeJanelas();
					}
					
					int posicao = EntradaSaida.solicitaAberturaMover(listaDeAberturas);
					int novoEstado=0;
					
					if(posicao != -1) {
						novoEstado = EntradaSaida.solicitaEstado(tipoAbertura);
						Aberturas abertura = this.casa.retornaAbertura(posicao, tipoAbertura);
						this.casa.moverAbertura(abertura, novoEstado);
						System.out.print("Novo estado da "+tipoAbertura+" '"+abertura.getDescricao()+"': "+abertura.getEstado()+"\n");
					}else {
						EntradaSaida.exibeMsgAbertura();
					}
					
					break;
					
				case 2:
					
					String informacoes=this.casa.geraInfoCasa();
					EntradaSaida.exibeInfoCasa(informacoes);
					
					break;
			
			}
			
		} while (opcao!=3);
		
		EntradaSaida.exibeMsgEncerraPrograma();
		
		System.exit(0);
		
	}
	
}
