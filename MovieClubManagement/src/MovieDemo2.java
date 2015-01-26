import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class MovieDemo2 {
	public static void main(String[] args) {
		System.out.println("Execution Starts:");
		System.out.println();
		
		ArrayList<Movie> movies; 
        movies = new ArrayList<Movie>();
       		
		
		ArrayList<Rental> rentals; 
        rentals = new ArrayList<Rental>();		
		

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

        
        try
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
          }
        
	


		// Verify ID Mutator Method
/*		System.out.println("Verifying ID Mutator Method:");
		System.out.println("Original ID was : " + mov1.getIdNumber());
		mov1.setIdNumber(2);
		System.out.println("Modified ID is : " + mov1.getIdNumber());
		System.out.println();

		// Verify Equals Method
		System.out.println("Verifying Equals Method:");
		Integer v1, v2;
		v1 = mov1.getIdNumber();
		v2 = mov2.getIdNumber();
		System.out.println(mov1.getIdNumber() + " equals " + mov2.getIdNumber()
				+ "? " + v1.equals(v2));
		System.out.println();
		mov1.setIdNumber(1); // Change it back
		System.out.println("Verifying Equals Method:");
		v1 = mov1.getIdNumber();
		v2 = mov2.getIdNumber();
		System.out.println(mov1.getIdNumber() + " equals " + mov2.getIdNumber()
				+ "? " + v1.equals(v2));
		System.out.println();

		// Verifying Title Mutator Method
		System.out.println("Verifying Title Mutator Method:");
		System.out.println("Original Title: " + mov3.getMovieTitle());
		mov3.setMovieTitle("The Yellow Handkerchief (2011)");
		System.out.println("Modified Title: " + mov3.getMovieTitle());
		System.out.println();

		// Verify Rating Mutator
		System.out.println("Verify Rating Mutator Method:");
		System.out.println("Original Rating: " + mov2.getMpaaRating());
		mov2.setMpaaRating("NR");
		System.out.println("Modified Rating: " + mov2.getMpaaRating());
		System.out.println();

		// Calculate Late Charges
		System.out.println("Calculate Late Charge:");

		mov1.calcLateFee(3);
		System.out.print("The movie with ID #" + mov1.getIdNumber()
				+ " has a late charge of $");
		System.out.printf("%6.2f", mov1.getLateFee());
		System.out.println(" !");

		mov2.calcLateFee(5);
		System.out.print("The movie with ID #" + mov2.getIdNumber()
				+ " has a late charge of $");
		System.out.printf("%6.2f", mov2.getLateFee());
		System.out.println(" !");

		mov3.calcLateFee(7);
		System.out.print("The movie with ID #" + mov3.getIdNumber()
				+ " has a late charge of $");
		System.out.printf("%6.2f", mov3.getLateFee());
		System.out.println(" !");

		System.out.println("Calling calculate fee from Rental Class "
				+ rental1.calcLateFee());
		System.out.println("Calling calculate fee from Rental Class "
				+ rental2.calcLateFee());
		System.out.println("Calling calculate fee from Rental Class "
				+ rental3.calcLateFee());*/

/*		List<Rental> rental = new ArrayList<Rental>();
		rental.add(rental1);
		rental.add(rental2);
		rental.add(rental3);*/

		
	}

	
}