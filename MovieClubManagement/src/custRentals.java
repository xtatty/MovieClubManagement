import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.DropMode;
import java.awt.Color;


public class custRentals extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

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
	public custRentals(ArrayList<Customer> customers, String acustomer) {
		setTitle("\u03A4\u03C1\u03AD\u03C7\u03BF\u03C5\u03C3\u03B5\u03C2 \u0395\u03BD\u03BF\u03B9\u03BA\u03B9\u03AC\u03C3\u03B5\u03B9\u03C2 \u03A0\u03B5\u03BB\u03AC\u03C4\u03B7");
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		//textField.setDropMode(DropMode.ON);
		textField.setColumns(2);
		textField.setBounds(10, 35, 617, 55);
		contentPane.add(textField);
	//	textField.setColumns(10);
		
		for (Customer theCustomer: customers)
		{
			String custName = theCustomer.getLastName()+" " + theCustomer.firstName;
			if ( custName.equals(acustomer))
			{

			//	textField.setText(custName);
				textField.setText(theCustomer.getRentals());
				break;
			}
		}
		
		this.setVisible(true);
	//	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 653, 169);
		

	}
}
