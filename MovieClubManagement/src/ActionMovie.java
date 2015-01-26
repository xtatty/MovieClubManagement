import java.io.Serializable;

// Class for Action Movies
public class ActionMovie extends Movie implements Serializable
{
	//   Constants
	private static final double RENT_AMOUNT_DEFAULT_ACTION = 3;

	// Constructor
	public ActionMovie(int movieID, String movieTitle, String movieRating)
	{
		super(movieID, movieTitle, movieRating);
	}

	// Method for computing the Rent Amount
	public void calcRentAmount(int daysLate)
	{
		rentAmountTotal = RENT_AMOUNT_DEFAULT_ACTION * daysLate;
	}
}