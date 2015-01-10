// Class for Comedy Movies 
public class ComedyMovie extends Movie
{
	// Constants
	private static final double RENT_AMOUNT_DEFAULT_COMEDY = 2.5;

	// Constructor
	public ComedyMovie(int movieID, String movieTitle, String movieRating)
	{
		super(movieID, movieTitle, movieRating);
	}

	// Method for computing the Rent Amount
	public void calcRentAmount(int daysLate)
	{
		rentAmountTotal = RENT_AMOUNT_DEFAULT_COMEDY * daysLate;
	}
}