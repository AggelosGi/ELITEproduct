import java.util.*;
import java.util.List;
import java.util.ArrayList;


public class Administrator {

	private String email; //admin's email
	private String pass; //admin's pass
	public int purchased_count; //how many products a buyers has bought 
	private int max=56; //var used for finding best seller
	private int counter, i, j; //vars used for assortments
	public String BestSeller; // the name of the best seller
	public String product; //product's name
	public  int productAmountCatalog[]; 
	private String variable; //used in assortment
	
	
	
	//select update assortment
	public void selectUpdateAssortment() {
		
	}
	
	
	//select descending assortment
	public selectDiscAssortment() {
		counter=0;
		for (j=0; j<=productAmountCatalog.length; j++) {
			for (i=0; i<productAmountCatalog[j]; i++) {
				if (productAmountCatalog[j] < productAmountCatalog[j+1]) {
					productAmountCatalog [j+1] = variable;
					productAmountCatalog [j] = productAmountCatalog[j+1];
					productAmountCatalog[j+1] = productAmountCatalog[j];
					
				}
			}
		}
	}
	
	
	
	//select increasing assortment
	public selectIncrAssortment() {
		counter=0;
		for (j=0; j<=productAmountCatalog.length; j++) {
			for (i=0; i<productAmountCatalog[j]; i++) {
				if (productAmountCatalog[j] > productAmountCatalog[j+1]) {
					productAmountCatalog [j+1] = variable;
					productAmountCatalog [j] = productAmountCatalog[j+1];
					productAmountCatalog[j+1] = productAmountCatalog[j];
					
				}
			}
		}
		
	}
	
	
	//select update
	public void selectUpdate() {
		
	}
	
	
	//select back to updated catalog
	public void selectBacktoUpdatedCatalog() {
		
	}
	
	
	
	//select find the best seller
	public selectFindBestSeller() {
		this.purchased_count = purchased_count;
		if (purchased_count > max) {
			BestSeller=product;
		}
	}
	
	
	//select register best seller
	public void selectRegisterBestSeller() {
		
		
	}
	
	
	//cancel the best seller
	public void CancelBestSeller() {
		
	}
	
	
	//select evaluations
	public void selectEvaluations() {
		
	}
	
	
	//select notificated producers evaluations
	public void selectNotificatedProducers_Ev() {
		
	}
	
	
	//select unotificated producers evaluations
	public void selectUnotificatedProducers_Eval() {
		
	}
	
	
	//select notification
	public void selectNotification() {
		
	}
	
	
}
