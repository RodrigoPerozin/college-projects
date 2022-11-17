package model;

import java.util.ArrayList;

public class Factory {

	private ArrayList<Car> carList = new ArrayList<Car>();
	
	public void sellCar(int index) {
		carList.remove(index);
	}
	
	public void createCar(Car car) {
		carList.add(car);
	}
	
	public ArrayList<Car> getCarList(){
		return carList;
	}
	
}
