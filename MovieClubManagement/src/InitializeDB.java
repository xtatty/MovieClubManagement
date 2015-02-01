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
		ActionMovie mov1 = new ActionMovie(1, "Robin Hood (A)", "PG-13");
		ActionMovie mov2 = new ActionMovie(4, "The Interview (A)", "R");
		ActionMovie mov3 = new ActionMovie(7, "Guardians of the Galaxy (A)", "PG-13");
		ActionMovie mov4 = new ActionMovie(8, "Taken 3 (A)", "PG-13");
		ActionMovie mov5 = new ActionMovie(10, "Blackhat (A)", "R");
		ActionMovie mov6 = new ActionMovie(17, "Jupiter Ascending (A)", "PG-13");
		ActionMovie mov7= new ActionMovie(21, "Everly (A)", "R");
		
		ComedyMovie mov8 = new ComedyMovie(2, "It's Complicated (C)", "R");
		ComedyMovie mov9 = new ComedyMovie(11, "Paddington (C)", "PG");
		ComedyMovie mov10 = new ComedyMovie(12, "The Wedding Ringer (C)", "R");
		ComedyMovie mov11 = new ComedyMovie(13, "Match (C)", "R");
		ComedyMovie mov12 = new ComedyMovie(5, "This Is the End (C)", "R");
		ComedyMovie mov13 = new ComedyMovie(18, "Hot Tub Time Machine 2 (C)", "R");
		ComedyMovie mov14 = new ComedyMovie(19, "The DUFF (C)", "PG-13");
		
		DramaMovie mov15 = new DramaMovie(6, "The Drop (D)", "R");
		DramaMovie mov16 = new DramaMovie(3, "The Yellow Handkerchief (D)", "PG-13");
		DramaMovie mov17 = new DramaMovie(9, "Still Alice (D)", "PG-13");
		DramaMovie mov18 = new DramaMovie(14, "Little Accidents (D)", "R");
		DramaMovie mov19 = new DramaMovie(15, "Cake (D)", "R");
		DramaMovie mov20 = new DramaMovie(16, "Timbuktu (D)", "PG-13");
		DramaMovie mov21 = new DramaMovie(20, "McFarland, USA (D)", "PG");

		
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
				
				@SuppressWarnings("deprecation")
				Date rentDate2 = new Date(2014, 8, 22);
				
		
				// Creating Rentals
				Rental rent1 = new Rental(mov1, rentDate1);
				Rental rent2 = new Rental(mov2, rentDate2);
				
				
				// Creating Vector for customer rentals
				Vector<Rental> rentalsCust1 = new Vector<Rental>();
				Vector<Rental> rentalsCust2 = new Vector<Rental>();
				Vector<Rental> rentalsCust3 = new Vector<Rental>();
				
				//Adding rentals to vectors
				rentalsCust1.addElement(rent1);
				rentalsCust1.addElement(rent2);
				
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