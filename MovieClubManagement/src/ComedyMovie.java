import java.io.Serializable;

// Class for Comedy Movies 
public class ComedyMovie extends Movie implements Serializable
{
	//  Constants
	private static final double RENT_AMOUNT_DEFAULT_COMEDY = 2.5;

	// Constructor
	public ComedyMovie(int movieID, String movieTitle, String movieRating)
	{
		super(movieID, movieTitle, movieRating);
	}

	// Method for computing the Rent Amount
	public double calcRentAmount(int daysLate)
	{
		if (daysLate <= 2)
			rentAmountTotal = RENT_AMOUNT_DEFAULT_COMEDY;
		else if (daysLate > 2)
			rentAmountTotal = RENT_AMOUNT_DEFAULT_COMEDY + (RENT_AMOUNT_DEFAULT_COMEDY * (daysLate - 2));
		
		return rentAmountTotal;
	}
}