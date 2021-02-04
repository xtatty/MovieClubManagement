import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;


public class ShowAmountGUI extends JFrame {

	private JPanel contentPane;
	private JTextField amountTextField;

	/**
	 * Launch the application.
	 */
/*	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ShowAmountGUI frame = new ShowAmountGUI();
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
	public ShowAmountGUI(String result) {
		this.setVisible(true);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		amountTextField = new JTextField();
		amountTextField.setBounds(80, 37, 245, 56);
		contentPane.add(amountTextField);
		amountTextField.setColumns(10);
		amountTextField.setText(result);
		
		
		JLabel label = new JLabel("\u03A3\u03C5\u03BD\u03BF\u03BB\u03B9\u03BA\u03CC \u039A\u03CC\u03C3\u03C4\u03BF\u03C2");
		label.setBounds(139, 11, 98, 14);
		contentPane.add(label);
		
		
	}

}
