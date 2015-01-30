import java.io.Serializable;

// Rental class that will have information about the rentals.
public class OldRental implements Serializable {

	// Rental Variables
	private Movie movie;
	private int noOfDaysLate;
	
	
	// Constructor
	public OldRental(Movie movDetails, int daysLate) {
		this.movie = movDetails;
		this.noOfDaysLate = daysLate;
	}

	public Movie getMovie() {
		return movie;
	}

	public int getNoOfDaysLate() {
		return noOfDaysLate;
	}

	
	public double getRentAmount() {
		return movie.calcRentAmount(noOfDaysLate);
	}
	
	
	
	/* public double calcRentAmount() {
	 *	 if (movieDetails instanceof ActionMovie) {
	 *		 return 3 * noOfDaysLate;
	 *	 } else if (movieDetails instanceof ComedyMovie) {
	 *		return 2.5 * noOfDaysLate;
	 *	 } else {
	 *	 	return 2 * noOfDaysLate;
	 *	 }
	 * }
	 */
	
	
}