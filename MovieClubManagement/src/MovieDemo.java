//  Movie Demo

import java.util.Date;

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
		OldRental rental1 = new OldRental(mov1, 3);
		OldRental rental2 = new OldRental(mov2, 5);
		OldRental rental3 = new OldRental(mov3, 7);
		
		// Testing the NewRental Class
		/* καταχώρηση ενοικίασης μαζί με την ημερομηνία και υπολογισμός 
		 * των ημερών της ενοικίασης για να βγει η χρέωση
		 */
		@SuppressWarnings("deprecation")
		Date pastDate = new Date(2014, 06, 20);
		@SuppressWarnings("deprecation")
		Date today = new Date(2014, 07, 28);
		
		Rental newRentalTest = new Rental(mov1, pastDate);		
		
		int days = newRentalTest.calcRentalDays(pastDate, today);
		
		System.out.println("\nTesting the NewRental Class" + "\nRental Days: " + days + "\n");
		
		newRentalTest.getRentAmount();
		
		System.out.println("\nRented Movie: " + newRentalTest.getMovie().getMovieTitle());
		System.out.println("Rent Amount for the Movie: " + newRentalTest.getRentAmount());

		
	    // Calculate Rent Amount 
		System.out.println("\nCalculate Rent Amount:");

		mov1.calcRentAmount(2);
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

		
		/* 
		 * 
		 * 	// Verify ID Mutator Method
		 *	System.out.println("Verifying ID Mutator Method:");
		 *	System.out.println("Original ID was : " + mov1.getMovieID());
		 *	mov1.setMovieID(2);
		 *	System.out.println("Modified ID is : " + mov1.getMovieID());
		 *	System.out.println();
		 *
		 *	// Verify Equals Method
		 *	System.out.println("Verifying Equals Method:");
		 *	Integer v1, v2;
		 *	v1 = mov1.getMovieID();
		 *	v2 = mov2.getMovieID();
		 *	System.out.println(mov1.getMovieID() + " equals " + mov2.getMovieID()
		 *			+ "? " + v1.equals(v2));
		 *	System.out.println();
		 *	mov1.setMovieID(1); // Change it back
		 *	System.out.println("Verifying Equals Method:");
		 *	v1 = mov1.getMovieID();
		 *	v2 = mov2.getMovieID();
		 *	System.out.println(mov1.getMovieID() + " equals " + mov2.getMovieID()
		 *			+ "? " + v1.equals(v2));
		 *	System.out.println();
		 *
		 *	// Verifying Title Mutator Method
		 *	System.out.println("Verifying Title Mutator Method:");
		 *	System.out.println("Original Title: " + mov3.getMovieTitle());
		 *	mov3.setMovieTitle("The Yellow Handkerchief (2011)");
		 *	System.out.println("Modified Title: " + mov3.getMovieTitle());
		 *	System.out.println();
		 *
		 *	// Verify Rating Mutator
		 *	System.out.println("Verify Rating Mutator Method:");
		 *	System.out.println("Original Rating: " + mov2.getMpaaRating());
		 *	mov2.setMpaaRating("NR");
		 *	System.out.println("Modified Rating: " + mov2.getMpaaRating());
		 *	System.out.println();
		 *
		 *
		 *
		 * System.out.println("Calling calculate rent amount from Rental Class "
		 *		+ rental1.calcRentAmount());
		 *  System.out.println("Calling calculate rent amount from Rental Class "
		 *		+ rental2.calcRentAmount());
		 *  System.out.println("Calling calculate rent amount from Rental Class "
		 *		+ rental3.calcRentAmount());
		 
		
			List<Rental> rental = new ArrayList<Rental>();
			rental.add(rental1);
			rental.add(rental2);
			rental.add(rental3);

			System.out.println("The Movie Club Profit is " + movieClubProfit(rental));
		  

			private static double movieClubProfit(List<Rental> rental) 
			{
				Iterator<Rental> itr = rental.iterator();
				double rentAmountTotal = 0;
				
				while (itr.hasNext()) 
				{
				Rental rentalInstance = (Rental) itr.next();
				rentAmountTotal += rentalInstance.calcRentAmount();
				}
				
				return rentAmountTotal;
			}
		 */
	}
}