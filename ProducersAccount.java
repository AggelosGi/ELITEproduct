import java.io.*;
import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class ProducersAccount {
	
	public String name[];
	public String email[];
	private String address[];
	private int phone[];
	private String town[];
	private int password[];
	private int zip[];
	public String personal_info[];
	public String product_info[];
	private String WarningMessage[];
	
	ProducersAccount (String name, String email, String address, int phone, String town, int password) {
		this.name = name;
		this.email = email;
		this.address = address;
		this.phone = phone;
		this.town = town;
		this.password = password;
	}
	
	private void updatedInfoFields() {
		try {
			rs.updateString( "Name", newName );
			rs.updateString( "Email", newEmail );
			rs.updateString( "Address", adrs );
			rs.updateInt( "Phone", tel );
			rs.updateString( "Town", newTown );
			rs.updateInt( "Password", pass );
			rs.updateRow( );
			JOptionPane.showMessageDialog(this, "Updated");
		}
		catch (SQLException err) {
		System.out.println(err.getMessage() );
		}
		
	}
	
	private void updatePasswordField() {
		
	}
	
	private void updateProducersProducts() {
		try {
			rs.updateString( "producers_products", products );
			rs.updateRow( );
			JOptionPane.showMessageDialog(this, "Updated");
		}
		catch (SQLException err) {
		System.out.println(err.getMessage() );
		}
	}
	
	private void updateProductSummary() {
		try {
			rs.updateString( "product_info", product );
			rs.updateRow( );
			JOptionPane.showMessageDialog(this, "Updated");
		}
		catch (SQLException err) {
		System.out.println(err.getMessage() );
		}
	}
	
	private void updateProducersPhoto() {
		
	}
	
	private void updateProducersSummary() {
		try {
			rs.updateString( "personal_info", personal );
			rs.updateRow( );
			JOptionPane.showMessageDialog(this, "Updated");
		}
		catch (SQLException err) {
		System.out.println(err.getMessage() );
		}
	}
	
	public String getProducersSummary() {
		return producers_summary;
	}
	
	public void retProducersSummary() {
		return producers_summary;
	}

	private void updateCertificates() {
		
	}
	
}
