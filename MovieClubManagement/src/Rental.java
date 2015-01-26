// Rental class that will have information about all the rentals.
public class Rental {

	// Rental Variables
	private Movie movieDetails;
	public int customerId;
	private int noOfDaysLate;

	// Constructor
	public Rental(Movie movDetails, int id, int daysLate) {
		this.movieDetails = movDetails;
		this.customerId = id;
		this.noOfDaysLate = daysLate;
	}

	public double calcRentAmount() {
	 	if (movieDetails instanceof ActionMovie) {
	 		return 3 * noOfDaysLate;
	 	} else if (movieDetails instanceof ComedyMovie) {
	 		return 2.5 * noOfDaysLate;
	 	} else {
	 		return 2 * noOfDaysLate;
	 	}
	 }
	
}