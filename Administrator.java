import java.util.*;
import java.util.List;
import java.util.ArrayList;
import java.util.List;

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
	
	
	
	
	public void selectUpdateAssortment() {
		
	}
	
	
	
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
	
	
	
	public void selectUpdate() {
		
	}
	
	public void selectBacktoUpdatedCatalog() {
		
	}
	
	
	
	
	public selectFindBestSeller() {
		this.purchased_count = purchased_count;
		if (purchased_count > max) {
			BestSeller=product;
		}
	}
	
	public void selectRegisterBestSeller() {
		
		
	}
	
	public void CancelBestSeller() {
		
	}
	
	public void selectEvaluations() {
		
	}
	
	public void selectNotificatedProducers_Ev() {
		
	}
	
	public void selectUnotificatedProducers_Eval() {
		
	}
	
	public void selectNotification() {
		
	}
	
	
}
