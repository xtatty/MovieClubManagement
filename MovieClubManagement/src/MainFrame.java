import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;

public class MainFrame extends JFrame {
	private JPanel contentPane;
	private ArrayList<Movie> allMovies = new ArrayList<Movie>();
	private ArrayList<Customer> allCustomers = new ArrayList<Customer>();
	private DefaultListModel modelForMovies;
	private DefaultListModel modelForCustomers;
	JScrollPane scrollpane;
	JScrollPane scrollpane1;
	
	public static void main(String[] args) {
		System.out.println("Execution Starts:");
		System.out.println();
		
		ArrayList<Movie> movies; 
        movies = new ArrayList<Movie>();
       		
        ArrayList<Customer> customers; 
        customers = new ArrayList<Customer>();
		
		ArrayList<OldRental> rentals; 
        rentals = new ArrayList<OldRental>();		
		

        try
        {
            FileInputStream fis = new FileInputStream("C:/Users/Public/movies.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            movies = (ArrayList) ois.readObject();
            ois.close();
            fis.close();
         }catch(IOException ioe){
             ioe.printStackTrace();
             return;
          }catch(ClassNotFoundException c){
             System.out.println("Class not found");
             c.printStackTrace();
             return;
          }
        
        System.out.println("Διαθέσιμοι Τίτλοι:");
        for(Movie amovie: movies){
        	System.out.println("ID = " + amovie.getMovieID() + " Title = "+amovie.getMovieTitle());
        	}

        
/*        try
        {
            FileInputStream fis = new FileInputStream("C:/Users/Public/rentals.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            rentals = (ArrayList) ois.readObject();
            ois.close();
            fis.close();
         }catch(IOException ioe){
             ioe.printStackTrace();
             return;
          }catch(ClassNotFoundException c){
             System.out.println("Class not found");
             c.printStackTrace();
             return;
          }*/
        try
        {
            FileInputStream fis = new FileInputStream("C:/Users/Public/customers.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            customers = (ArrayList) ois.readObject();
            ois.close();
            fis.close();
         }catch(IOException ioe){
             ioe.printStackTrace();
             return;
          }catch(ClassNotFoundException c){
             System.out.println("Class not found");
             c.printStackTrace();
             return;
          }
        
	
        MainFrame mf = new MainFrame(movies,customers);
        
        System.out.println("Ενοικοιάσεις:");
        
        for(Customer acustomer: customers){
        	
        	System.out.println("ID = " + acustomer.id + " Name = "+ acustomer.lastName + "Rentals" );
        	acustomer.printRentalDetails();
        	}
		
	}

	public MainFrame(ArrayList<Movie> Movies, ArrayList<Customer> customers) {
		allMovies = Movies;
		allCustomers = customers;
		setTitle("Movie Club Management");
		contentPane = new JPanel();
		
		modelForMovies = new DefaultListModel();
		for (Movie aMovie: allMovies)
			modelForMovies.addElement(aMovie.getMovieTitle());
		
		modelForCustomers = new DefaultListModel();
		for (Customer aCustomer: allCustomers)
			modelForCustomers.addElement(aCustomer.getLastName() + " " + aCustomer.firstName);
		
		
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton btnDelete = new JButton("Delete Movie");

		
		JLabel label = new JLabel("");
		label.setBounds(120, 75, 0, 0);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(125, 10, 120, 130);
		
		JList list = new JList();
		list.setVisibleRowCount(10);
		list.setModel(modelForMovies);   
		scrollPane.setViewportView(list);
		
		btnDelete.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				String movieName = (String) list.getSelectedValue();
				
				for (Movie theMovie: allMovies)
				{
					String movieTitle = theMovie.getMovieTitle();
					if ( movieTitle.equals(movieName))
					{
						//int index = 
					//	textField.setText(custName);
						allMovies.remove(theMovie);
						modelForMovies = new DefaultListModel();
						for (Movie aMovie: allMovies)
							modelForMovies.addElement(aMovie.getMovieTitle());
						list.setModel(modelForMovies);
						
						DBReadWrite.dbWrite(allMovies);
						
						break;
					}
				}
				
			}


		});
		btnDelete.setBounds(135, 151, 107, 23);
		
		
		contentPane.setLayout(null);
		contentPane.add(btnDelete);
		contentPane.add(label);
		contentPane.add(scrollPane);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(372, 10, 110, 130);
		contentPane.add(scrollPane_1);
		
		JList list_1 = new JList();
		list_1.setVisibleRowCount(10);
		list_1.setModel(modelForCustomers);
		scrollPane_1.setViewportView(list_1);
		
		JButton btnCustomers = new JButton("Customers");
		btnCustomers.setBounds(372, 151, 110, 23);
		contentPane.add(btnCustomers);
		contentPane.add(scrollPane_1);
		
		JButton button = new JButton("Ενοικιάσεις");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String id = (String) list_1.getSelectedValue();
				new custRentals(customers, id);
			}
		});
		button.setBounds(382, 185, 89, 23);
		contentPane.add(button);
		
		
		
		
		
		this.setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 593, 294);
	}
	
	
	
}