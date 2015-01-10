// Class for Drama Movies 
public class DramaMovie extends Movie implements java.io.Serializable
{
	//  Constants
	private static final double RENT_AMOUNT_DEFAULT_DRAMA = 2;

	// Constructor
	public DramaMovie(int movieID, String movieTitle, String movieRating)
	{
		super(movieID, movieTitle, movieRating);
	}

	// Method for computing the Rent Amount
	public void calcRentAmount(int daysLate)
	{
		rentAmountTotal = RENT_AMOUNT_DEFAULT_DRAMA * daysLate;
	}
}