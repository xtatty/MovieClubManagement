import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class AddCustomerGUI extends JFrame {

	private JPanel contentPane;
	private JTextField IDtextField;
	private JLabel lblId;
	private JTextField FirstNameTextField;
	private JTextField LastNameTextField;
	private JTextField ContactTextField;
	private JLabel label;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;

	/**
	 * Launch the application.
	 */
/*	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddCustomerGUI frame = new AddCustomerGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
*/
	/**
	 * Create the frame.
	 */
	public AddCustomerGUI(ArrayList<Customer> customers) {

		this.setVisible(true);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		


		
		IDtextField = new JTextField();
		IDtextField.setBounds(237, 39, 86, 20);
		contentPane.add(IDtextField);
		IDtextField.setColumns(10);
		
		lblId = new JLabel("ID");
		lblId.setBounds(150, 42, 46, 14);
		contentPane.add(lblId);
		
		FirstNameTextField = new JTextField();
		FirstNameTextField.setBounds(237, 82, 86, 20);
		contentPane.add(FirstNameTextField);
		FirstNameTextField.setColumns(10);
		
		LastNameTextField = new JTextField();
		LastNameTextField.setBounds(237, 121, 86, 20);
		contentPane.add(LastNameTextField);
		LastNameTextField.setColumns(10);
		
		ContactTextField = new JTextField();
		ContactTextField.setBounds(237, 166, 86, 20);
		contentPane.add(ContactTextField);
		ContactTextField.setColumns(10);
		
		label = new JLabel("\u038C\u03BD\u03BF\u03BC\u03B1");
		label.setBounds(150, 85, 46, 14);
		contentPane.add(label);
		
		lblNewLabel = new JLabel("\u0395\u03C0\u03CE\u03BD\u03C5\u03BC\u03BF");
		lblNewLabel.setBounds(150, 127, 46, 14);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("\u03A4\u03B7\u03BB\u03AD\u03C6\u03C9\u03BD\u03BF");
		lblNewLabel_1.setBounds(150, 169, 57, 14);
		contentPane.add(lblNewLabel_1);
		
		JButton button = new JButton("\u0395\u03B9\u03C3\u03B1\u03B3\u03C9\u03B3\u03AE");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				int id = Integer.parseInt(IDtextField.getText());
				String FirstName = FirstNameTextField.getText();
				String LastName = LastNameTextField.getText();
				String TelNumber = ContactTextField.getText();
				
				Customer aCustomer = new Customer(FirstName, LastName, TelNumber, null);
				
				customers.add(aCustomer);
				
				DBReadWrite.dbWriteCust(customers);
				
				
				// refreshCustJList();

				
				
				
				
			}
		});
		button.setBounds(175, 211, 89, 23);
		contentPane.add(button);
		
		
		
		
		
		
		
		
		
		
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
	}
}
