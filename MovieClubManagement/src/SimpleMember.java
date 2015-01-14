import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Date;


public class SimpleMember extends Customer{

        private double outstandingBalance;
        private ArrayList<Movie> outstandingMovies;    
        
        public SimpleMember(double outstandingBalance, ArrayList<Movie> outstandingMovies, String firstName, String lastName, Date dateRegistration, String address, String contactInfo, ArrayList<Movie> rentedMov) {
        		
        	super(firstName, lastName, dateRegistration, address, contactInfo, rentedMov);
                this.outstandingBalance = outstandingBalance;
                this.outstandingMovies = outstandingMovies;
        }
        
        public double getOutstandingBalance() {
                return outstandingBalance;
        }
        
        public void setOutstandingBalance(double outstandingBalance) {
                this.outstandingBalance = outstandingBalance;
        }      
        
        public ArrayList<Movie> getOutstandingMovies() {
        	
    	 	return outstandingMovies;
        }

        public void setOutstandingMovies(ArrayList<Movie> outstandingMovies) {
            this.outstandingMovies = outstandingMovies;
        }
}