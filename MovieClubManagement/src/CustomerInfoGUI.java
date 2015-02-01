import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;


public class CustomerInfoGUI extends JFrame {

	private JPanel contentPane;
	private JTextField IDtextField;
	private JLabel lblId;
	private JTextField FirstNameTextField;
	private JTextField ContactTextField;
	private JLabel label;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JTextField lastNameTextField;

	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 */

	
	
	public CustomerInfoGUI(Customer aCustomer) {
		setTitle("\u03A3\u03C4\u03BF\u03B9\u03C7\u03B5\u03AF\u03B1 \u03A0\u03B5\u03BB\u03AC\u03C4\u03B7");

		this.setVisible(true);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		


		
		IDtextField = new JTextField();
		IDtextField.setEditable(false);
		IDtextField.setBounds(217, 39, 136, 20);
		contentPane.add(IDtextField);
		IDtextField.setColumns(10);
		IDtextField.setText(Integer.toString(aCustomer.getId()));
		
		lblId = new JLabel("ID");
		lblId.setBounds(130, 42, 77, 14);
		contentPane.add(lblId);
		
		FirstNameTextField = new JTextField();
		FirstNameTextField.setEditable(false);
		FirstNameTextField.setBounds(217, 82, 136, 20);
		contentPane.add(FirstNameTextField);
		FirstNameTextField.setColumns(10);
		FirstNameTextField.setText(aCustomer.getFirstName());
		
		ContactTextField = new JTextField();
		ContactTextField.setEditable(false);
		ContactTextField.setBounds(217, 166, 136, 20);
		contentPane.add(ContactTextField);
		ContactTextField.setColumns(10);
		ContactTextField.setText(aCustomer.getContactInfo());
		
		label = new JLabel("\u038C\u03BD\u03BF\u03BC\u03B1");
		label.setBounds(130, 85, 77, 14);
		contentPane.add(label);
		
		lblNewLabel = new JLabel("\u0395\u03C0\u03CE\u03BD\u03C5\u03BC\u03BF");
		lblNewLabel.setBounds(130, 127, 77, 14);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("\u03A4\u03B7\u03BB\u03AD\u03C6\u03C9\u03BD\u03BF");
		lblNewLabel_1.setBounds(130, 169, 77, 14);
		contentPane.add(lblNewLabel_1);
		
		lastNameTextField = new JTextField();
		lastNameTextField.setText("<dynamic>");
		lastNameTextField.setEditable(false);
		lastNameTextField.setColumns(10);
		lastNameTextField.setBounds(217, 124, 136, 20);
		contentPane.add(lastNameTextField);
		lastNameTextField.setText(aCustomer.getLastName());
		

		
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 256);
		
	}
}
