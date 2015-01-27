import java.io.Serializable;

// Class for Drama Movies 
public class DramaMovie extends Movie implements Serializable
{
	//  Constants
	private static final double RENT_AMOUNT_DEFAULT_DRAMA = 2;

	// Constructor
	public DramaMovie(int movieID, String movieTitle, String movieRating)
	{
		super(movieID, movieTitle, movieRating);
	}

	// Method for computing the Rent Amount
	public double calcRentAmount(int daysLate)
	{
		if (daysLate <= 2)
			rentAmountTotal = RENT_AMOUNT_DEFAULT_DRAMA;
		else if (daysLate > 2)
			rentAmountTotal = RENT_AMOUNT_DEFAULT_DRAMA  + (RENT_AMOUNT_DEFAULT_DRAMA * (daysLate - 2));
		
		return rentAmountTotal;
	}
}