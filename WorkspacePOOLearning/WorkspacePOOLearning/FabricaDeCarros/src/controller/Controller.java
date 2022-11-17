package controller;
import model.*;
import view.InputOutput;

public class Controller {
	
	Factory factory = null;

	public void showMenu() {
		
		int option = 0;
		
		do {

			if(factory==null || factory.getCarList().size()==0) {
				option = InputOutput.callGetOptionMenu(false);
			}else {
				option = InputOutput.callGetOptionMenu(true);
			}
			
			switch(option) {
			
				case 0:
					
					if(factory==null) {
						factory = new Factory();
					}
					
					int carAmount = InputOutput.callGetCarAmount();
					
					for(int i=0; i<carAmount; i++){
						Car car = new Car();
						car.setModel(InputOutput.callGetCarModel(i+1));
						car.setColor(InputOutput.callGetCarColor(i+1));
						factory.createCar(car);
					}
					
					InputOutput.showMsgCarCreated();
					
				break;		
				case 1:
					
					
					
					String[] carsAvaliable = new String[factory.getCarList().size()];
					
					
						
					String desc = "";
					int count = 0;
						
					for(Car car : factory.getCarList()) {
						
						desc = car.getModel() + " - " + car.getColor();
						carsAvaliable[count] = desc;
						count++;
						
					}
					
					int index = InputOutput.callGetCarSell(carsAvaliable);
					
					if(index!=-1) {
						factory.sellCar(index);
						InputOutput.showMsgCarSelled();
					}else {
						InputOutput.showMsgFailedSell();
					}
					
				break;
				case 2:
					 
					InputOutput.showCarsInfo(factory.getCarList());
					
				break;
			
			}
			
		} while (option !=3);
		
		InputOutput.showMsgBye();
		System.exit(0);
	
	}
	
}
