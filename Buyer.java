import java.util.*;
import java.util.ArrayList;
import java.util.List;


public class Buyer extends User{

	private String purchased_products [];//products that the buyer has purchased
	private Warehouse warehouse; //the warehouse where products are collected
	private String IncrAssortment[], DescAssortment []; //the product assortments
	private string property; //the user's property
	protected string email; //buyer's email
	protected long pass; //buyers pass
	public string product_resume; //the resume of the product
	
	
	
	public Buyer (string property, string email, long pass) {
		this.property = property;
		this.email = email;
		this.pass = pass;
	}
	
	
	
	/*add an order method*/
	
	public addOrder (Order o){
		orders.put(o.getID(), o);
		warehouse.addOrder(o);
	}
	
	
	/*product resume*/
	
	public productResume(){
		return product_resume;
	}
	
	
	/*assortment of preference*/
	
	public selectDescAssortment(){
		return DescAssortment [];
		
	}
	
	
	/*select desirable product*/
	
	public void selectProduct(){
		
	}
	
	
	
	/*assortment of preference*/
	
	public selectIncrAssortment(){
		return IncrAssortment[] ;
	}
	
	
	
	/*Payment*/
	
	public void selectPayment(){
		
	}
	
	
	
	/*fill in the payment fields*/
	
	private fillinFields(){
		System.out.println("Please fill in the following fields");
	}
	
	
	
	/*order entry*/
	
	public void selectOrderEntry(){
		  
	}
	
	
	
	
	
	/*Continue shopping*/
	
	public selectContShopping(){
		return order;
	}
	
	
	
	
	
	/*complete order, follow payment at checkout*/
	
	public selectCheckout(){
		return Payment;
	}
	
	
	
	/*return Back at the Main Menu*/
	
	public void selectBackatBuyersMainMenu(){
		
	}
	
	
	/*Evaluate products*/
	
	public selectProductEvaluation(){
		System.out.println("Evaluate out products");
	}
	
	
	/*Comment on products*/
	
	public selectLeaveComment(){
		System.out.println("Leave a comment in the section below");
	}
}
