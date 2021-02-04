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
import java.awt.Color;


public class AddMovieGUI extends JFrame {

	private JPanel contentPane;
	private JTextField IDtextField;
	private JLabel lblId;
	private JTextField FirstNameTextField;
	private JTextField LastNameTextField;
	private JLabel label;
	private JLabel lblNewLabel;

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
	public AddMovieGUI(ArrayList<Movie> movies) {

		this.setVisible(true);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		


		
		IDtextField = new JTextField();
		IDtextField.setBounds(206, 39, 147, 20);
		contentPane.add(IDtextField);
		IDtextField.setColumns(10);
		
		lblId = new JLabel("ID");
		lblId.setBounds(150, 42, 46, 14);
		contentPane.add(lblId);
		
		FirstNameTextField = new JTextField();
		FirstNameTextField.setBounds(206, 82, 147, 20);
		contentPane.add(FirstNameTextField);
		FirstNameTextField.setColumns(10);
		
		LastNameTextField = new JTextField();
		LastNameTextField.setBounds(206, 121, 147, 20);
		contentPane.add(LastNameTextField);
		LastNameTextField.setColumns(10);
		
		label = new JLabel("\u03A4\u03AF\u03C4\u03BB\u03BF\u03C2");
		label.setBounds(150, 85, 46, 14);
		contentPane.add(label);
		
		lblNewLabel = new JLabel("Rating");
		lblNewLabel.setBounds(150, 127, 46, 14);
		contentPane.add(lblNewLabel);
		
		JButton button = new JButton("\u0395\u03B9\u03C3\u03B1\u03B3\u03C9\u03B3\u03AE");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				int movieId = Integer.parseInt(IDtextField.getText());
				String movieTitle = FirstNameTextField.getText();
				String rating = LastNameTextField.getText();
				
				
				Movie aMovie = new Movie(movieId, movieTitle, rating);
				
				movies.add(aMovie);
				
				DBReadWrite.dbWriteMovie(movies);
				

			}
		});
		button.setBounds(220, 175, 117, 23);
		contentPane.add(button);
		

		
	//	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
	}
}
