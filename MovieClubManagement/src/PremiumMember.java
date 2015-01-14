import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Date;


public class PremiumMember extends Customer {

        private double monthlyFee;
        private ArrayList<Movie> outstandingMovies;

        public PremiumMember(double monthlyFee, ArrayList<Movie> outstandingMovies, String firstName, String lastName, Date dateRegistration, String address, String contactInfo, ArrayList<Movie> rentedMov) {
        	
        	super(firstName, lastName, dateRegistration, address, contactInfo, rentedMov);
        	    this.monthlyFee = monthlyFee;
                this.outstandingMovies = outstandingMovies;
        }

        public double getMonthlyFee() {
                return monthlyFee;
        }

        public void setMonthlyFee(double monthlyFee) {
                this.monthlyFee = monthlyFee;
        }

        public ArrayList<Movie> getOutstandingMovies() {
			return outstandingMovies;
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
    	      	
        	/*	for(Rental aRent: rentedProducts ){
        			
        			if()
	            	
	            }
        	      	
                return outstandingMovies; */
        }

       /* public void setOutstandingMovies(ArrayList<Movie> outstandingMovies) {
                this.outstandingMovies = outstandingMovies;
        } */

}
