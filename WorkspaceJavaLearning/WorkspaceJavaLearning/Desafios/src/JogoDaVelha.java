import javax.swing.JOptionPane;

public class JogoDaVelha {

	public static void main(String[] args) {
		
		String board[][] = new String[3][3];
		int pos = 0;
		int winner = 0;
		int count=0;
		int mod=0;
		String verifyResult="";
		String symbol = "";
		String[] playedPositions = new String[9];
		
		loadBoard(board, playedPositions);
		
		do {
			count++;
			mod = count%2;
			symbol = getSymbol(mod);
			pos = askPosition(mod, board, symbol, playedPositions);	
			doChanges(pos, board, symbol, playedPositions);
			winner=verifyStatus(board, symbol);
			
			System.out.print(count+" ");
			System.out.print(winner+"\n");
			

		} while(winner==1 && count<9);
		
		finalResult(winner, count, symbol);
		
		
	}

	private static void finalResult(int winner, int count, String symbol) {
		
		if(count==9 && winner==1) {
			showMsg("Fim de Jogo!\n\nVencedor: Não há um vencedor, deu velha!");
			System.out.print("Game ended!\n");
		}else{
			showMsg("Parabéns jogador "+symbol+"! Você venceu!");
		}
		
	}
	
public static void doChanges(int pos, String[][] board, String symbol, String[] playedPositions){
		
	for(int i=0;i<3;i++) {
		for(int o=0;o<3;o++) {
			
			if(board[i][o].equals(Integer.toString(pos))) {
				board[i][o] = symbol;
				playedPositions[pos-1] = symbol;
				System.out.print("Player 1 sucefully played!\n");
			}
			
		}
		
	}
			
}

public static int askPosition(int mod, String[][] board, String symbol, String[] playedPositions) {
	
	String boardShowInput = "Decisão do jogador " + (mod+1) + "(" + symbol + ")" + ":\n\n";
	
	for(int i=0;i<3;i++) {
		for(int o=0;o<3;o++) {
			boardShowInput += board[i][o] + "   ";
		}
		boardShowInput += "\n";
	}
	
	boardShowInput += "\nInforme a posição que deseja fazer a sua jogada:";
	
	int answer = askInt(boardShowInput);
	while(answer<1 || answer>9 || (verifyOcupation(answer-1, playedPositions)==true)){
		showMsg("Informe uma posição válida!");
		answer = askInt(boardShowInput);
	}
	
	return answer;
	
}

public static boolean verifyOcupation(int answer, String[] playedPositions) {
	if(playedPositions[answer].equals("X") || playedPositions[answer].equals("O")) { //verificar
		return true;
	}
	return false;
}

public static int verifyStatus(String[][] board, String symbol){
		
		if(board[0][0].equals(symbol) && board[0][1].equals(symbol) && board[0][2].equals(symbol)) {
			return 2;
		}else if(board[1][0].equals(symbol) && board[1][1].equals(symbol) && board[1][2].equals(symbol)) {
			return 2;
		}else if (board[2][0].equals(symbol) && board[2][1].equals(symbol) && board[2][2].equals(symbol)) {
			return 2;
		}else if (board[0][0].equals(symbol) && board[1][0].equals(symbol) && board[2][0].equals(symbol)) {
			return 2;
		}else if (board[0][1].equals(symbol) && board[1][1].equals(symbol) && board[2][1].equals(symbol)) {
			return 2;
		}else if (board[0][2].equals(symbol) && board[1][2].equals(symbol) && board[2][2].equals(symbol)) {
			return 2;
		}else if (board[0][0].equals(symbol) && board[1][1].equals(symbol) && board[2][2].equals(symbol)) {
			return 2;
		}else if (board[0][2].equals(symbol) && board[1][1].equals(symbol) && board[2][0].equals(symbol)) {
			return 2;
		}
	
		return 1;
	
}

public static String getSymbol(int mod){
	String symbol = "";
	if(mod==0) {
		symbol="O";
	}else {
		symbol="X";
	}
	return symbol;
}

public static void loadBoard(String[][] board, String[] playedPositions) {
	
	int loading = 0;
	
	for(int i=0;i<3;i++) {
		for(int o=0;o<3;o++) {
			loading++;
			board[i][o] = Integer.toString(loading);
		}
	}
	
	for(int i=0; i<9;i++) {
		playedPositions[i] = "";
	}
	
	System.out.print("board loaded!\n");
	
}

public static int askInt(String ask) {
	
	int option = Integer.parseInt(JOptionPane.showInputDialog(ask));
	return option;
	
}

public static void showMsg(String msg) {

	JOptionPane.showMessageDialog(null, msg);

}

}
