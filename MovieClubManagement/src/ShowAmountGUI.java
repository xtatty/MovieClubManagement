import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


public class ShowAmountGUI extends JFrame {

	private JPanel contentPane;
	private JScrollPane scrollPane;
	private JTextArea amountTextArea;

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
		setBounds(100, 100, 490, 262);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JLabel label = new JLabel("\u03A3\u03C5\u03BD\u03BF\u03BB\u03B9\u03BA\u03CC \u039A\u03CC\u03C3\u03C4\u03BF\u03C2");
		label.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label.setBounds(156, 10, 143, 22);
		contentPane.add(label);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 43, 454, 170);
		contentPane.add(scrollPane);
		
		amountTextArea = new JTextArea();
		scrollPane.setViewportView(amountTextArea);
		amountTextArea.setText(result);
		
		
	}

}
