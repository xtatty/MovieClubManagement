import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.Vector;

public class InitializeDB {
	public static void main(String[] args) {
		System.out.println("Execution Starts:");
		System.out.println();
		
		ArrayList<Movie> movies; 
        movies = new ArrayList<Movie>();
        
		ArrayList<Customer> customers; 
        customers = new ArrayList<Customer>();

		
		// Creating objects.
		ActionMovie mov1 = new ActionMovie(1, "Robin Hood", "PG-13");
		ComedyMovie mov2 = new ComedyMovie(2, "It's Complicated", "R");
		DramaMovie mov3 = new DramaMovie(3, "The Yellow Handkerchief", "PG-13");
		ActionMovie mov4 = new ActionMovie(4, "The Interview", "R");
		ComedyMovie mov5 = new ComedyMovie(5, "This Is the End", "R");
		DramaMovie mov6 = new DramaMovie(6, "The Drop", "R");
		ActionMovie mov7 = new ActionMovie(7, "Guardians of the Galaxy", "PG-13");
		ActionMovie mov8 = new ActionMovie(8, "Taken 3", "PG-13");
		DramaMovie mov9 = new DramaMovie(9, "Still Alice", "PG-13");
		ActionMovie mov10 = new ActionMovie(10, "Blackhat", "R");
		ComedyMovie mov11 = new ComedyMovie(11, "Paddington", "PG");
		ComedyMovie mov12 = new ComedyMovie(12, "The Wedding Ringer", "R");
		ComedyMovie mov13 = new ComedyMovie(13, "Match", "R");
		DramaMovie mov14 = new DramaMovie(14, "Little Accidents", "R");
		DramaMovie mov15 = new DramaMovie(15, "Cake", "R");
		DramaMovie mov16 = new DramaMovie(16, "Timbuktu", "PG-13");
		ActionMovie mov17 = new ActionMovie(17, "Jupiter Ascending", "PG-13");
		ComedyMovie mov18 = new ComedyMovie(18, "Hot Tub Time Machine 2", "R");
		ComedyMovie mov19 = new ComedyMovie(19, "The DUFF", "PG-13");
		DramaMovie mov20 = new DramaMovie(20, "McFarland, USA", "PG");
		ActionMovie mov21= new ActionMovie(21, "Everly", "R");
		
		movies.add(mov1);
		movies.add(mov2);
		movies.add(mov3);
		movies.add(mov4);
		movies.add(mov5);
		movies.add(mov6);
		movies.add(mov7);
		movies.add(mov8);
		movies.add(mov9);
		movies.add(mov10);
		movies.add(mov11);
		movies.add(mov12);
		movies.add(mov13);
		movies.add(mov14);
		movies.add(mov15);
		movies.add(mov16);
		movies.add(mov17);
		movies.add(mov18);
		movies.add(mov19);
		movies.add(mov20);
		movies.add(mov21);
		
		
		
/*		ArrayList<OldRental> rentals; 
        rentals = new ArrayList<OldRental>();		
		
		OldRental rental1 = new OldRental(mov1, 3);
		OldRental rental2 = new OldRental(mov2, 5);
		OldRental rental3 = new OldRental(mov3, 7);
		
		rentals.add(rental1);
		rentals.add(rental2);
		rentals.add(rental3);*/
		
		try{
            FileOutputStream fileOut= new FileOutputStream("C:/Users/Public/movies.ser");
            ObjectOutputStream out= new ObjectOutputStream(fileOut);
            out.writeObject(movies);
            out.close();
            fileOut.close();
          }catch(IOException ioe){
               ioe.printStackTrace();
           }
		
/*		try{
            FileOutputStream fileOut= new FileOutputStream("C:/Users/Public/rentals.ser");
            ObjectOutputStream out= new ObjectOutputStream(fileOut);
            out.writeObject(rentals);
            out.close();
            fileOut.close();
          }catch(IOException ioe){
               ioe.printStackTrace();
           }*/
		
		//Creating rental Dates
				@SuppressWarnings("deprecation")
				Date rentDate1 = new Date(2014, 6, 20);
				
/*				@SuppressWarnings("deprecation")
				Date returnDay1 = new Date(2014, 6, 28);*/
				
				@SuppressWarnings("deprecation")
				Date rentDate2 = new Date(2014, 8, 22);
				
/*				@SuppressWarnings("deprecation")
				Date returnDay2 = new Date(2014, 8, 24);
				
				@SuppressWarnings("deprecation")
				Date rentDate3 = new Date(2014, 7, 23);
				
				@SuppressWarnings("deprecation")
				Date returnDay3 = new Date(2014, 7, 27);*/
				
				// Creating Rentals
				Rental rent1 = new Rental(mov1, rentDate1);
				// rent1.setReturnDate(returnDay1);
				Rental rent2 = new Rental(mov2, rentDate2);
				// rent2.setReturnDate(returnDay2);
				
/*				Rental rent3 = new Rental(mov1, rentDate1);
				rent3.setReturnDate(returnDay1);
				Rental rent4 = new Rental(mov2, rentDate2);
				rent2.setReturnDate(returnDay2);
				
				Rental rent5 = new Rental(mov1, rentDate1);
				rent5.setReturnDate(returnDay1);
				Rental rent6 = new Rental(mov2, rentDate2);
				rent6.setReturnDate(returnDay2);
				
				Rental rent7 = new Rental(mov1, rentDate1);
				rent7.setReturnDate(returnDay1);
				Rental rent8 = new Rental(mov2, rentDate2);
				rent8.setReturnDate(returnDay2);
				
				
				Rental rent9 = new Rental(mov3, rentDate3);
				rent9.setReturnDate(returnDay3);*/
				
				// Creating Vector for customer rentals
				Vector<Rental> rentalsCust1 = new Vector<Rental>();
				Vector<Rental> rentalsCust2 = new Vector<Rental>();
				Vector<Rental> rentalsCust3 = new Vector<Rental>();
				
				//Adding rentals to vectors
				rentalsCust1.addElement(rent1);
				rentalsCust1.addElement(rent2);
/*				rentalsCust1.addElement(rent3);
				
				rentalsCust1.addElement(rent4);
				rentalsCust1.addElement(rent5);
				rentalsCust1.addElement(rent6);
				rentalsCust1.addElement(rent7);
				rentalsCust1.addElement(rent8);*/
				
		//		rentalsCust1.removeElement(rent3);
				
				// Creating Customer
				Customer cust1 = new Customer("Γεώργιος", "Παπαδάκης", "6974548479", rentalsCust1);
				Customer cust2 = new Customer("Νικόλαος", "Δημητρίου", "6988556323", rentalsCust2);
				Customer cust3 = new Customer("’ννα", "Ιωάννου", "6955266999", rentalsCust3);
				customers.add(cust1);
				customers.add(cust2);
				customers.add(cust3);
		
				try{
		            FileOutputStream fileOut= new FileOutputStream("C:/Users/Public/customers.ser");
		            ObjectOutputStream out= new ObjectOutputStream(fileOut);
		            out.writeObject(customers);
		            out.close();
		            fileOut.close();
		          }catch(IOException ioe){
		               ioe.printStackTrace();
		           }


	}
	
}