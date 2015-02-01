import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.Enumeration;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

import javax.swing.JTextField;

import java.awt.Font;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JTree;

public class MainFrame extends JFrame {
	private JPanel contentPane;
	private ArrayList<Movie> allMovies = new ArrayList<Movie>();
	private ArrayList<Customer> allCustomers = new ArrayList<Customer>();
	private DefaultListModel modelForMovies;
	private DefaultListModel modelForCustomers;
	JScrollPane scrollpane;
	JScrollPane scrollpane1;
	private JTextField dayTextField;
	private JTextField monthTextField;
	private JTextField yearTextField;
	private JTextField textField;
	
	public static void main(String[] args) {
		System.out.println("Execution Starts:");
		System.out.println();
		
		ArrayList<Movie> movies; 
        movies = new ArrayList<Movie>();
       		
        ArrayList<Customer> customers; 
        customers = new ArrayList<Customer>();
		
//		ArrayList<OldRental> rentals; 
//        rentals = new ArrayList<OldRental>();		
		

        movies = DBReadWrite.dbReadMovie();
        
        customers = DBReadWrite.dbReadCust();
        
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

        
	
        MainFrame mf = new MainFrame(movies,customers);
        
		
	}

	public MainFrame(ArrayList<Movie> Movies, ArrayList<Customer> customers) {
		allMovies = Movies;
		allCustomers = customers;
		setTitle("     \u0394\u03B9\u03B1\u03C7\u03B5\u03AF\u03C1\u03B9\u03C3\u03B7 Movie Club");
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		
		modelForMovies = new DefaultListModel();
		for (Movie aMovie: allMovies)
			modelForMovies.addElement(aMovie.getMovieTitle());
		
		modelForCustomers = new DefaultListModel();
		for (Customer aCustomer: allCustomers)
			modelForCustomers.addElement(aCustomer.getLastName() + " " + aCustomer.firstName);
		
		
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton btnMovieDelete = new JButton("\u0394\u03B9\u03B1\u03B3\u03C1\u03B1\u03C6\u03AE \u03A4\u03B1\u03B9\u03BD\u03AF\u03B1\u03C2");
		btnMovieDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});

		
		JLabel label = new JLabel("");
		label.setBounds(120, 108, 0, 0);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(48, 43, 195, 150);
		
		JList movieList = new JList();
		movieList.setVisibleRowCount(10);
		movieList.setModel(modelForMovies);   
		scrollPane.setViewportView(movieList);
		
		// Διαγραφή ταινίας
		btnMovieDelete.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				String movieName = (String) movieList.getSelectedValue();
				
				for (Movie theMovie: allMovies)
				{
					String movieTitle = theMovie.getMovieTitle();
					if ( movieTitle.equals(movieName))
					{

						allMovies.remove(theMovie);
						refreshMovieList(movieList);
						
						DBReadWrite.dbWriteMovie(allMovies);
						JOptionPane.showMessageDialog(null, "Επιτυχής διαγραφή ταινίας");
						break;
					}
				}
				
			}


		});
		btnMovieDelete.setBounds(70, 235, 148, 23);
		
		
		contentPane.setLayout(null);
		contentPane.add(btnMovieDelete);
		contentPane.add(label);
		contentPane.add(scrollPane);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(372, 43, 195, 150);
		contentPane.add(scrollPane_1);
		
		JList customerList = new JList();
		customerList.setVisibleRowCount(10);
		customerList.setModel(modelForCustomers);
		scrollPane_1.setViewportView(customerList);
		
		JButton btnDelCustomer = new JButton("\u0394\u03B9\u03B1\u03B3\u03C1\u03B1\u03C6\u03AE  \u03A0\u03B5\u03BB\u03AC\u03C4\u03B7");
		btnDelCustomer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnDelCustomer.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				String custListName = (String) customerList.getSelectedValue();
				
				
	//			String movieName = (String) list.getSelectedValue();
				
				for (Customer theCustomer: allCustomers)
				{
					String customerName = theCustomer.lastName + " " + theCustomer.firstName;
					if ( customerName.equals(custListName))
					{

						allCustomers.remove(theCustomer);
						refreshCustomerList(customerList);
						
						DBReadWrite.dbWriteCust(allCustomers);
						JOptionPane.showMessageDialog(null, "Επιτυχής διαγραφή πελάτη");
						
						break;
					}
				}
			}
		});
		btnDelCustomer.setBounds(392, 266, 156, 23);
		contentPane.add(btnDelCustomer);
		contentPane.add(scrollPane_1);
		
		JButton rentalsButton = new JButton("Ενοικιάσεις");
		rentalsButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});

		rentalsButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String id = (String) customerList.getSelectedValue();
				new CustomerRentalsGUI(customers, id);
			}
		});
		rentalsButton.setBounds(231, 349, 156, 23);
		contentPane.add(rentalsButton);
		
		JButton btnNewButton = new JButton("\u03A0\u03C1\u03BF\u03C3\u03B8\u03AE\u03BA\u03B7 \u03A0\u03B5\u03BB\u03AC\u03C4\u03B7");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new AddCustomerGUI(allCustomers);
			}
		});
		btnNewButton.setBounds(392, 235, 156, 23);
		contentPane.add(btnNewButton);
		
		JButton button_1 = new JButton("\u0391\u03BD\u03B1\u03BD\u03AD\u03C9\u03C3\u03B7");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				refreshMovieList(movieList);	
				refreshCustomerList(customerList);
							
				
			}
		});
		button_1.setBounds(253, 110, 107, 23);
		contentPane.add(button_1);
		
		JButton btnWriteMovie = new JButton("\u03A0\u03C1\u03BF\u03C3\u03B8\u03AE\u03BA\u03B7 \u03A4\u03B1\u03B9\u03BD\u03AF\u03B1\u03C2");
		btnWriteMovie.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new AddMovieGUI(allMovies);
				
			}
		});
		btnWriteMovie.setBounds(70, 204, 148, 23);
		contentPane.add(btnWriteMovie);
		
		JButton newRentalButton = new JButton("\u039D\u03AD\u03B1 \u0395\u03BD\u03BF\u03B9\u03BA\u03AF\u03B1\u03C3\u03B7");
		newRentalButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Movie foundMovie = null;
				Customer foundCustomer = null;
				String custListName = (String) customerList.getSelectedValue();

				for (Customer theCustomer: allCustomers)
				{
					String customerName = theCustomer.lastName + " " + theCustomer.firstName;
					if ( customerName.equals(custListName))
					{
						foundCustomer = theCustomer;					
						break;
					}
				}
				
				String movieName = (String) movieList.getSelectedValue();
				
				for (Movie theMovie: allMovies)
				{
					String movieTitle = theMovie.getMovieTitle();
					if ( movieTitle.equals(movieName))
					{
						foundMovie = theMovie;
						break;
					}
				}
				
				int day = Integer.parseInt(dayTextField.getText());	
				int month = Integer.parseInt(monthTextField.getText());	
				int year = Integer.parseInt(yearTextField.getText());
				
				month = month + 1;
				
				Date rentalDate = new Date(year, month, day);
				
				Rental newRental = new Rental(foundMovie, rentalDate);
				foundCustomer.addRental(newRental);
				DBReadWrite.dbWriteCust(customers);
				DBReadWrite.dbReadCust();
				JOptionPane.showMessageDialog(null, "Επιτυχής ενοικίαση ταινίας");
			
			}
		});
		newRentalButton.setBounds(52, 349, 156, 23);
		contentPane.add(newRentalButton);
		
		dayTextField = new JTextField();
		dayTextField.setBounds(226, 406, 33, 20);
		contentPane.add(dayTextField);
		dayTextField.setColumns(10);
		
		JLabel label_1 = new JLabel("/");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_1.setBounds(330, 407, 8, 20);
		contentPane.add(label_1);
		
		monthTextField = new JTextField();
		monthTextField.setColumns(10);
		monthTextField.setBounds(287, 407, 33, 20);
		contentPane.add(monthTextField);
		
		yearTextField = new JTextField();
		yearTextField.setColumns(10);
		yearTextField.setBounds(349, 407, 33, 20);
		contentPane.add(yearTextField);
		
		JLabel label_2 = new JLabel("/");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_2.setBounds(269, 407, 8, 20);
		contentPane.add(label_2);
		
		JButton calcAmountButton = new JButton("\u039A\u03CC\u03C3\u03C4\u03BF\u03C2 \u0395\u03BD\u03BF\u03B9\u03BA\u03AF\u03B1\u03C3\u03B7\u03C2");
		calcAmountButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				Customer foundCustomer = null;
				String custListName = (String) customerList.getSelectedValue();

				for (Customer theCustomer: allCustomers)
				{
					String customerName = theCustomer.lastName + " " + theCustomer.firstName;
					if ( customerName.equals(custListName))
					{
						foundCustomer = theCustomer;					
						break;
					}
				}
				
				
				
				int day = Integer.parseInt(dayTextField.getText());	
				int month = Integer.parseInt(monthTextField.getText());	
				int year = Integer.parseInt(yearTextField.getText());
				
				month = month + 1;
				
				Date returnDate = new Date(year, month, day);
				
							
				Enumeration<Rental> Rentals = foundCustomer.rentals.elements();
	    		String result = "";
	    		int sumAmount = 0;
	    		while(Rentals.hasMoreElements()) {
	    			Rental each = (Rental) Rentals.nextElement();
	    			
	    			int days = (each.calcRentalDays(each.getRentalDate(), returnDate));
	    			
	    			result += each.getMovie().getMovieTitle() + " --> ";
	    			
	    			if(days > 0)
	    				result += "Ημέρες ενοικίασης: " + days + ", ";
	    			else
	    				result += "Ημέρες ενοικίασης: 0, ";
	    			
	    			
	    			if(days > 2)
	    				result += "Ημέρες καθυστέρησης: " + (days - 2) + ", " +	
	    						  "Κόστος ενοικίασης: " + each.getRentAmount() + "€\n" ;
	    			else
	    				result += "Ημέρες καθυστέρησης: " + "0" + ", " + 
	    						  "Κόστος ενοικίασης: " + each.getRentAmount() + "€\n" ;

	    			
	    			sumAmount += each.getRentAmount();
	    			days = 0;
	    		}
	    		
	    		result += "\nΣΥΝΟΛΟ = " + sumAmount + "€";
	    		
	    		new ShowAmountGUI(result);
			}
			});
		calcAmountButton.setBounds(411, 349, 156, 23);
		contentPane.add(calcAmountButton);
		
		JLabel label_3 = new JLabel("  \u0397");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_3.setBounds(226, 429, 33, 20);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("  \u039C");
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_4.setBounds(287, 430, 33, 20);
		contentPane.add(label_4);
		
		JLabel lblE = new JLabel("  E");
		lblE.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblE.setBounds(349, 430, 33, 20);
		contentPane.add(lblE);
		
		JLabel label_6 = new JLabel("      \u03A4\u0391\u0399\u039D\u0399\u0395\u03A3");
		label_6.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_6.setBounds(87, 22, 120, 20);
		contentPane.add(label_6);
		
		JLabel label_7 = new JLabel("     \u03A0\u0395\u039B\u0391\u03A4\u0395\u03A3");
		label_7.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_7.setBounds(411, 22, 110, 20);
		contentPane.add(label_7);
		
		JLabel label_8 = new JLabel("\u0395\u03B9\u03C3\u03B1\u03B3\u03C9\u03B3\u03AE \u0397\u03BC/\u03BD\u03AF\u03B1\u03C2 \u0395\u03BD\u03BF\u03B9\u03BA\u03AF\u03B1\u03C3\u03B7\u03C2/\u0395\u03C0\u03B9\u03C3\u03C4\u03C1\u03BF\u03C6\u03AE\u03C2 \u03C4\u03B7\u03C2 \u03A4\u03B1\u03B9\u03BD\u03AF\u03B1\u03C2");
		label_8.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_8.setBounds(155, 383, 296, 20);
		contentPane.add(label_8);
		
		JButton customerInfoButton = new JButton("\u03A3\u03C4\u03BF\u03B9\u03C7\u03B5\u03AF\u03B1 \u03A0\u03B5\u03BB\u03AC\u03C4\u03B7");
		customerInfoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Customer foundCustomer = null;
				String custListName = (String) customerList.getSelectedValue();

				for (Customer theCustomer: allCustomers)
				{
					String customerName = theCustomer.lastName + " " + theCustomer.firstName;
					if ( customerName.equals(custListName))
					{
						foundCustomer = theCustomer;					
						break;
					}
				}
				

				new CustomerInfoGUI(foundCustomer);
				
				
			}
		});
		customerInfoButton.setBounds(392, 204, 156, 23);
		contentPane.add(customerInfoButton);
		
		textField = new JTextField();
		textField.setBackground(Color.LIGHT_GRAY);
		textField.setBounds(0, 322, 603, 6);
		contentPane.add(textField);
		textField.setColumns(10);
		
		
		
		
		
		this.setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 100, 619, 500);
	}

	/**
	 * @param list_1
	 */
	public void refreshCustomerList(JList list_1) {
		modelForCustomers = new DefaultListModel();
		for (Customer aCustomer: allCustomers)
			modelForCustomers.addElement(aCustomer.getLastName() + " " + aCustomer.firstName);
		list_1.setModel(modelForCustomers);
	}

	/**
	 * @param list
	 */
	public void refreshMovieList(JList list) {
		modelForMovies = new DefaultListModel();
		for (Movie aMovie: allMovies)
			modelForMovies.addElement(aMovie.getMovieTitle());
		
		list.setModel(modelForMovies);
	}
}