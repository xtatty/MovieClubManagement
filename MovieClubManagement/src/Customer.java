import java.util.ArrayList;
import java.util.Date;

public class Customer {

		protected int id;
		protected String firstName;
		protected String lastName;
		protected Date dateRegistration;
		protected String address;
		protected String contactInfo;
		protected ArrayList<Movie> rentedMovies;
		
		public Customer(String firstName, String lastName, Date dateRegistration, String address, String contactInfo, ArrayList<Movie> rentedMov) {
                this.firstName = firstName;
                this.lastName = lastName;
                this.dateRegistration = dateRegistration;
                this.address = address;
                this.contactInfo = contactInfo;
                this.rentedMovies = rentedMov;
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
        
        public String getAddress() {
            return address;
        }

        public void setAddress(String Address) {
        	if (Address.equals("") || Address.equals(" "))
        	{
        		System.out.println("Error: Empty Address");
        		System.exit(0);
        	}
        	else
        		address = Address;
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

        public Date getDateRegistration() {
                return dateRegistration;
        }

        public void setDateRegistration(Date DateRegistration) {
        	if (DateRegistration.equals("") || DateRegistration.equals(" "))
        	{
        		System.out.println("Error: Empty Registration Date");
        		System.exit(0);
        	}
        	else
        		dateRegistration = DateRegistration;   
        }
        
        public ArrayList<Movie> getRentedMovies() {
            return rentedMovies;
        }

        public void AddToRentedMovies(Movie aMovie) {
    	
        	rentedMovies.add(aMovie);
        }          
}