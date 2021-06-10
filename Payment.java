import java.time.LocalDateTime;
import java.io.*;
import java.util.*;

public class Payment {

	public String CreditCardFields, PaypalFields; //fields in each way of payment
	
	public String checkoutmess; //ckeckout message
	
	private long card_number; //the card number
	
	private string state; //state of the continue button
	
	private string card_name; //the name of the card holder
	
	private int card_id; //the card id for later use
	  
	private int cvv; //the validation code for the card. Supported for payments but not for saving payment cards for future use
	
	private LocalDateTime expiredate; //the expire date of the card 
	
	private string paypal_mail; //the mail to log in to paypal account
	
	private string paypal_pass; // the password for the paypal account
	
	private double delivery_charges; //pay on delivery charges
	 
	
	
	//return the credit card fields
	public retCreditCardFields () {
		return CreditCardFields;
	}
	
	
	//return the paypal fields
	public retPaypalFields () {
		return PaypalFields;
	}
	
	
	//return the pay on delivery costs
	public retPayonDeliveryCosts () {
		return delivery_charges;
	}
	
	
	//activate the checkout button aftes accepting the use of terms
	private boolean activateCheckoutButt() {
		return state == ACTIVATE;
	}
	
	
	//return the checkout message
	public retCheckoutMessage() {
		System.out.println("Checkout Message:", checkoutmess);
	}
	
	
	//select payment options
	private selectPaymentoptions() {
		System.out.println("Select payment a option");
	}
	
	
	//select credit card as a way of payment
	public selectCreditCard(){
		System.out.println("You have selected Credit Card as your way of payment");
	}
	
	
	//select paypal as a way of payment
	public select Paypal() {
		System.out.println("You have selected Paypal as your way of payment");
	}
	
	
	
	//select pay on delivery as a way of payment
	public selectPayonDelivery() {
		System.out.println("You have selected Pay on Delivery as your way of payment");
	}
	
	
	
	//accept terms of use
	private void acceptTermsofUse() {
		
	}
	
	
	
	//reject terms of use
	private void rejectTermsofUse() {
		System.out.println("You have to agree to the terms of use in order to continue with payment.");
	}
	
	
	
	//get credit card fields
	public getCreditCardFields() {
		return CreditCardFields;
	}
	
	
	
	//get paypal fields
	public getPaypalFields() {
		return PaypalFields;
	}
	
	
	//get pay on delivery costs
	public getPayonDeliveryCosts() {
		return delivery_charges;
	}
	
	
	//get the checkout message
	public getCheckoutMessage() {
		return checkoutmess;
	}
	
	
}
