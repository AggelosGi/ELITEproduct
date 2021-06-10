import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.io.*;


public class Evaluation {

	private String purchased_products[]; //products that the buyer has purchased
	public int grade_of_products[]; //grade of products
	public String comment_of_products[]; //comment of products
	public String list, listDepoNot, listEvalNot; //lists used in evaluations
	
	
	
	//return the list of producer's evaluations and notifications
	public retListofProducersEvalNot() {
		return list;
	}
	
	
	//update the list of producer's evaluations and notifications
	private void updatedListofProducersEvalNot() {
		
	}
	
	
	//type a comment
	public void typeComment() {
		System.out.println("Please type your comment here: ");
	}
	
	
	//select a star for evaluation
	public void selectStar() {
		
	}
	
	
	//select product rating
	public void selectProductRating() {
		
	}
	
	
	//get the list of producer's evaluations and notifications
	public getListofProducersEvalNot() {
		return listEvalNot;
	}
	
	
	//get the list of producer's deposits and notifications
	public getListofProducersDepoNot() {
		return listDepoNot;
	}
}
