import java.io.Serializable;

// General Movie Class

public class Movie implements Serializable
{
	//  Movie attributes
	private Integer movieID;
	private String movieTitle;
	private String mpaaRating;

	// Rent Amount attributes
	double  rentAmountTotal;
	private static final double RENT_AMOUNT_DEFAULT = 2;

	// Constructor
	public Movie(int movID, String movTitle, String movRating)
    {
        this.movieID = movID;
        this.movieTitle = movTitle;
        this.mpaaRating = movRating;
    }

	// Methods for ID
    public Integer getMovieID() //Accessor
    {
        return movieID;
    }

    public void setMovieID(int movID) //Mutator
    {
    	if (movID >= 0)
    		movieID = movID;
    	else
    	{
    		System.out.println("Error: Negative ID");
    		System.exit(0);
    	}
    }

	// Methods for Title
    public String getMovieTitle() //Accessor
    {
        return movieTitle;
    }

    public void setMovieTitle(String movTitle) //Mutator
    {
    	if (movTitle.equals("") || movTitle.equals(" "))
    	{
    		System.out.println("Error: Empty Title");
    		System.exit(0);
    	}
    	else
    		movieTitle = movTitle;
    }

	// Methods for Rating
    public String getMpaaRating() //Accessor
    {
        return mpaaRating;
    }

	public void setMpaaRating(String movRating) //Mutator
	{
		if (movRating.equals("") || movRating.equals(" "))
    	{
    		System.out.println("Error: Empty Rating");
    		System.exit(0);
    	}
    	else
    		mpaaRating = movRating;
	}

	// Equals Method
	public boolean equals(Movie objectName)
	{
		return objectName.getMovieID() == movieID;
	}

	// To String Method
	public String toString()
	{
		String numID = Integer.toString(movieID);
		return (numID);
	}

	// Methods for Rent Amount
	public double getRentAmountTotal() //Accessor
    {
        return rentAmountTotal;
    }

	public double calcRentAmount(int daysLate)
	{
		if (daysLate <= 2)
			rentAmountTotal = RENT_AMOUNT_DEFAULT;
		else if (daysLate > 2)
			rentAmountTotal = RENT_AMOUNT_DEFAULT + (RENT_AMOUNT_DEFAULT * (daysLate - 2));
		
		return rentAmountTotal;
	}
}