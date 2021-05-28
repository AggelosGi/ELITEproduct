import java.time.LocalDateTime;

public class Payment {

	private string card_number; //the card number
	
	private string card_name; //the name of the card holder
	
	private int card_id; //the card id for later use
	
	private int cvv; //the validation code for the card. Supported for payments but not for saving payment cards for future use
	
	private LocalDateTime expiredate; //the expire date of the card 
	
	private string paypal_mail; //the mail to log in to paypal account
	
	private string pass; // the password for the paypal account
	
	private double delivery_charges; //pay on delivery charges
	
	
	public retCreditCardFields () {
		
	}
	
	public retPaypalFields () {
		
	}
	
	public retPayonDeliveryCosts () {
		
	}
	
	private activateCheckoutMessage() {
		
	}
	
	public retCheckoutMessage() {
		
	}
	
	private selectPaymentoptions() {
		
	}
	
	public selectCreditCard(){
		
	}
	
	public select Paypal() {
		
	}
	
	public selectPayonDelivery() {
		
	}
	
	private acceptTermsofUse() {
		
	}
	
	private rejectTermsofUse() {
		
	}
	
	public getCreditCardFields() {
		
	}
	
	public getPaypalFields() {
		
	}
	
	public getPayonDeliveryCosts() {
		
	}
	
	public getCheckoutMessage() {
		
	}
	
	
}
