import java.io.Serializable;
import java.util.Date;

import org.joda.time.DateTime;
import org.joda.time.Days;


// Rental class that will have information about the rentals.
public class NewRental implements Serializable {

	// Rental Variables
	private Movie movie;
	private Date rentalDate;
	private Date returnDate;
	private int noOfDaysLate;
	
	
	// Constructor
	public NewRental(Movie movDetails, Date rentalDate) {
		this.movie = movDetails;
		this.rentalDate = rentalDate;
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
	
	
	public int calcRentalDays(Date pastDate, Date today) 
	{
		int days = 0;
		
		days = Days.daysBetween(new DateTime(pastDate), new DateTime(today)).getDays();
		
		this.noOfDaysLate = days;
		return noOfDaysLate;
	}
	
	/*  Κώδικας που δουλεύει και κάνει αφαίρεση 2 ημερομηνιών
	 * 
	 *  @SuppressWarnings("deprecation")
 	 *	Date pastDate = new Date(2014, 06, 20);
	 *	@SuppressWarnings("deprecation")
	 *	Date today = new Date(2014, 06, 24);
	 *	int days = Days.daysBetween(new DateTime(pastDate), new DateTime(today)).getDays();
	 */
	
	
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