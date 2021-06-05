import java.io.*;
import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class Producer extends User {
	
	public String placed_products[];
	
	private void selectRegistration() { 
		
	}
	
	private boolean add(Info i) { //info = name, address, town, phone, certificates, etc. 
		return info.add(i);
	}
	
	private boolean add(Password p) { //password of his personal account
		return password.add(p);
	}
	
	private boolean add(Product e) { //products that he is interested to sell
		return product.add(e);
	}
	
	private boolean add(ProductSummary ps) { //a few words about his products
		return productsummary.add(ps);
	}
	
	private boolean add(Photo h) {
		return photo.add(h);
	}
	
	private boolean add(ProducersSummary sum) { //a few words about himself and his work
		return producerssummary.add(sum);
	}
	
	private boolean add(Certificates c) { //the certificates that certify the authenticity of its products
		return certificates.add(c);
	}


}
