import java.util.Date;
import java.util.Vector;


public class TestCustomer {

	public static void main(String[] args) 
	{
		System.out.println("Execution Starts:");
		System.out.println();

		//Creating rental Dates
		@SuppressWarnings("deprecation")
		Date rentDate1 = new Date(2014, 6, 20);
		
		@SuppressWarnings("deprecation")
		Date returnDay1 = new Date(2014, 6, 28);
		
		@SuppressWarnings("deprecation")
		Date rentDate2 = new Date(2014, 8, 22);
		
		@SuppressWarnings("deprecation")
		Date returnDay2 = new Date(2014, 8, 24);
		
		@SuppressWarnings("deprecation")
		Date rentDate3 = new Date(2014, 7, 23);
		
		@SuppressWarnings("deprecation")
		Date returnDay3 = new Date(2014, 7, 27);
		
		// Creating Movies
		ActionMovie mov1 = new ActionMovie(1, "Robin Hood", "PG-13");
		ComedyMovie mov2 = new ComedyMovie(2, "It's Complicated", "R");
		DramaMovie mov3 = new DramaMovie(3, "The Yellow Handkerchief", "PG-13");
				
		// Creating Rentals
		Rental rent1 = new Rental(mov1, rentDate1);
		rent1.setReturnDate(returnDay1);
		Rental rent2 = new Rental(mov2, rentDate2);
		rent2.setReturnDate(returnDay2);
		Rental rent3 = new Rental(mov3, rentDate3);
		
		// Creating Vector for customer rentals
		Vector<Rental> rentalsCust1 = new Vector<Rental>();
		Vector<Rental> rentalsCust2 = new Vector<Rental>();
		Vector<Rental> rentalsCust3 = new Vector<Rental>();
		
		//Adding rentals to vectors
		rentalsCust1.addElement(rent1);
		rentalsCust1.addElement(rent2);
		rentalsCust1.addElement(rent3);
		rentalsCust1.removeElement(rent3);
		
		// Creating Customer
		Customer cust1 = new Customer(1,"Γεώργιος", "Παπαδάκης", "6974548479", rentalsCust1);
		
		//Printing cust1 rental details
		cust1.printRentalDetails();
	}
}
