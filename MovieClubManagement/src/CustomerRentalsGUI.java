import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.Font;


public class CustomerRentalsGUI extends JFrame {

	

	/**
	 * Launch the application.
	 */
/*	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CustomerRentalsGUI frame = new CustomerRentalsGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the frame.
	 */
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
/*	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					custRentals frame = new custRentals();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the frame.
	 */
	public CustomerRentalsGUI(ArrayList<Customer> customers, String acustomer) {
		setTitle("\u03A4\u03C1\u03AD\u03C7\u03BF\u03C5\u03C3\u03B5\u03C2 \u0395\u03BD\u03BF\u03B9\u03BA\u03B9\u03AC\u03C3\u03B5\u03B9\u03C2 \u03A0\u03B5\u03BB\u03AC\u03C4\u03B7");
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("\u03A4\u0399\u03A4\u039B\u039F\u0399 \u03A4\u0391\u0399\u039D\u0399\u03A9\u039D");
		label.setFont(new Font("Tahoma", Font.BOLD, 12));
		label.setForeground(Color.BLACK);
		label.setBounds(167, 11, 107, 24);
		contentPane.add(label);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(30, 46, 383, 135);
		contentPane.add(scrollPane);
		
		JTextArea custRentalsTextArea = new JTextArea();
		custRentalsTextArea.setEditable(false);
		scrollPane.setViewportView(custRentalsTextArea);
	//	textField.setColumns(10);
		
		for (Customer theCustomer: customers)
		{
			String custName = theCustomer.getLastName() + " " + theCustomer.firstName;
			if ( custName.equals(acustomer))
			{
				custRentalsTextArea.setText(theCustomer.getRentals());
				break;
			}
		}
		
		this.setVisible(true);
		setBounds(100, 100, 461, 230);
		

	}
}
