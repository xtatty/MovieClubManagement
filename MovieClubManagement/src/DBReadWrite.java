import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public class DBReadWrite {

	
	public static void dbWrite(ArrayList<Movie> obj) {
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
}
