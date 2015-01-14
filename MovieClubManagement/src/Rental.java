import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

// Rental class that will have information about all the rentals.

public class Rental implements java.io.Serializable {

	//  Rental Variables
	private Movie rentedProduct;
	private Customer customer;
	private int noOfDaysLate;
	private ArrayList<Rental> rentedProducts;
	
	// Constructor
	public Rental(Movie rentProduct, Customer customer, int daysLate) 
	{
		this.rentedProduct = rentProduct;
		this.customer = customer;
		this.noOfDaysLate = daysLate;
	}

	public void getRentedProduct() {
        
    }

    public void setRentedProduct() {
    	
   	}
    
	public void rent(){
		
		/*try{
            FileOutputStream fileOut= new FileOutputStream("C:/temp1/rentedProducts.ser");
            ObjectOutputStream out= new ObjectOutputStream(fileOut);
            out.writeObject(rentedProduct);
            out.close();
            fileOut.close();
          }catch(IOException ioe){
               ioe.printStackTrace();
           } */
	}
	
	public void returnRent(){
	
		/*try
	    {
	        FileInputStream fis = new FileInputStream("C:/temp1/rentedProducts.ser");
	        ObjectInputStream ois = new ObjectInputStream(fis);
	        rentedProducts = (ArrayList) ois.readObject();
	        ois.close();
	        fis.close();
	     }
		catch(IOException ioe){
	         ioe.printStackTrace();
	         System.out.println("IO exception!");
	     }
		catch(ClassNotFoundException c){
	         System.out.println("Class not found");
	         c.printStackTrace();
	     }*/
	}
	
	public double calcRentAmount() 
	{
		double RentCost = 0;
		
		if (noOfDaysLate<=3) 
		{
			RentCost = 1.5;
		} 
		else if (noOfDaysLate>3) 
		{
			RentCost = 1.5 + 0.5 * (noOfDaysLate-3);
		} 
			return RentCost;
	}
}