import java.util.Date;

public abstract class Rentable implements java.io.Serializable
{
	//  Movie attributes
	private Integer ID;
	private String Title;
	private String Category;
	//private Date RentDate;
	//private Boolean isRented = False;

	// Constructor
	public Rentable(int iD, String title, String category)
    {
        this.ID = iD;
        this.Title = title;
        this.Category = category;
        
    }

	// Methods for ID
    public Integer getID() //Accessor
    {
        return ID;
    }

    public void setID(int iD) //Mutator
    {
    	if (iD >= 0)
    		ID = iD;
    	else
    	{
    		System.out.println("Error: Negative ID");
    		System.exit(0);
    	}
    }

	// Methods for Title
    public String getTitle() //Accessor
    {
        return Title;
    }

    public void setTitle(String title) //Mutator
    {
    	if (title.equals("") || title.equals(" "))
    	{
    		System.out.println("Error: Empty Title");
    		System.exit(0);
    	}
    	else
    		Title = title;
    }

	// Methods for Category
    public String getMpaaRating() //Accessor
    {
        return Category;
    }

	public void setCategory(String category) //Mutator
	{
		if (category.equals("") || category.equals(" "))
    	{
    		System.out.println("Error: Empty Category");
    		System.exit(0);
    	}
    	else
    		Category = category;
	}
	
	/*public Date getRentDate() //Accessor
    {
        return RentDate;
    }

    public void setRentDate(Date rentDate) //Mutator
    {
    	if (rentDate.equals("") || rentDate.equals(" "))
    	{
    		System.out.println("Error: Empty Date");
    		System.exit(0);
    	}
    	else
    		RentDate = rentDate;
    	
    }*/
}