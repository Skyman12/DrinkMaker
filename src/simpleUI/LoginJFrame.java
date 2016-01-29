package simpleUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

public class LoginJFrame {

	private JFrame frame;
	private JTextField userTextField;
	private JTextField passwordTextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginJFrame window = new LoginJFrame();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LoginJFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 900, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		userTextField = new JTextField();
		userTextField.setBounds(133, 36, 116, 22);
		frame.getContentPane().add(userTextField);
		userTextField.setColumns(10);
		
		passwordTextField = new JTextField();
		passwordTextField.setBounds(133, 70, 116, 22);
		frame.getContentPane().add(passwordTextField);
		passwordTextField.setColumns(10);
		
		JLabel userJLabel = new JLabel("User");
		userJLabel.setBounds(66, 39, 56, 16);
		frame.getContentPane().add(userJLabel);
		
		JLabel passwordJLabel = new JLabel("Password");
		passwordJLabel.setBounds(66, 73, 56, 16);
		frame.getContentPane().add(passwordJLabel);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setBounds(140, 135, 97, 25);
		frame.getContentPane().add(btnLogin);
	}
}
