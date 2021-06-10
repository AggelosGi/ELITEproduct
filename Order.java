import java.util.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Order {

	public string shopping_list []; //products included in the order
	public string orderSummary; //order summary
	public double quantities; //quantities of products
	
	
	/*shopping list*/
	
	public retBuyList() {
		return shopping_list[];
	}
	
	
	/*update shopping list*/
	
	private void updateBuyList() {
		  this.shopping_list = shopping_list;
	} 
	
	
	/*order Summary*/
	
	public retOrderSummary () {
		return orderSummary;
	}
	
	
	/*send order summary on buyer's email*/
	
	public sendSummaryViaMail() {
		System.out.println("your Order Summary will be sent via email");
	}
	
	
	/*desirable quantity*/
	
	public selectDesirableQuantity() {
		System.out.println("Select one of the following quantities", quantities);
	}
	
	
	/*all available the quantities*/
	
	public selectQuantity() {
		System.out.println("Available quantities:", quantities);
	}
}
