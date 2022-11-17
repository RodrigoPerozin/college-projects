package model;

import java.util.ArrayList;

public class Account {

	private String owner;
	private int type;
	private double balance;
	private ArrayList<Movement> movementList = new ArrayList<Movement>();
	
	public Account(String owner, int type){
		this.owner = owner;
		this.type = type;
		this.balance = 0;
	}
	
	public String getOwner() {
		return owner;
	}
	
	public int getType() {
		return type;
	}
	
	public ArrayList<Movement> getMovementList(){
		return movementList;
	}
	
	public void deposit(double value) {
		this.balance += value;
	}
	
	public void withdraw(double value) {
		this.balance -= value;
	}
	
	public double consultBalance() {
		return balance;
	}
	
}
