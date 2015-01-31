import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.DropMode;


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
		contentPane = new JPanel();
		
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		//textField.setDropMode(DropMode.ON);
		textField.setColumns(2);
		textField.setBounds(98, 18, 262, 98);
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
		setBounds(100, 100, 450, 300);
		

	}
}
