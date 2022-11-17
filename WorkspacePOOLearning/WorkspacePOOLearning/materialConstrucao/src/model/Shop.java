package model;

import java.util.ArrayList;

public class Shop {

	private ArrayList<Product> productList = new ArrayList<Product>();
	private ArrayList<Product> stockedProductList = new ArrayList<Product>();
	private ArrayList<Coupon> sellsList = new ArrayList<Coupon>();
	
	public ArrayList<Product> getProductList(){
		return productList;
	}
	
	public ArrayList<Product> getStockedProductList(){
		return stockedProductList;
	}
	
	public ArrayList<Coupon> getSellsList(){
		return sellsList;
	}
	
}
