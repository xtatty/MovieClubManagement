//  Movie Demo

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class MovieDemo {
	public static void main(String[] args) 
	{
		System.out.println("Execution Starts:");
		System.out.println();

		// Creating Movies
		ActionMovie mov1 = new ActionMovie(1, "Robin Hood", "PG-13");
		ComedyMovie mov2 = new ComedyMovie(2, "It's Complicated", "R");
		DramaMovie mov3 = new DramaMovie(3, "The Yellow Handkerchief", "PG-13");
		
		// Creating Rentals
		Rental rental1 = new Rental(mov1, 123, 3);
		Rental rental2 = new Rental(mov2, 456, 5);
		Rental rental3 = new Rental(mov3, 123, 7);

		// Verify ID Mutator Method
		System.out.println("Verifying ID Mutator Method:");
		System.out.println("Original ID was : " + mov1.getMovieID());
		mov1.setMovieID(2);
		System.out.println("Modified ID is : " + mov1.getMovieID());
		System.out.println();

		// Verify Equals Method
		System.out.println("Verifying Equals Method:");
		Integer v1, v2;
		v1 = mov1.getMovieID();
		v2 = mov2.getMovieID();
		System.out.println(mov1.getMovieID() + " equals " + mov2.getMovieID()
				+ "? " + v1.equals(v2));
		System.out.println();
		mov1.setMovieID(1); // Change it back
		System.out.println("Verifying Equals Method:");
		v1 = mov1.getMovieID();
		v2 = mov2.getMovieID();
		System.out.println(mov1.getMovieID() + " equals " + mov2.getMovieID()
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

		// Calculate Rent Amount 
		System.out.println("Calculate Rent Amount:");

		mov1.calcRentAmount(3);
		System.out.print("The movie with ID #" + mov1.getMovieID()
				+ " has a rent charge of $");
		System.out.printf("%6.2f", mov1.getRentAmountTotal());
		System.out.println(" !");

		mov2.calcRentAmount(5);
		System.out.print("The movie with ID #" + mov2.getMovieID()
				+ " has a rent charge of $");
		System.out.printf("%6.2f", mov2.getRentAmountTotal());
		System.out.println(" !");

		mov3.calcRentAmount(7);
		System.out.print("The movie with ID #" + mov3.getMovieID()
				+ " has a rent charge of $");
		System.out.printf("%6.2f", mov3.getRentAmountTotal());
		System.out.println(" !");

		System.out.println("Calling calculate rent amount from Rental Class "
				+ rental1.calcRentAmount());
		System.out.println("Calling calculate rent amount from Rental Class "
				+ rental2.calcRentAmount());
		System.out.println("Calling calculate rent amount from Rental Class "
				+ rental3.calcRentAmount());

		List<Rental> rental = new ArrayList<Rental>();
		rental.add(rental1);
		rental.add(rental2);
		rental.add(rental3);

		System.out.println("The Movie Club Profit is " + movieClubProfit(rental));
	}

	private static double movieClubProfit(List<Rental> rental) {
		Iterator<Rental> itr = rental.iterator();
		double rentAmountTotal = 0;
		while (itr.hasNext()) {
			Rental rentalInstance = (Rental) itr.next();
			rentAmountTotal += rentalInstance.calcRentAmount();
		}
		return rentAmountTotal;
	}
}