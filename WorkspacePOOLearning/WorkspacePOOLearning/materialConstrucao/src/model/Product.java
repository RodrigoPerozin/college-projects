package model;

public class Product {
	
	private int id;
	private String description;
	private double price;
	private int amount;
	
	public Product(int id, String description, double price) {
		this.id = id;
		this.description = description;
		this.price = price;
		this.amount = 0;
	}
	
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	public int getId() {
		return id;
	}
	
	public String getDescription() {
		return description;
	}

	public int getAmount() {
		return amount;
	}
	
	public double getPrice() {
		return price;
	}
	
}
