import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public class DBReadWrite {

	
	public static void dbWriteMovie(ArrayList<Movie> obj) {
		try{
		    FileOutputStream fileOut= new FileOutputStream("C:/Users/Public/movies.ser");
		    ObjectOutputStream out= new ObjectOutputStream(fileOut);
		    out.writeObject(obj);
		    out.close();
		    fileOut.close();
		  }catch(IOException ioe){
		       ioe.printStackTrace();
		   }
	}
	
	
	public static void dbWriteCust(ArrayList<Customer> obj) {
		try{
		    FileOutputStream fileOut= new FileOutputStream("C:/Users/Public/customers.ser");
		    ObjectOutputStream out= new ObjectOutputStream(fileOut);
		    out.writeObject(obj);
		    out.close();
		    fileOut.close();
		  }catch(IOException ioe){
		       ioe.printStackTrace();
		   }
	}
	
	
	public static ArrayList<Movie> dbReadMovie() {
		try
		{
			FileInputStream fis = new FileInputStream("C:/Users/Public/movies.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			ArrayList movies = (ArrayList) ois.readObject();
			ois.close();
			fis.close();
			return movies;
		}catch(IOException ioe){
			ioe.printStackTrace();
			return null;
		}catch(ClassNotFoundException c){
			System.out.println("Class not found");
			c.printStackTrace();
			return null;
      }
	}
	
	public static ArrayList<Customer> dbReadCust() {
		try
		{
			FileInputStream fis = new FileInputStream("C:/Users/Public/customers.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			ArrayList customers = (ArrayList) ois.readObject();
			ois.close();
			fis.close();
			return customers;
		}catch(IOException ioe){
			ioe.printStackTrace();
			return null;
		}catch(ClassNotFoundException c){
			System.out.println("Class not found");
			c.printStackTrace();
			return null;
      }
	}
	
	
}
