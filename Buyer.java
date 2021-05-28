import java.util.*;


public class Buyer extends User{

	private String purchased_products [];//products that the buyer has purchased
	
	private Warehouse warehouse; //the warehouse where products are collected
	
	
	public void addOrder (Order o){
		orders.put(o.getID(), o);
		warehouse.addOrder(o);
	}
	
	public void productResume(){
		
	}
	
	public void selectDescAssortment(){
		return DescAssortment;
		
	}
	
	public void selectProduct(){
		
	}
	
	public void selectIncrAssortment(){
		return IncrAssortment;
	}
	
	public void selectPayment(){
		
	}
	
	private void fillinFields(){
		
	}
	
	public void selectOrderEntry(){
		
	}
	
	public void selectContShopping(){
		return order;
	}
	
	public void selectCheckout(){
		return Payment;
	}
	
	public void selectBackatBuyersMainMenu(){
		
	}
	
	public void selectProductEvaluation(){
		
	}
	
	public void selectLeaveComment(){
		
	}
}
