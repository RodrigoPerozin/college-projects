package model;

public class Movement {

	private int type;
	private double value;
	private String date;
	
	public Movement(int type, double value, String date){
		this.type = type;
		this.value = value;
		this.date = date;
	}
	
	public int getType() {
		return type;
	}
	
	public double getValue() {
		return value;
	}
	
	public String getDate() {
		return date;
	}
	
}
