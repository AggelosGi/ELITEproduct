import java.time.LocalDateTime;
import java.util.*;

public class Payment {

	public String CreditCardFields, PaypalFields; //fields in each way of payment
	
	public String checkoutmess; //ckeckout message
	
	private string card_number; //the card number
	
	private string state; //state of the continue button
	
	private string card_name; //the name of the card holder
	
	private int card_id; //the card id for later use
	  
	private int cvv; //the validation code for the card. Supported for payments but not for saving payment cards for future use
	
	private LocalDateTime expiredate; //the expire date of the card 
	
	private string paypal_mail; //the mail to log in to paypal account
	
	private string pass; // the password for the paypal account
	
	private double delivery_charges; //pay on delivery charges
	 
	
	public retCreditCardFields () {
		return CreditCardFields;
	}
	
	public retPaypalFields () {
		return PaypalFields;
	}
	
	public retPayonDeliveryCosts () {
		return delivery_charges;
	}
	
	private boolean activateCheckoutButt() {
		return state == ACTIVATE;
	}
	
	public retCheckoutMessage() {
		System.out.println("Checkout Message:", checkoutmess);
	}
	
	private selectPaymentoptions() {
		System.out.println("Select payment a option");
	}
	
	public selectCreditCard(){
		System.out.println("You have selected Credit Card as your way of payment");
	}
	
	public select Paypal() {
		System.out.println("You have selected Paypal as your way of payment");
	}
	
	public selectPayonDelivery() {
		System.out.println("You have selected Pay on Delivery as your way of payment");
	}
	
	
	
	
	private void acceptTermsofUse() {
		
	}
	
	
	
	
	private void rejectTermsofUse() {
		
	}
	
	
	
	
	public getCreditCardFields() {
		return CreditCardFields;
	}
	
	
	
	
	public getPaypalFields() {
		return PaypalFields;
	}
	
	
	
	public getPayonDeliveryCosts() {
		return delivery_charges;
	}
	
	
	
	public getCheckoutMessage() {
		return checkoutmess;
	}
	
	
}
