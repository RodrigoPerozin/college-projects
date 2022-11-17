package model;

public class Coupon {

	private String date;
	private String description;
	private int souldAmount;
	private double amount;
	
	public Coupon(String date, String description, int souldAmount, double amount) {
		this.date = date;
		this.description = description;
		this.souldAmount = souldAmount;
		this.amount = amount;
	}
	
	public String getDate(){
		return date;
	}
	
	public String getDescription() {
		return description;
	}
	
	public int getSouldAmount() {
		return souldAmount;
	}
	
	public double getAmount() {
		return amount;
	}
	
}
