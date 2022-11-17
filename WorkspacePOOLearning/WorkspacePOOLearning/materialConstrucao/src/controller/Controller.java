package controller;

import model.*;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import view.Graphics;

public class Controller {
	
	protected Shop shop= null;

	public void showMenu() {
		
		shop = new Shop();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");
		Product product = null;
		Coupon coupon = null;
		String toShow="";
		String date="";
		String description="";
		String[] options = null;
		double price=0;
		double profit=0;
		int amount=0;
		int count=0;
		int option=0;
		int id=0;
		
		
		do {
			
			if(product==null) {
				option = Graphics.showOptionMenu(false);
			}else {
				option = Graphics.showOptionMenu(true);
				count=0;
				toShow="";
			}
			
			switch(option) {
			
				case 0: //Cadastrar Produto.
					
					id = Graphics.getProductId();
					for(Product prod : shop.getProductList()) {
						if(id==prod.getId()) {
							id = -2;
						}
					}
					
					if(id==-1) {
						Graphics.showMsgFailedOperation(-1);
					}else if(id==-2){
						Graphics.showMsgFailedOperation(-2);
					}else {
						description = Graphics.getProductDescription();
						if(description=="-1") {
							Graphics.showMsgFailedOperation(-1);
						}else {
							price = Graphics.getProductPrice();
							if(price==-1 || price<0) {
								Graphics.showMsgFailedOperation(-1);
							}else {
								product = new Product(id, description, price);
								shop.getProductList().add(product);
								Graphics.showMsgProductRegister(description);
								System.out.print("_NEWPRODUCTREGISTERED: "+description+" _ID: "+id+" _PRICE: "+price+"\n");
							}
						}
					}
					
				break;
				case 1: //Dar entrada em produto no estoque.
		
					options = new String[shop.getProductList().size()];
					for(Product prod : shop.getProductList()) {
						options[count] = Integer.toString(prod.getId());
						count++;
					}
					
					id = Graphics.getProductId(options);
					if(id==-1) {
						Graphics.showMsgFailedOperation(-1);
					}else {
						for(Product prod : shop.getProductList()) {
							if(id==prod.getId()) {
								amount = Graphics.getAmount(prod.getDescription());
								if(amount==-1 || amount<0 || amount==0){
									Graphics.showMsgFailedOperation(-1);
								}else {
									prod.setAmount(amount);
									shop.getStockedProductList().add(prod);
									System.out.print("_PRODUCTADDEDTOSTOCK: "+prod.getDescription()+" _PRODUCTLISTAMOUNT: "+prod.getAmount()+"\n");
									for(Product prodStock : shop.getStockedProductList()) {
										if(id==prodStock.getId()) {
											System.out.print("_CONSULTINGPRODUCT: "+prod.getDescription()+" _INSTOCK _AMOUNT: "+prodStock.getAmount()+"\n");
										}
									}
									Graphics.showMsgProductStock(prod.getDescription());
								}
							}
						}
					}
					
					
				break;
				case 2: //Vender produto.
					
					if(shop.getStockedProductList().isEmpty()) {
						Graphics.showMsgFailedOperation(-3);
					}else {
						
						options = new String[shop.getStockedProductList().size()];
						for(Product prodStocked : shop.getStockedProductList()) {
							options[count] = prodStocked.getDescription();
							count++;
						}
						
						description = Graphics.getProductDescription(options);
						if(description=="-1") {
							Graphics.showMsgFailedOperation(-1);
						}else {
							for(Product prodStock : shop.getStockedProductList()) {
								if(prodStock.getDescription().contentEquals(description)) {
									amount = Graphics.getAmountSell(description, prodStock.getAmount());
									if(amount==-1 || amount<0 || (prodStock.getAmount()-amount<0)){
										Graphics.showMsgFailedOperation(-1);
									}else {
										prodStock.setAmount(prodStock.getAmount()-amount);
										date = dtf.format(LocalDateTime.now());
										coupon = new Coupon(date, description, amount, amount*prodStock.getPrice());
										shop.getSellsList().add(coupon);
										System.out.print("_PRODUCTSELLACTION: "+prodStock.getDescription()+" _AMOUNTSELLED: "+amount+" _PRODUCTAMOUNTNOW: "+prodStock.getAmount()+" Date: "+date+"\n");
										for(Product prod : shop.getProductList()) {
											if(prod.getDescription().contentEquals(description)) {
												prod.setAmount(prodStock.getAmount());
											}
										}
										
										Graphics.showMsgProductSell();
										if(prodStock.getAmount()==0) {
											product = prodStock;
										}
									}
								}
							}
							
							if(product.getAmount()==0) {
								shop.getStockedProductList().remove(product);
							}
						
						}
					}
					
				break;
				case 3: //Exibir produtos cadastrados.
					
					if(shop.getProductList().isEmpty()) {
						Graphics.showMsgFailedOperation(-5);
					}else {
						for(Product prod : shop.getProductList()) {
							toShow += "Produto: "+prod.getDescription()+"\nCódigo: "+prod.getId()+"\nPreço: R$"+String.format("%.2f", prod.getPrice())+"\n\n";
						}
						Graphics.showMsgStatement(toShow, "Produtos cadastrados");
					}
					
				break;
				case 4: //Exibir produtos em estoque.
					
					if(shop.getStockedProductList().isEmpty()) {
						Graphics.showMsgFailedOperation(-3);
					}else {
						for(Product prodStock : shop.getStockedProductList()) {
							toShow += "Produto: "+prodStock.getDescription()+"\nCódigo: "+prodStock.getId()+"\nPreço: R$"+String.format("%.2f", prodStock.getPrice())+"\nDisponível: "+prodStock.getAmount()+" unidades\n\n";
						}
						Graphics.showMsgStatement(toShow, "Produtos em estoque");
					}
					
				break;
				case 5: //Exibir Cupons.
					
					if(shop.getSellsList().isEmpty()) {
						Graphics.showMsgFailedOperation(-4);
					}else {
						for(Coupon cp : shop.getSellsList()) {
							toShow += "Produto: "+cp.getDescription()+"\nQuantidade vendida: "+cp.getSouldAmount()+"\nPreço da venda: R$"+String.format("%.2f", cp.getAmount())+"\nData e hora: "+cp.getDate()+"\n\n";
						}
						Graphics.showMsgStatement(toShow, "Cupons gerados");
					}
					
				break;
				case 6: //Exibir a renda de todas as vendas.
					
					if(shop.getSellsList().isEmpty()) {
						Graphics.showMsgFailedOperation(-4);
					}else {
						profit=0;
						for(Coupon cp : shop.getSellsList()) {
							profit += cp.getAmount();
						}
						toShow="Lucro total das vendas até agora: R$"+String.format("%.2f", profit);
						Graphics.showMsgStatement(toShow, "Cupons gerados");
					}
					
				break;
			}
			
		} while (option != 7);
		
		Graphics.showExitMsg();
			
	}
	
}
