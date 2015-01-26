import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class MovieDemo1 {
	public static void main(String[] args) {
		System.out.println("Execution Starts:");
		System.out.println();
		
		ArrayList<Movie> movies; 
        movies = new ArrayList<Movie>();
        

		
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
		
		
		
		ArrayList<Rental> rentals; 
        rentals = new ArrayList<Rental>();		
		
		Rental rental1 = new Rental(mov1, 123, 3);
		Rental rental2 = new Rental(mov2, 456, 5);
		Rental rental3 = new Rental(mov3, 123, 7);
		
		rentals.add(rental1);
		rentals.add(rental2);
		rentals.add(rental3);
		
		
		try{
            FileOutputStream fileOut= new FileOutputStream("C:/Users/Public/movies.ser");
            ObjectOutputStream out= new ObjectOutputStream(fileOut);
            out.writeObject(movies);
            out.close();
            fileOut.close();
          }catch(IOException ioe){
               ioe.printStackTrace();
           }
		
		
		try{
            FileOutputStream fileOut= new FileOutputStream("C:/Users/Public/rentals.ser");
            ObjectOutputStream out= new ObjectOutputStream(fileOut);
            out.writeObject(rentals);
            out.close();
            fileOut.close();
          }catch(IOException ioe){
               ioe.printStackTrace();
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

		System.out.println("The total late fees is " + lateFeesOwed(rentals));
	}

	private static double lateFeesOwed(List<Rental> rental) {
		Iterator<Rental> itr = rental.iterator();
		double lateFeeTotal = 0;
		while (itr.hasNext()) {
			Rental rentalInstance = (Rental) itr.next();
			lateFeeTotal += rentalInstance.calcRentAmount();
		}
		return lateFeeTotal;
	}
}