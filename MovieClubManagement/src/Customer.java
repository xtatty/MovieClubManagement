import java.util.ArrayList;
import java.util.Date;
import java.util.Enumeration;
import java.util.Vector;

public class Customer {

		protected int id;
		protected String firstName;
		protected String lastName;
		protected String contactInfo;
		protected Vector<Rental> rentals = new Vector<Rental>();
		
		public Customer(String firstName, String lastName, String contactInfo, Vector<Rental> rentals) {
                this.firstName = firstName;
                this.lastName = lastName;
                this.contactInfo = contactInfo;
                this.rentals= rentals;
        }

        public int getId() {
                return id;
        }

        public void setId(int ID) {
        	if (ID >= 0)
        		id = ID;
        	else
        	{
        		System.out.println("Error: Negative ID");
        		System.exit(0);
        	}     	
        }
        
        public String getContactInfo() {
            return contactInfo;
        }

        public void setContactInfo(String ContactInfo) {
        	if (ContactInfo.equals("") || ContactInfo.equals(" "))
        	{
        		System.out.println("Error: Empty Contact Info");
        		System.exit(0);
        	}
        	else
        		contactInfo = ContactInfo;
           
    	}

        public String getFirstName() {
                return firstName;
        }

        public void setFirstName(String FirstName) {
        	if (FirstName.equals("") || FirstName.equals(" "))
        	{
        		System.out.println("Error: Empty FirstName");
        		System.exit(0);
        	}
        	else
        		firstName = FirstName;                
        }

        public String getLastName() {
                return lastName;
        }

        public void setLastName(String LastName) {
        	if (LastName.equals("") || LastName.equals(" "))
        	{
        		System.out.println("Error: Empty LastName");
        		System.exit(0);
        	}
        	else
        		lastName = LastName;     
        }

        public void addRental(Rental aRental) {
    		rentals.addElement(aRental);
    	}
        
        public void removeRental(Rental aRental) {
    		rentals.removeElement(aRental);
    	}
        
        public void printRentalDetails() {
    		Enumeration<Rental> Rentals = rentals.elements();
    		String result = "Rental for " + getLastName() + getFirstName()+  "\n";
    		while(Rentals.hasMoreElements()) {
    			Rental each = (Rental) Rentals.nextElement();
    			result += "\t" + each.getMovie().getMovieTitle() + "\t" +
    			String.valueOf(each.getRentAmount()) + "\n";
    			System.out.println(result);
    		}
        }
      
}