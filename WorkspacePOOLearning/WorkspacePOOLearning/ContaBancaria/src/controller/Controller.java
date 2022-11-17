package controller;

import java.util.ArrayList;
import model.*;
import view.Graphics;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class Controller {
	
	ArrayList<Account> accountList = new ArrayList<Account>();
	Account account = null;

	public void showMenu() {
		
		int option;
		int type;
		double amountMoney;
		Movement movement;
		String date;
		String accType="";
		String accountSelected;
		String[] accounts;
		String statement="";
		String movType;
		int count=0;
		int statementSelected;
		ArrayList<Movement> movementList;
		
		do {
			statement="";
			accounts = new String[accountList.size()];
			for(Account acc : accountList) {
				if(acc.getType()==1) {
					accType="Conta poupança";
				}else {
					accType="Conta corrente";
				}
				accounts[count] = acc.getOwner()+" - "+accType;
				count++;
			}
		
			if(account==null) {
				option = Graphics.requestMenuOption(false);
			}else {
				count = 0;
				option = Graphics.requestMenuOption(true);
			}
			
			switch(option) {
				
				case 0:
					
					String owner = Graphics.requestOwner();
					if(owner=="-1") {
						Graphics.showMsgFailedOperation();
					}else {
						type = Graphics.requestType();
						if(type == -1) {
							Graphics.showMsgFailedOperation();
						}else{
							account = new Account(owner, type);
							accountList.add(account);
							Graphics.showMsgAccount();
							System.out.print("ACC_CREATED: "+account.getOwner()+" ACC_TYPE: "+account.getType()+" ACC_MONEYATUAL: "+account.consultBalance()+"\n");
						}
						
					}

				break;
					
				case 1:
					
					accountSelected = Graphics.requestAccount(accounts, "Conta a efetuar o depósito");
					
					if(accountSelected==null) {
						Graphics.showMsgFailedOperation();
					}else {
						
						for(Account acc : accountList) {
							if(accountSelected.contains(acc.getOwner())) {
								account = acc;
							}
						}
						
						amountMoney = Graphics.requestMoney("a ser depositado");
						if(amountMoney==-1) {
							Graphics.showMsgFailedOperation();
						}else {
							DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");
							date = dtf.format(LocalDateTime.now());
							account.deposit(amountMoney);
							movement = new Movement(2, amountMoney, date);
							account.getMovementList().add(movement);
							Graphics.showMsgDeposit();
							System.out.print("NEW_DEPOSIT: "+account.getOwner()+" AMOUNT: "+amountMoney+" DATE: "+ date+" ACC_MONEYATUAL: "+account.consultBalance()+"\n");
						}
						
						
					}
					
				break;
					
				case 2:
					
					accountSelected = Graphics.requestAccount(accounts, "Conta a efetuar o saque");
					
					if(accountSelected==null) {
						Graphics.showMsgFailedOperation();
					}else {
						
						for(Account acc : accountList) {
							if(accountSelected.contains(acc.getOwner())) {
								account = acc;
							}
						}
						
						amountMoney = Graphics.requestMoney("do saque");
						if(amountMoney==-1) {
							Graphics.showMsgFailedOperation();
						}else if((account.consultBalance() - amountMoney)<-1000){
							Graphics.showMsgFailedWithdraw();
						}else {
							DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");
							date = dtf.format(LocalDateTime.now());
							account.withdraw(amountMoney);
							movement = new Movement(1, amountMoney, date);
							account.getMovementList().add(movement);
							Graphics.showMsgWithdraw();
							System.out.print("NEW_WITHDRAW: "+account.getOwner()+" AMOUNT: "+amountMoney+" DATE: "+ date+" ACC_MONEYATUAL: "+account.consultBalance()+"\n");
						}
						
					}
					
				break;
					
				case 3:
					
					accountSelected = Graphics.requestAccount(accounts, "Conta a exibir saldo");
					if(accountSelected==null) {
						Graphics.showMsgFailedOperation();
					}else {
						
						for(Account acc : accountList) {
							if(accountSelected.contains(acc.getOwner())) {
								account = acc;
							}
						}
						
						Graphics.showBalance(account.consultBalance(), account.getOwner());
					}
					
					
				break;
				case 4:
					
					accountSelected = Graphics.requestAccount(accounts, "Conta a exibir dados");
					if(accountSelected==null) {
						Graphics.showMsgFailedOperation();
					}else {
						
						for(Account acc : accountList) {
							if(accountSelected.contains(acc.getOwner())) {
								account = acc;
								if(account.getType()==1) {
									accType="Conta poupança";
								}else {
									accType="Conta corrente";
								}
							}
						}
						
						Graphics.showAccountInfo(account.getOwner(), accType, account.consultBalance());
						
					}
					
				break;
				case 5:
					
					accountSelected = Graphics.requestAccount(accounts, "Conta a exibir extrato");
					if(accountSelected==null) {
						Graphics.showMsgFailedOperation();
					}else {
						
						for(Account acc : accountList) {
							if(accountSelected.contains(acc.getOwner())) {
								account = acc;
							}
						}
						
						statementSelected = Graphics.requestStatement();
						if(statementSelected==-1) {
							Graphics.showMsgFailedOperation();
						}else {
							
							movementList = account.getMovementList();
							
							
							switch(statementSelected) {
								case 0:
									for(Movement mov : movementList) {
										if(mov.getType()==2) {
											movType = "Depósito";
											
										}else {
											movType = "Saque";
											
										}
										statement += "Tipo de movimento: "+movType+"\nValor: R$"+String.format("%.2f", mov.getValue())+"\nData: "+mov.getDate()+"\n\n";
									}
									
									Graphics.showStatement(statement, "Extrato completo");
								break;
								case 1:
									for(Movement mov : movementList) {
										if(mov.getType()==2) {
											statement += "Tipo de movimento: Depósito\nValor: R$"+String.format("%.2f", mov.getValue())+"\nData: "+mov.getDate()+"\n\n";
										}
									}
									
									Graphics.showStatement(statement, "Extrato de depósitos");
								break;
								case 2:
									for(Movement mov : movementList) {
										if(mov.getType()==1) {
											statement += "Tipo de movimento: Saque\nValor: R$"+String.format("%.2f", mov.getValue())+"\nData: "+mov.getDate()+"\n\n";
										}
									}
									
									Graphics.showStatement(statement, "Extrato de saques");
								break;
							}
							
						}
						
					}
					
				break;
				
			}
		
		} while (option!=6);
		
		Graphics.showMsgExit();
		
	}

}
