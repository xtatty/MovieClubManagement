import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class MovieDemo2_2 {
	public static void main(String[] args) {
		System.out.println("Execution Starts:");
		System.out.println();
		
		ArrayList<Movie> movies; 
        movies = new ArrayList<Movie>();
       		
        ArrayList<Customer> customers; 
        customers = new ArrayList<Customer>();
		
		ArrayList<OldRental> rentals; 
        rentals = new ArrayList<OldRental>();		
		

        try
        {
            FileInputStream fis = new FileInputStream("C:/Users/Public/movies.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            movies = (ArrayList) ois.readObject();
            ois.close();
            fis.close();
         }catch(IOException ioe){
             ioe.printStackTrace();
             return;
          }catch(ClassNotFoundException c){
             System.out.println("Class not found");
             c.printStackTrace();
             return;
          }
        
        System.out.println("Διαθέσιμοι Τίτλοι:");
        for(Movie amovie: movies){
        	System.out.println("ID = " + amovie.getMovieID() + " Title = "+amovie.getMovieTitle());
        	}

        
/*        try
        {
            FileInputStream fis = new FileInputStream("C:/Users/Public/rentals.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            rentals = (ArrayList) ois.readObject();
            ois.close();
            fis.close();
         }catch(IOException ioe){
             ioe.printStackTrace();
             return;
          }catch(ClassNotFoundException c){
             System.out.println("Class not found");
             c.printStackTrace();
             return;
          }*/
        try
        {
            FileInputStream fis = new FileInputStream("C:/Users/Public/customers.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            customers = (ArrayList) ois.readObject();
            ois.close();
            fis.close();
         }catch(IOException ioe){
             ioe.printStackTrace();
             return;
          }catch(ClassNotFoundException c){
             System.out.println("Class not found");
             c.printStackTrace();
             return;
          }
        
	
        MainFrame1_new mf = new MainFrame1_new(movies,customers);
        
        System.out.println("Ενοικοιάσεις:");
        
        for(Customer acustomer: customers){
        	
        	System.out.println("ID = " + acustomer.id + " Name = "+ acustomer.lastName + "Rentals" );
        	acustomer.printRentalDetails();
        	}
		
	}

	
}